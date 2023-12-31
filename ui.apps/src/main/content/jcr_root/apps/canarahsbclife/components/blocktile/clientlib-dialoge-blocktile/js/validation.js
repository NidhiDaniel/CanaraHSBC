(function ($, Coral) {
    "use strict";
    var maxChar, errorMessage;
  
    var registry = $(window).adaptTo("foundation-registry");
  
    registry.register("foundation.validation.validator", {
      selector: "[data-validation=blocktile-title-40char]",
      validate: function (title) {
        maxChar = 40;
        if ($(title).val().length > maxChar) {
          errorMessage = "Title should not exceed 40 characters";
          return errorMessage;
        }
      },
    });
  
    registry.register("foundation.validation.validator", {
      selector: "[data-validation=blocktile-subTitle-25char]",
      validate: function (subTitle) {
        maxChar = 25;
        if ($(subTitle).val().length > maxChar) {
          errorMessage = "Subtitle should not exceed 25 characters";
          return errorMessage;
        }
      },
    });
  
    registry.register("foundation.validation.validator", {
      selector: "[data-validation=blocktile-validation]",
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
  