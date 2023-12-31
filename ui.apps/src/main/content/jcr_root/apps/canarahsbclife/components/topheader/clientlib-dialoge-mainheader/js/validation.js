(function ($, Coral) {
    "use strict";
    var maxChar, errorMessage;
    var registry = $(window).adaptTo("foundation-registry");
    registry.register("foundation.validation.validator", {
      selector: "[data-validation=email-validation]",
      validate: function (element) {
    var element = $(element);
          let email=element.val();
          const pattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
           if (pattern.test(email)&& email.endsWith(".com")|| email.endsWith(".in") )
          {
              return 0;
         }else{
          errorMessage = "Enter valid email address for eg:adcd@gmail.com";
          return errorMessage;
         }
    },
  });
  
    
  })(jQuery, Coral);
  