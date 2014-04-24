dojo.provide("loginsystem.widget.FormInput");

mendix.widget.declare("loginsystem.widget.FormInput", {
	inputargs: {
		node : null,
		text : ""
	},
	baseClass : "loginsystemFormInput",
	exampleCss : "loginsystemFormInput_example",
	
	inputType : "",
	hasExample : false,
	
	postCreate : function() {
		logger.debug(this.id + ".postCreate");
		
		this.inputType = this.node.type;
		
		this.connect(this.node, "onfocus", this.hideExample);
		this.connect(this.node, "onblur", this.showExample);
		
		mendix.dom.addClass(this.node, this.baseClass);

		if(dojo.isIE) {
			this.ieParent = this.node.parentNode;
			this.ieChild = mendix.dom.input({
				"type"	: "text",
				"class"	: mendix.dom.getClass(this.node)
			});

			this.connect(this.ieChild, "onfocus", this.hideExample);
			this.connect(this.ieChild, "onblur", this.showExample);
		}

		this.showExample();
		this.loaded();
	},
	
	isEmpty : function() {
		return /^\s*$/.test(this.node.value);
	},
	
	showExample : function() {
		logger.debug(this.id + ".showExample");
		
		if(this.isEmpty()) {
			this.hasExample = true;

			if(this.inputType == "password") {
				if(dojo.isIE) {
					this.ieParent.replaceChild(this.ieChild, this.node);
					this.ieChild.value = this.text;
					mendix.dom.addClass(this.ieChild, this.exampleCss);

					return;
				} else {
					this.node.type = "text";					
				}
			}

			this.node.value = this.text;
			mendix.dom.addClass(this.node, this.exampleCss);
		}
	},
	
	hideExample : function() {
		logger.debug(this.id + ".hideExample");
		
		if(this.hasExample) {
			this.hasExample = false;
	
			if(this.inputType == "password") {
				if(dojo.isIE) {
					this.ieParent.replaceChild(this.node, this.ieChild);
					
					var node = this.node;
					setTimeout(function() {
						try {
							node.focus();
						} catch(e) {
							// ie
						}
					}, 0);
				} else {
					this.node.type = "password";	
				}
			}
			
			this.node.value = "";
			mendix.dom.removeClass(this.node, this.exampleCss);
		}
	},
	
	getValue : function() {
		logger.debug(this.id + ".getValue");
		
		return this.hasExample ? "" : this.node.value;
	},
	
	uninitialize : function() {
		logger.debug(this.id + ".uninitialize");
	}
});
