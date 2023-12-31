(function ($) {
    $('.categories_plan_div ul').each(function () {
        var more = document.getElementById("moreplans").value;
        var LiN = $(this).find('li').length;
        if (LiN > 6) {
            $('li', this).eq(5).nextAll().hide().addClass('toggleable');
            $(this).append('<li class="more minicardMore">' + more + '</li>');
        }
    });
    $('.categories_plan_div ul').on('click', '.minicardMore', function () {
        var more = document.getElementById("moreplans").value;
        var close = document.getElementById("close").value;
        if ($(this).hasClass('less')) {

            $(this).text(more).removeClass('less');
        } else {
            $(this).text(close).addClass('less');
        }
        $(this).siblings('li.toggleable').slideToggle();
    });
})($);
