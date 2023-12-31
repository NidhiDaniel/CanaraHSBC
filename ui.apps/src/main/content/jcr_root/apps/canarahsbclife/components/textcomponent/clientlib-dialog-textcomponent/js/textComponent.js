(function (window, $) {
  "use strict";

  var RichTextStylesValidation = (function () {
    var CONST = {
      TARGET_GRANITE_UI: ".coral-RichText-editable",
      ERROR_MESSAGE: "Title text length is {0} but character limit is {1}!",
    };

    function init() {
      $(window)
        .adaptTo("foundation-registry")
        .register("foundation.validation.validator", {
          selector: CONST.TARGET_GRANITE_UI,
          validate: function (el) {
            var $rteField = $(el);
            var $field = $rteField
              .closest(".richtext-container")
              .find("input.rich-custom");
            if ($field.length) {
              var maxLength = 30;
              if (document.querySelector(".txt-heading-title") != null) {
                var element = document.querySelector(".txt-heading-title");
                var textContent = element.textContent;
                var textLength = textContent.length;

                if (maxLength && textLength > maxLength) {
                  return Granite.I18n.get(CONST.ERROR_MESSAGE, [
                    textLength,
                    maxLength,
                  ]);
                }
              }

              $(".txt-primary_btn").each(function () {
                if ($(this).has(".txt-secondary_btn").length) {
                  $(this).removeClass("txt-primary_btn");
                }
              });
              $(".txt-secondary_btn").each(function () {
                if ($(this).has(".txt-primary_btn").length) {
                  $(this).removeClass("txt-secondary_btn");
                }
              });
             
              return null;
            }
          },
        });
      // execute Jquery Validation onKeyUp
      $(document).on("mouseover keyup", CONST.TARGET_GRANITE_UI, function (e) {
        executeJqueryValidation($(this));
      });
    }

    function executeJqueryValidation(el) {
      var validationApi = el.adaptTo("foundation-validation");
      if (validationApi) {
        validationApi.checkValidity();
        validationApi.updateUI();
      }
    }
    return {
      init: init,
    };
  })();
  RichTextStylesValidation.init();
})(window, Granite.$);
