(function() {
	var afterLogin = function() {
		if(/true/.test(dojo.cookie("EXTENDCOOKIE"))) {
			dojo.cookie("XASID", dojo.cookie("XASID"), { expires: 365 });
			dojo.cookie("XASSESSIONID", dojo.cookie("XASSESSIONID"), { expires: 365 });
		}
	}

	dojo.connect(mx.session, "startup", afterLogin);
	dojo.connect(mx.session, "restart", afterLogin);

	afterLogin();
})();
