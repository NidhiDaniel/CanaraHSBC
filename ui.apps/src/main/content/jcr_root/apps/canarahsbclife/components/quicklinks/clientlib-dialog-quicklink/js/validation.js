(function ($, Coral) {
    "use strict";
    var errorMessage;
    const registry = $(window).adaptTo("foundation-registry");
   registry.register("foundation.validation.validator", {
    selector: "[data-validation=multifield-validation]",
    validate: function (element) {
    var element = $(element);
    let maxItem=element.data("max-item"); 
    let items=element.children("coral-multifield-item").length;
     if(items > maxItem){
        errorMessage = "Only up to 7 elements are allowed";
     return errorMessage;
   }
     },
    });
   })(jQuery, Coral);
 
 
 
  //checkbox
  
  
  (function (document, $) {
    "use strict";

    // when dialog gets injected
    $(document).on("foundation-contentloaded", function (e) {
        // if there is already an inital value make sure the according target element becomes visible
        checkboxShowHideHandler($(".cq-dialog-checkbox-showhide", e.target));
    });

    $(document).on("change", ".cq-dialog-checkbox-showhide", function (e) {
        checkboxShowHideHandler($(this));
    });

    function checkboxShowHideHandler(el) {
        el.each(function (i, element) {
            if($(element).is("coral-checkbox")) {
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
        })
    }


    function showHide(component, element) {
    
        // get the selector to find the target elements. its stored as data-.. attribute
        var target = $(element).data("cqDialogCheckboxShowhideTarget");
        var $target = $(target);
        var elementIndex = $(element).closest('coral-multifield-item').index();
          console.log(target);

        if (target) {
            $target.each(function(index) {
                var tarIndex = $(this).closest('coral-multifield-item').index();
                if (elementIndex == tarIndex) {
                   $(this).removeClass("hide");
                     //$target.addClass("hide");
                    if (component.checked) {
                         //$target.removeClass("hide");
                    $(this).addClass("hide");
                    }    
                }
            })
        }
    }
})(document, Granite.$);

(function ($, $document) {
    var CHECKBOX_SELECTOR = ".cq-dialog-checkbox-showhide";

    $document.on("dialog-ready", addSelectSingleCheckboxListener);

    function addSelectSingleCheckboxListener(){
        $document.on('change',  CHECKBOX_SELECTOR, function(e) {
            $(CHECKBOX_SELECTOR).not(this).prop('checked', false);
        });
    }
}(jQuery, jQuery(document), Granite.author));



