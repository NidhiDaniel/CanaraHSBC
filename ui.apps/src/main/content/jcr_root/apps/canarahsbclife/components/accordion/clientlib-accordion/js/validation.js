(function ($) {
    "use strict";
    const registry = $(window).adaptTo("foundation-registry");
    registry.register("foundation.validation.validator", {
        selector: "[data-validation=txt-validation-30char]",
        validate: function (element) {
            const el = $(element);
            let maxLength = 30;
            let elValue = el.val();
            if (elValue.length > maxLength) {
                return "The field needs to be maximum 30 characters. It currently has a length of " + elValue.length + ".";
            }
        }
    });
    registry.register("foundation.validation.validator", {
        selector: "[data-validation=txt-validation-250char]",
        validate: function (element) {
            const el = $(element);
            let maxLength = 250;
            let elValue = el.val();
            if (elValue.length > maxLength) {
                return "The field needs to be maximum 250 characters. It currently has a length of " + elValue.length + ".";
            }
        }
    });
})(jQuery);