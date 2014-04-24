window.runner = new (function(){

	var xhr            = null;
	var currentI18nMap = null;

	var loginForm      = null;
	var usernameLabel  = null;
	var passwordLabel  = null;
	var submitButton   = null;


    // escapeString from dojo._base.json
	var escapeString = function(/*String*/str){
		return ('"' + str.replace(/(["\\])/g, '\\$1') + '"'
			).replace(/[\f]/g, "\\f"
			).replace(/[\b]/g, "\\b"
			).replace(/[\n]/g, "\\n"
			).replace(/[\t]/g, "\\t"
			).replace(/[\r]/g, "\\r"); // string
	}

	var getJson  = function(){
		var username = loginForm.username.value;
		var password = loginForm.password.value;
		var json     = null;

		if (currentI18nMap && currentI18nMap.locale) {
			json = "{'action':'login','params':{'username':" + escapeString(username) + ",'password':" + escapeString(password) + ", 'locale':" + "'" + currentI18nMap.locale + "'}}";
		} else {
			json = "{'action':'login','params':{'username':" + escapeString(username) + ",'password':" + escapeString(password) + "}}";
		}

		return json;
	}

	var setResult = function(str){
		var result = document.getElementById("result");
		result.innerHTML = str ? str : '';
	}

	var onKeyDown = function(){
		setResult('');
		return true;
	}

	var handler = function() {
		submitButton.disabled = true;

		if(!loginForm){ alert('Sorry no login form defined'); return; }



		var json = getJson();

		xhr.open( "POST", 'xas/' , true);
		xhr.setRequestHeader("Content-type", "application/json");
		xhr.setRequestHeader("Content-length", json.length);
		xhr.setRequestHeader("Connection", "close");

		xhr.onreadystatechange = function() {
				if (xhr.readyState == 4) {
					var txt = '';
					switch (xhr.status) {
						case 200: 
							submitButton.onmouseup       = null;
							loginForm.onsubmit           = null;
							loginForm.username.onkeydown = null;
							loginForm.password.onkeydown = null;
							setResult(currentI18nMap.http200);
// Log in: 
// index.html(form)  -> (log in) -> index3.html(client) 
// login.html(form)   -> (log in) -> index.html (client) 

// Log out:
// index3.html(client) -> (log out) -> index.html(form)
// index.html(client)  -> (log out) -> login.html(form)
// 
							
							var url = String(window.location);
                            if (url.match('login.html')) {
								location.replace('index.html');
                            } else {
								location.replace('index3.html');
							}
//							var response_obj = eval('(' + xhr.responseText + ')');
//							if (response_obj.redirect) {
//								location.replace(response_obj.redirect);
//							} else {
//								// fallback to default behaviour
//								location.replace('index2.html');
//							}
							return;
						case 400 :
						case 401 :
						case 403 :
							txt = currentI18nMap.http401 ? currentI18nMap.http401 : currentI18nMap.http400;
							break;
                        case 402 :
                            txt = currentI18nMap.http402;
                            break;
						case 404 :
							txt = currentI18nMap.http404;
							break;
						case 500 :
							txt = currentI18nMap.http500;
							break;
						case 503 :
							txt = currentI18nMap.http503;
							break;
						default :
							txt = currentI18nMap.httpdefault;
							break;
					}

					setResult(txt);
					submitButton.disabled = false;
				}
		}

		xhr.send(json);

		return false;
	}

	this.start = function(){
		xhr = (function() {
			if (typeof XMLHttpRequest != "undefined") {
					return new XMLHttpRequest();
			} else if (typeof ActiveXObject != "undefined") {
					return new ActiveXObject("Microsoft.XMLHTTP");
			} else {
					throw new Error("XMLHttpRequest not supported");
			}
		})();

		loginForm    = document.getElementById("login");

		//
		// enabling message form
		//

		var jsCheck      = document.getElementById("jscheck");
		jsCheck.parentNode.removeChild(jsCheck);
		//loginForm.setAttribute("style", "");
		loginForm.style.display = 'block';
		
		//
		// get submit button
		//

		submitButton = document.getElementById("submit");

		//
		// translating form
		//
		if(window.i18nmap!=null){
			//for old situations
			currentI18nMap = i18nmap;
		}else if(window.i18n!=null){
			// when xas generates this stuff
			currentI18nMap = i18n.defaultLocale!=null && i18n.login[i18n.defaultLocale] ? i18n.login[i18n.defaultLocale] : i18n.login.en;
		}

		this.translate();

		//
		// setting handlers
		//

		loginForm.onsubmit           = handler;
		loginForm.username.onkeydown = onKeyDown;
		loginForm.password.onkeydown = onKeyDown;

		loginForm.username.focus();
	}

	this.translate = function(){
		if(currentI18nMap==null){ return; }

		var labels = document.getElementsByTagName("label");
		for(var i=0;i<labels.length;i++){
			var label     = labels[i];
			var target_id = label.getAttribute("for");

			//
			// IE beauty:
			// appears that getAttribute("for"); for attribute "for" in label return NULL
			// well, okey what ever we can check if it's there by 
			// going through attributes collection like this
			// for(var i=0;i < attribute.length;i++){ (code) }
			// But this way, the IE SHIT gives us EIGHTY attributes of "language" of some other crap
			// STILL NO "for" 
			// it appears, that attributes collection in IE is an ARRAY AND hashMAP
			// WOW
			// label.attributes['for'] does work!!!! 
			//
			
			if(target_id==null){ target_id = label.attributes['for'] ? label.attributes['for'].nodeValue : '';}

			if(target_id == "username"){
				usernameLabel = label;
			}else if(target_id == "password"){
				passwordLabel = label;
			}
		}

		if(usernameLabel && currentI18nMap.username){
			usernameLabel.innerHTML = currentI18nMap.username;
		}

		if(passwordLabel && currentI18nMap.password){
			passwordLabel.innerHTML = currentI18nMap.password;
		}

		if(submitButton && currentI18nMap.loginButton){
			submitButton.value = currentI18nMap.loginButton;
		}
	}

})()

function setup() {
	runner.start();

	//
	// window.location.href is defined in DOM1, so should work every where
	//

	var path = String(window.location.href).replace(/http:\/\/[^\/]*/,'');
	path = path || "/";
	document.cookie = "originURI=" + path + ";max-age=" + (60*60*24*365);//( for a year);

}	

