(function ($, Coral) {
    "use strict";
    var maxChar, errorMessage;
  
    var registry = $(window).adaptTo("foundation-registry");

  registry.register("foundation.validation.validator", {
    selector: "[data-validation=pageguidecards-buttonText-10char]",
    validate: function (pageguidebuttonText) {
      maxChar = 10;
      if ($(pageguidebuttonText).val().length > maxChar) {
        errorMessage = "Button Text should not exceed 10 characters";
        return errorMessage;
      }
    },
  });

  registry.register("foundation.validation.validator", {
    selector: "[data-validation=pageguidecards-pageUrl-40char]",
    validate: function (pageguidepageUrl) {
      maxChar = 40;
      if ($(pageguidepageUrl).val().length > maxChar) {
        errorMessage = "Pageurl should not exceed 40 characters";
        return errorMessage;
      }
    },
  });
})(jQuery, Coral);

