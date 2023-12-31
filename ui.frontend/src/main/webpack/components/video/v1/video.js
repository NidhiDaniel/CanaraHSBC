$(document).ready(function () {

    $('.playInsideLaptop').click(function () {
        $(this).find('span').fadeOut(300);
        var video = '<iframe class="iframeVideo" src="' + $(this).find('img').attr('data-video') + '" allow="autoplay; encrypted-media"></iframe>';
        $(this).find('img').replaceWith(video);
    });

    $(".playVideoPopup").click(function () {
        var dataid = $(this).attr('data-value');
        $('.popupIframe').attr('src', dataid);
    });
    $('.insuranceModal').each(function () {
        var src = $(this).find('iframe').attr('src');
        $(this).on('click', function () {
            $(this).find('iframe').attr('src', '');
            $(this).find('iframe').attr('src', src);
        });
    });
});


