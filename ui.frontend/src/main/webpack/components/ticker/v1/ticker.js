$(".newwindow").click(function(){
    event.preventDefault();
    var newlink=$(this).find("a").attr("href");
    window.open(newlink, "_blank","toolbar=yes,scrollbars=yes,resizable=yes,top=500,left=500,width=4000,height=4000");

});
