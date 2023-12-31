(function ($) {
    "use strict";
    console.log("ClientLib Loaded")
     const registry = $(window).adaptTo("foundation-registry");
     registry.register("foundation.validation.validator", {
        selector: "[data-cmp-is=childrenEditor]",
        validate: function(element) {
            const el = $(element);
            let min=el.data("min-item");
            let items=el.children("coral-multifield-item").length;
            console.log(" {}:{}  ",min,items);

            if(items<2){
                return "You add minimum 2 items."
            }
        }
    });
})(jQuery);