(function ($, Coral) {
    "use strict";
    var  errorMessage;
    const registry = $(window).adaptTo("foundation-registry");
    registry.register("foundation.validation.validator", {
        selector: "[data-validation=logo-validation]",
        validate: function (element) {
            var element = $(element);
            let maxItem=element.data("max-item");
            let items=element.children("coral-multifield-item").length;
            if(items > maxItem){
                errorMessage = "Only up to 5 elements are allowed";
                return errorMessage;
           }
      },
    });

    
    registry.register("foundation.validation.validator", {
        selector: "[data-validation=multifield-validation]",
        validate: function (element) {
            var element = $(element);
            let maxItem=element.data("max-item");
            let items=element.children("coral-multifield-item").length;
            if(items > maxItem){
                errorMessage = "Only up to 5 elements are allowed in each row";
                return errorMessage;
           }
      },
    });

    // email validation

    registry.register("foundation.validation.validator", {
        selector: "[data-validation=email-validation]",
        validate: function (element) {
			var element = $(element);
            let email=element.val();
            const pattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
            if (pattern.test(email) && email.endsWith(".com") || email.endsWith(".in"))
            {
                return 0;
           }else{
            errorMessage = "Enter valid email address";
            return errorMessage;
           }
      },
    });
  })(jQuery, Coral);
  
