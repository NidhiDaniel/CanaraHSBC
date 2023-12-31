$(document).ready(function () {

    if (window.matchMedia("(max-width: 767px)").matches){
        $('#tabSelector').on('change', function (e) {
            $('.side_nav_btns ul li button').eq($(this).val()).tab('show');
        });
    }

});