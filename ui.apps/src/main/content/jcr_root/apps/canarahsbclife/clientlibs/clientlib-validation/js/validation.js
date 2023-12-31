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
 })(jQuery);