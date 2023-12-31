(function ($, Coral) {
    "use strict";
    var maxChar, errorMessage;
    console.log("triggered");
    var registry = $(window).adaptTo("foundation-registry");
  
  registry.register("foundation.validation.validator", {
    selector: "[data-validation=messagebycomponent-title-100char]",
    validate: function (title) {
      maxChar = 100;
      if ($(title).val().length > maxChar) {
        errorMessage = "Title should not exceed 100 characters";
        return errorMessage;
      }
    },
  });
  registry.register("foundation.validation.validator", {
    selector: "[data-validation=messagebycomponent-message-300char]",
    validate: function (message) {
      maxChar = 300;
      if ($(message).val().length > maxChar) {
        errorMessage = "Message should not exceed 300 characters";
        return errorMessage;
      }
    },
  });
  registry.register("foundation.validation.validator", {
    selector: "[data-validation=messagebycomponent-name-25char]",
    validate: function (name) {
      maxChar = 25;
      if ($(name).val().length > maxChar) {
        errorMessage = "Name should not exceed 25 characters";
        return errorMessage;
      }
    },
  });

  registry.register("foundation.validation.validator", {
    selector: "[data-validation=messagebycomponent-mesageCTAbuttonname-10char]",
    validate: function (mesageCTAbuttonname) {
      maxChar = 10;
      if ($(mesageCTAbuttonname).val().length > maxChar) {
        errorMessage = "Button Text should not exceed 10 characters";
        return errorMessage;
      }
    },
  });
 
})(jQuery, Coral);
