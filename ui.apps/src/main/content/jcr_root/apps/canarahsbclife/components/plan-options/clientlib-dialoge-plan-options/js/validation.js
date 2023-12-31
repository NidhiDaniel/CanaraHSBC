(function ($, Coral) {
    "use strict";
    var maxChar, errorMessage;
  
    var registry = $(window).adaptTo("foundation-registry");
  
   registry.register("foundation.validation.validator", {
      selector: "[data-validation=plan-options-title-30char]",
      validate: function (title) {
        maxChar = 30;
        if ($(title).val().length > maxChar) {
          errorMessage = "Title should not exceed 30 characters";
          return errorMessage;
        }
      },
    });
	
	registry.register("foundation.validation.validator", {
      selector: "[data-validation=plan-options-title-50char]",
      validate: function (title) {
        maxChar = 30;
        if ($(title).val().length > maxChar) {
          errorMessage = "Title should not exceed 50 characters";
          return errorMessage;
        }
      },
    });
  
  
    registry.register("foundation.validation.validator", {
      selector: "[data-validation=plan-options-subTitle-250char]",
      validate: function (subTitle) {
        maxChar = 250;
        if ($(subTitle).val().length > maxChar) {
          errorMessage = "Subtitle should not exceed 250 characters";
          return errorMessage;
        }
      },
    });
  
    registry.register("foundation.validation.validator", {
      selector: "[data-validation=planoptions-validation]",
      validate: function (element) {
          var element = $(element);
          let minItem=element.data("min-item");
          let items=element.children("coral-multifield-item").length;
          if(items < minItem){
              errorMessage = "Minimum 2 cards should be added";
              return errorMessage;
           }
      },
    });
  })(jQuery, Coral);
  