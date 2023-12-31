(function ($) {
    "use strict";
    const registry = $(window).adaptTo("foundation-registry");
    registry.register("foundation.validation.validator", {
        selector: "[data-validation=txt-validation-100char]",
        validate: function (element) {
            const el = $(element);
            let maxLength = 100;
            let elValue = el.val();
            if (elValue.length > maxLength) {
                return "The field needs to be maximum 30 characters. It currently has a length of " + elValue.length + ".";
            }
        }
    }); 
})(jQuery);