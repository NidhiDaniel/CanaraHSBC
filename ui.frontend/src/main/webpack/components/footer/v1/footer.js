$(document).ready(function () {
    if (window.matchMedia("(min-width: 992px)").matches) {

        $(".footer_accordion .footer_acc_btn").click(function () {


            $(this).parents(".footer_accordion").find(".footer_collapse").slideToggle();
            $(this).toggleClass("rotate");

        });
    }

    if (window.matchMedia("(max-width: 991px)").matches) {

        $(".footer_links h6").click(function () {

            $(this).next().slideToggle();
            $(this).toggleClass("rotate");
        });
    }

});




