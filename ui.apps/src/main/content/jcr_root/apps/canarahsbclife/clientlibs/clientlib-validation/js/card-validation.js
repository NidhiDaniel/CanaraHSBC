(function ($) {
    "use strict";
    const registry = $(window).adaptTo("foundation-registry");
   registry.register("foundation.validation.validator", {
     selector: "[data-validation=txt-validation]",
     validate: function (element) {
       const el = $(element);
       let maxLength = el.data("max-length");
       console.log(maxLength);
 
       let elValue = el.val();
       console.log(elValue.length);
       if (elValue.length > maxLength) {
         return "The field needs to be maximum " +maxLength +" characters. It currently has a length of " +elValue.length +".";
       }
     }
   });
   registry.register("foundation.validation.validator", {
    selector: "[data-validation=calc-validation]",
    validate: function (element) {
        const calc = $(element);
        let max = calc.data("max-item");
        console.log("{}",max)
        let items = calc.children("coral-multifield-item").length;
        if (items > max) {
            /* Use below line if you don't want to add item in multifield more than max limit */
            //domitems.last().remove();
            return "You can add maximum " + max + " fields. You are trying to add " + items + "th fields."
        }
    }
});
 })(jQuery);