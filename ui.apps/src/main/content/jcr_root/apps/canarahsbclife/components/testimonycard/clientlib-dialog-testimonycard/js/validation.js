(function ($, Coral) {
  "use strict";
  var maxChar, errorMessage;

  var registry = $(window).adaptTo("foundation-registry");

  registry.register("foundation.validation.validator", {
    selector: "[data-validation=testimonycard-title-150char]",
    validate: function (title) {
      maxChar = 150;
      if ($(title).val().length > maxChar) {
        errorMessage = "Title should not exceed 150 characters";
        return errorMessage;
      }
    },
  });

  registry.register("foundation.validation.validator", {
    selector: "[data-validation=testimonycard-description-300char]",
    validate: function (text) {
      maxChar = 300;
      if ($(text).val().length > maxChar) {
        errorMessage = "Description should not exceed 300 characters";
        return errorMessage;
      }
    },
  });

  registry.register("foundation.validation.validator", {
    selector: "[data-validation=testimonycard-multifield]",
    validate: function (element) {
        var element = $(element);
        let minItem=element.data("min-item");
        let items=element.children("coral-multifield-item").length;
        if(items < minItem){
            errorMessage = "Minimum 4 items should be added";
            return errorMessage;
         }
    },
  });
})(jQuery, Coral);
