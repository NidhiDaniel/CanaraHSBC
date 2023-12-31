$(document).ready(function () {

    if (window.matchMedia("(min-width: 767px)").matches){

        $(window).scroll(function() {    
            var scroll = $(window).scrollTop();
        
            if (scroll >= 700) {
                $(".quick_sticky_btn").addClass("showBtn");
                $(".sticky_quick_links").addClass("show");
            } else {
                $(".quick_sticky_btn").removeClass("showBtn");
                $(".sticky_quick_links").removeClass("show");
            }
        });
    
        $(".quick_sticky_btn").click(function() {
            $(".sticky_quick_links").toggleClass("show");
        });

    }
});