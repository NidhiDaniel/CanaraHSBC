(function ($, Coral) {
    "use strict";
    var  errorMessage;

    var registry = $(window).adaptTo("foundation-registry");

      registry.register("foundation.validation.validator", {
        selector: "[data-validation=cardList-multifield]",
        validate: function (element) {
            var element = $(element);
            let maxItem=element.data("max-item");
            let items=element.children("coral-multifield-item").length;
            if(items > maxItem){
                errorMessage = "Max 4 items are allowed in plan card";
                return errorMessage;
             }
        },
      });
      registry.register("foundation.validation.validator", {
        selector: "[data-validation=imageList-multifield]",
        validate: function (element) {
            var element = $(element);
            let maxItem=element.data("max-item");
            let items=element.children("coral-multifield-item").length;
            if(items > maxItem){
                errorMessage = "Max 3 items are allowed in image card";
                return errorMessage;
             }
        },
      });
})(jQuery, Coral);

// Email Validation
(function ($, Coral) {
    "use strict";
    var maxChar, errorMessage;
    var registry = $(window).adaptTo("foundation-registry");
    registry.register("foundation.validation.validator", {
        selector: "[data-validation=email-validation]",
        validate: function (element) {
            var element = $(element);
            let email = element.val();
            const pattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
            if (pattern.test(email) && email.endsWith(".com") || email.endsWith(".in")) {
                return 0;
            } else {
                errorMessage = "Enter valid email address for eg:adcd@gmail.com";
                return errorMessage;
            }
        },
    });


})(jQuery, Coral);
