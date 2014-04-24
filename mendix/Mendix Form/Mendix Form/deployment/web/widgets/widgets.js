dojo.provide("widgets.widgets");
dojo.registerModulePath("loginsystem", "../../widgets/loginsystem");
dojo.provide("loginsystem.widget.LoginForm");
dojo.require("loginsystem.widget.FormInput");

mendix.widget.declare("loginsystem.widget.LoginForm", {
	addons			: [ dijit._Templated ],
	inputargs 		: {
		userexample	: "Username",
		passexample	: "Password",
		logintext	: "Login",
		checktext	: "Automatically login",
		showcheck	: false,
		dofocus		: false,
		forgottext	: "",
		forgotmf	: "",
		showforgot	: false,
		progresstext : "",
		showprogress : false,
        emptytext    : "No username or password given"
	},
	baseClass		: "loginsystemLoginForm",
	templateString 	: '<form class="${baseClass}" dojoAttachPoint="loginForm"><div class="${baseClass}_messagePane"><span class="${baseClass}_messageNode" dojoAttachPoint="messageNode">&nbsp;</span></div><div class="${baseClass}_formane"><input type="text" class="${baseClass}_usernameInput" dojoAttachPoint="usernameInput" /><input type="password" class="${baseClass}_passwordInput" dojoAttachPoint="passwordInput" /><input type="submit" class="${baseClass}_submitButton" dojoAttachPoint="submitButton" /></div><div class="${baseClass}_checkPane"><div class="${baseClass}_forgotPwd" dojoAttachPoint="forgotPane"><a class="${baseClass}_forgotLink" href="#" dojoAttachPoint="forgotLink"></a></div><div class="${baseClass}_autoSignin" dojoAttachPoint="checkPane"><input type="checkbox" class="${baseClass}_checkboxInput" dojoAttachPoint="checkboxInput" /><label class="${baseClass}_checkboxLabel" dojoAttachPoint="checkboxText"></label></div></div></form>',
	
	loginConnects 	: null,
	
	userInput 		: null,
	passInput 		: null,

	indicator		: null,
	i18nmap			: null,

	postCreate : function() {
		logger.debug(this.id + ".postCreate");
		
		this.submitButton.value = this.logintext;
		this.checkboxText.innerHTML = this.checktext;
		
		!this.showcheck && mendix.dom.hide(this.checkPane);
		
		if(this.showforgot) {
			this.forgotLink.innerHTML = this.forgottext;
			this.connect(this.forgotLink, "click", "forgotPwd");
		} else {
			mendix.dom.hide(this.forgotPane);
		}

		this.userInput = new loginsystem.widget.FormInput({ node: this.usernameInput, text: this.userexample });
		this.passInput = new loginsystem.widget.FormInput({ node: this.passwordInput, text: this.passexample });
		
		//this.connect(this.usernameInput, "onkeyup", "onKeyUp");
		//this.connect(this.passwordInput, "onkeyup", "onKeyUp");
		//this.connect(this.submitButton, "onclick", "submitForm");
        this.connect(this.loginForm, "onsubmit", "submitForm");
		
		this.getI18NMap();

		if (this.showprogress) {
			this.indicator = mx.ui.getProgressIndicator("modal", this.progresstext);
		}		
		
		this.dofocus && this.focusNode();
		
		this.loaded();
	},
	
	onKeyUp : function(e) {
		logger.debug(this.id + ".onKeyUp");
		
		if(e.keyCode == dojo.keys.ENTER){
			this.submitForm(e);
		}
	},
	
	submitForm : function(e) {
		logger.debug(this.id + ".submitForm");
		
		var user = this.userInput.getValue();
		var pass = this.passInput.getValue();

		if(user && pass) {
			this.indicator && this.indicator.start();
			
			dojo.rawXhrPost({
				url			: 'xas/',
				mimetype	: "application/json",
				contentType	: "application/json",
				handleAs	: "json",
				postData	: dojo.toJson({
					action		: "login",
					params		: {
						username	: user,
						password	: pass,
						locale		: ""
					}
				}),
				handle		: dojo.hitch(this, "validate")
			});
		} else {
            this.messageNode.innerHTML = this.emptytext; 
        }

		dojo.stopEvent(e);
        return false;
	},
	
	validate : function(response, ioArgs) {
		logger.debug(this.id + ".validate");
		
		this.indicator && this.indicator.stop();

		dojo.cookie("EXTENDCOOKIE", this.checkboxInput.checked, { expires: 365 });

		var i18nmap = this.i18nmap;
		var span = this.messageNode;

		switch(ioArgs.xhr.status) {
			case 200 :
				mendix.widget.hideTooltip();
				mx.login();
				break;
			case 400 :
			case 401 :
			case 402 :
			case 403 :
				span.innerHTML = i18nmap.http401;
				break;
			case 404 :
				span.innerHTML = i18nmap.http404;
				break;
			case 500 :
				span.innerHTML = i18nmap.http500;
				break;
			case 503 :
				span.innerHTML = i18nmap.http503;
				break;
			default :
				span.innerHTML = i18nmap.httpdefault;
				break;
		}
	},

	forgotPwd : function(e) {
		logger.debug(this.id + ".forgotPwd");

		var action = this.forgotmf;
		
		if(action) {
			mx.xas.action({
				actionname	: action,
				callback	: function() {
					// ok	
				},
				error		: function() {
					logger.error(this.id + ".forgotPwd: Error while calling microflow");
				}
			});
		}
		
		dojo.stopEvent(e);
	},
	
	getI18NMap : function() {
		logger.debug(this.id + ".injectI18NMap");
		
		if (!window.i18n) {
			dojo.xhrGet({
				url			: "ui/js/login_i18n.js",
				handleAs	: "javascript",
				sync		: true
			});
		}

		var map = window.i18n.login;
		var locale = dojo.config.defaultLocale || window.i18n.defaultLocale;		

		for (var lang in map) {
			if (lang.match(locale)) {
				this.i18nmap = map[lang];
				break;
			}
		}
	},
	
	focusNode : function() {
		logger.debug(this.id + ".focusNode");
		
		setTimeout(dojo.hitch(this, function() {
			this.usernameInput.focus();
		}), 0);
	},
	
	uninitialize : function() {
		logger.debug(this.id + ".uninitialize");
	}
});
;
dojo.registerModulePath("loginsystem", "../../widgets/loginsystem");
dojo.provide("loginsystem.widget.LoginButton");

