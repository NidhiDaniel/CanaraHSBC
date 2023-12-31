//header js
const checkbox = document.getElementById("langToggle");
let enLink, hiLink, storedToggleState;
if (checkbox) {
  enLink = checkbox.getAttribute("data-enLink");
  hiLink = checkbox.getAttribute("data-hiLink");
  storedToggleState = sessionStorage.getItem("toggleState");
  if (storedToggleState !== null) {
    checkbox.checked = storedToggleState === "true";
  } else {
    let isFirstLoadEnglishPage = false;
    let isFirstLoadHindiPage = false;

    if (enLink && hiLink) {
      isFirstLoadEnglishPage = window.location.href === enLink;
      isFirstLoadHindiPage = window.location.href === hiLink;
    }

    if (isFirstLoadEnglishPage) {
      checkbox.checked = true;
      sessionStorage.setItem("toggleState", "true");
    } else if (isFirstLoadHindiPage) {
      checkbox.checked = false;
      sessionStorage.setItem("toggleState", "false");
    }
  }
}
if (checkbox) {
  checkbox.addEventListener("change", redirectToLink);
}
function redirectToLink() {
  if (checkbox.checked && hiLink !== "pagenotfound") {
    sessionStorage.setItem("toggleState", "true");
    window.location.href = hiLink;
  } else if (checkbox.checked && hiLink == "pagenotfound") {
    showPageNotFound();
  } else {
    sessionStorage.setItem("toggleState", "false");
    window.location.href = enLink;
  }
}
function showPageNotFound() {
  document.body.innerHTML = `
    <div class="header_inner_banner_content d-none d-sm-block">
    <h2>Page not found</h2>
    </div>
  `;
}

if (window.matchMedia("(min-width: 991px)").matches) {
  var navbar = document.getElementById("myHeader");
  if (navbar) {
    window.onscroll = function () {
      myFunction();
    };
    var sticky = navbar.offsetTop;

    function myFunction() {
      if (window.pageYOffset >= sticky) {
        navbar.classList.add("sticky");
      } else {
        navbar.classList.remove("sticky");
      }
    }
  }
}

$(document).ready(function () {
  if (window.matchMedia("(min-width: 991px)").matches) {
    var input = document.getElementById("search-key");
    if (input) {
      input.addEventListener("keyup", function (event) {
        if (event.keyCode === 13) {
          event.preventDefault();
          searchClick();
        }
      });
    }

    function searchClick() {
      let searchPage = $("#searchPage").attr("searchPage");
      var fullText = document.getElementById("search-key").value;
      fullText = fullText.replace(/ /g, "-");

      var searchresultpageURL = searchPage + "?q=" + fullText;
      location.replace(searchresultpageURL);
    }

    (function ($) {
      $.fn.tab = function (options) {
        var opts = $.extend({}, $.fn.tab.defaults, options);
        return this.each(function () {
          var obj = $(this);

          $(obj)
            .find(".tab_header_links li")
            .on(opts.trigger_event_type, function () {
              $(obj).find(".tab_header_links li").removeClass("active");
              $(this).addClass("active");

              $(obj).find(".tabContent .tabItem").hide();
              $(obj).find(".tabContent .tabItem").eq($(this).index()).show();
            });
        });
      };
      $.fn.tab.defaults = {
        trigger_event_type: "mouseover",
      };
    })(jQuery);
  }

  $(".searchBtn").click(function () {
    $(".search_container").toggleClass("open");
  });

  if (window.matchMedia("(max-width: 991px)").matches) {
    $(".hamburger").click(function () {
      $(this).toggleClass("active");
      $(".navigation").slideToggle();
      $(".m_nav").prev().removeClass("active");
      $(".m_nav").removeClass("rotate");
      $(".dropdown_nav").slideUp();
      $(".tabItem_Accordion ").removeClass("active");
    });

    $(".m_nav").click(function () {
      $(this).toggleClass("rotate");
      $(this).prev().toggleClass("active");
      $(this).next().slideToggle();
    });

    $(".m_header_links").click(function () {
      $(this).next().addClass("active");
    });

    $(".back_btn").click(function () {
      $(".tabItem_Accordion ").removeClass("active");
    });

    // $('.back_btn').click(function () {
    //     $(".dropdown_nav").removeClass("active");
    // });

    // $('header .navigation nav ul li .dropdown_nav .sub_nav h3').click(function () {
    //     $(this).next().slideToggle();
    //     $(this).toggleClass("arrowRotate");
    // });
  }

  // $('.m_header_links').click(function () {
  //     $(this).next().slideToggle();
  //     $(this).toggleClass("active");
  // });

  $(".headerTabsLifeInsurance").tab();
});
