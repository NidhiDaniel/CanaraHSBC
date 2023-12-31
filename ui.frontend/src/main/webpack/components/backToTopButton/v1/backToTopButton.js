
$(window).scroll(function () {

    if ($(this).scrollTop() > 300) {
        $('.back_to_top').addClass("show");
    } else {
        $('.back_to_top').removeClass("show");
    }
});

//Click event to scroll to top
$('.back_to_top').click(function () {

    $('html, body').animate({ scrollTop: 0 }, 500);
    return false;
});


