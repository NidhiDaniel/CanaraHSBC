(function ($, Coral) {
    "use strict";
    var maxChar, errorMessage;
  
    var registry = $(window).adaptTo("foundation-registry");

  registry.register("foundation.validation.validator", {
    selector: "[data-validation=cardtile-buttonText-25char]",
    validate: function (cardtilebuttonText) {
      maxChar = 25;
      if ($(cardtilebuttonText).val().length > maxChar) {
        errorMessage = "Button Text should not exceed 25 characters";
        return errorMessage;
      }
    },
  });

  registry.register("foundation.validation.validator", {
    selector: "[data-validation=cardtile-text-350char]",
    validate: function (text) {
      maxChar = 350;
      if ($(text).val().length > maxChar) {
        errorMessage = "Description should not exceed 350 characters";
        return errorMessage;
      }
    },
  });

  registry.register("foundation.validation.validator", {
    selector: "[data-validation=cardtile-title-100char]",
    validate: function (title) {
      maxChar = 100;
      if ($(title).val().length > maxChar) {
        errorMessage = "Text should not exceed 100 characters";
        return errorMessage;
      }
    },
  });

  registry.register("foundation.validation.validator", {
    selector: "[data-validation=cardtile-multifield]",
    validate: function (element) {
        var element = $(element);
        let minItem=element.data("min-item");
        let items=element.children("coral-multifield-item").length;
        if(items < minItem){
            errorMessage = "Minimum 3 cards should be added";
            return errorMessage;
         }
    },
  });
})(jQuery, Coral);

