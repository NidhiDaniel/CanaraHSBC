(function ($, Coral) {
  "use strict";
  var maxChar, errorMessage;
  var registry = $(window).adaptTo("foundation-registry");
  registry.register("foundation.validation.validator", {
    selector: "[data-validation=minicard-text-40char]",
    validate: function (text) {
      maxChar = 40;
      if ($(text).val().length > maxChar) {
        errorMessage = " Text should not exceed 40 characters";
        return errorMessage;
      }
    },
  });
  registry.register("foundation.validation.validator", {
    selector: "[data-validation=minicard-title-100char]",
    validate: function (title) {
      maxChar = 100;
      if ($(title).val().length > maxChar) {
        errorMessage = "Text should not exceed 100 characters";
        return errorMessage;
      }
    },
  });
  registry.register("foundation.validation.validator", {
    selector: "[data-validation=minicard-miniButtonText-40char]",
    validate: function (miniButtonText) {
      maxChar = 40;
      if ($(miniButtonText).val().length > maxChar) {
        errorMessage = "Text should not exceed 40 characters";
        return errorMessage;
      }
    },
  });

})(jQuery, Coral);