mendix.widget.declare("loginsystem.widget.LoginButton", {
	superclass		: mendix.widget._Button,
	inputargs 		: {
		caption		: "",
		microflow	: "",
		username	: "",
		password	: "",
		progresstext : "",
		showprogress : false
	},

	type			: "button",
	sourceObject	: null,

	indicator		: null,	

	postCreate : function() {
		logger.debug(this.id + ".postCreate");
		
		this.action = dojo.hitch(this, "click");

		this.inherited(arguments);

		if (this.showprogress) {
			this.indicator = mx.ui.getProgressIndicator("modal", this.progresstext);
		}				
		
		this.loaded();
	},

	applyContext : function(context, callback) {
		logger.debug(this.id + ".applyContext");
		
		var trackId = context && context.getTrackID();
		
		if (trackId) {
			mx.processor.get({
				guid		: trackId,
				callback	: dojo.hitch(this, function(obj) {
					this.sourceObject = obj;
				})
			});
		} else {
			this.sourceObject = null;	
		}
		
		callback && callback();
	},

	click : function(e) {
		logger.debug(this.id + ".click");

		var mf = this.microflow;
		var obj = this.sourceObject;
		var user = obj.getAttribute(this.username);
		var pass = obj.getAttribute(this.password);

		if(!obj) {
			logger.error(this.id + ".click: No object in context");
		} else if(!user || !pass) {
			logger.error(this.id + ".login: Empty username or password");
		} else {
			if (mf) {
				if (this.indicator) {
					this.indicator.start();
					this.indicator._visible = true;
				}

				var context = mx.ui.newContext();
				context.setContext(obj.getClass(), obj.getGUID());
				
				mx.xas.action({
					actionname	: mf,
					context		: context,
					callback	: dojo.hitch(this, function() {
						this.login(user, pass);	
					}),
					error		: dojo.hitch(this, function() {
						logger.error(this.id + ".click: Microflow invocation failed");
						
						if (this.indicator) {
							this.indicator.stop();
						}
					})
				})
				
				mx.ui.destroyContext(context);
			} else {
				this.login(user, pass);
			}
		}
	},
	
	login : function(user, pass) {
		logger.debug(this.id + ".login");
		
		if (this.indicator && !this.indicator._visible) {
			this.indicator.start();
		}

		dojo.rawXhrPost({
			url			: 'xas/',
			mimetype	: "application/json",
			contentType	: "application/json",
			handleAs	: "json",
			postData	: dojo.toJson({
				action		: "login",
				params		: {
					username	: user,
					password	: pass,
					locale		: ""
				}
			}),
			handle		: dojo.hitch(this, "validate")
		});
	},
	
	validate : function(response, ioArgs) {
		logger.debug(this.id + ".validate");

		if (this.indicator) {
			this.indicator.stop();
			this.indicator._visible = false;
		}
		
		if(ioArgs.xhr.status == 200) {
			mendix.widget.hideTooltip();
			mx.login();
		} else {
			logger.error(this.id + ".validate: Login failed");
		}
	},
	
	uninitialize : function() {
		logger.debug(this.id + ".uninitialize");

	}
});
;
