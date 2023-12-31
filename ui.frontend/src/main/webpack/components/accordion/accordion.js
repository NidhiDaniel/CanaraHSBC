$(document).ready(function () {
    $('.accordion').each(function () {
        var initialNumItems = parseInt($(this).find("#Accordion_initialNumItems").attr("value"));
        var initialshow = initialNumItems-1;
        var LiN = $(this).find('.accordion-item').length;
        if (LiN > initialNumItems) {
            $('.accordion-item', this).eq(initialshow).nextAll().hide();
        }
        if ($(this).find("#Accordion_displayShowMore") !== null) {
            var shwbtn = $(this).find("#Accordion_displayShowMore").attr("value");
            if (shwbtn !== "true") {
                $(this).siblings('.showbtn').hide();
            }
            else {
                $(this).siblings('.showbtn').show();
            }
        }
    });
});

$('.accordion-header').click(function (e) {
    e.preventDefault();
    var notthis = $('.active').not(this);
    var accordionHide=$(this).parent();
    if (accordionHide.siblings('#Accordion_hideInactiveItem') !== null) {
        var check = accordionHide.siblings('#Accordion_hideInactiveItem').attr("value");
    }
    if (check == "true") {
        notthis.toggleClass('active').next('.accordion-collapse').slideToggle(300);
    }
    $(this).toggleClass('active').next().slideToggle("fast");
});
$(".showFAQBtn").click(function () {
    if ($(this).find("#Accordion_itemPerLoad").attr("value") !== null) {
        var itemPerLoad = parseInt($(this).find("#Accordion_itemPerLoad").attr("value"));
        var shownitems = parseInt($(this).find("#Accordion_shownitems").attr("value"));
        var nextItem = shownitems + itemPerLoad;
        var accObj = $(this).siblings('.accordion');
        var length = accObj.find('.accordion-item').length;
        if (shownitems < length) {
            accObj.find('.accordion-item').slice(0, nextItem).show();
            var accShwItm = $(this).find("#Accordion_shownitems");
            accShwItm.val(nextItem);
            if (nextItem >= length) {
                var showless = document.getElementById("Accordion_showless").value;
                $(this).find("#showFAQBtn").text(showless);
            }
        }
        else {
            var initialNumItems =  parseInt(accObj.find("#Accordion_initialNumItems").attr("value"));
            accObj.find('.accordion-item').slice(initialNumItems, nextItem).hide();
            $(this).find("#Accordion_shownitems").val(initialNumItems);
            var showmore = document.getElementById("Accordion_showmore").value;
            $(this).find("#showFAQBtn").text(showmore);
        }
    }
});