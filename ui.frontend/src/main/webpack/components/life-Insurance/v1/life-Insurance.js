$(".play-video").click(function () {

    var dataid = $(this).attr('data-value');

    $('.insuranceModal iframe').attr('src', dataid);
});
$('.insuranceModal').each(function () {
    var src = $(this).find('iframe').attr('src');
    $(this).on('click', function () {
        $(this).find('iframe').attr('src', '');
        $(this).find('iframe').attr('src', src);
    });
});
