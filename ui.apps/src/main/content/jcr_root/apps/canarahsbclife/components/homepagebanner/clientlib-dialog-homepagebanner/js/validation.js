(function ($) {
  "use strict";
  const registry = $(window).adaptTo("foundation-registry");
  registry.register("foundation.validation.validator", {
    selector: "[data-validation=txt-validation]",
    validate: function (element) {
      const el = $(element);
      let maxLength = el.data("max-length");

      let elValue = el.val();
      if (elValue.length > maxLength) {
        return (
          "The field needs to be maximum " +
          maxLength +
          " characters. It currently has a length of " +
          elValue.length +
          "."
        );
      }
    },
  });
  /*banner multifield validation*/
  registry.register("foundation.validation.validator", {
    selector: "[data-validation=slider-validation]",
    validate: function(element) {
        var el = $(element);
        let min=el.data("min-item");
        let items=el.children("coral-multifield-item").length;
        if(items<min){
            return "You add minimum "+min+" items.";
        }
    }
});
  $(document).on("foundation-contentloaded", function (e) {
    // if there is already an inital value make sure the according target element becomes visible
    checkboxShowHideHandler($(".cq-dialog-checkbox-showhide", e.target));
  });

  $(document).on("change", ".cq-dialog-checkbox-showhide", function (e) {
    checkboxShowHideHandler($(this));
  });

  function checkboxShowHideHandler(el) {
    el.each(function (i, element) {
      if ($(element).is("coral-checkbox")) {
        // handle Coral3 base drop-down
        Coral.commons.ready(element, function (component) {
          showHide(component, element);
          component.on("change", function () {
            showHide(component, element);
          });
        });
      } else {
        // handle Coral2 based drop-down
        var component = $(element).data("checkbox");
        if (component) {
          showHide(component, element);
        }
      }
    });
  }

  function showHide(component, element) {
    // get the selector to find the target elements. its stored as data-.. attribute
    var target = $(element).data("cqDialogCheckboxShowhideTarget");
    var $target = $(target);
    var elementIndex = $(element).closest('coral-multifield-item').index();
    if(target){
    $target.each(function(index) {
      var tarIndex = $(this).closest('coral-multifield-item').index();
      if (elementIndex == tarIndex) {
        
          $(this).addClass("hide");
          if (component.checked) {
            $(this).removeClass("hide");
          }
        
      }})
  }
}
})(jQuery);
