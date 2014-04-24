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
