import Swiper from "../../../dependencies/js/swiper";

var swiper = new Swiper("#insuranceSlider", {
    spaceBetween: 30,
    loop: true,
    loopFillGroupWithBlank: true,
    navigation: {
      nextEl: ".swiper_insurance_next",
      prevEl: ".swiper_insurance_prev",
    },
    breakpoints: {
      640: {
        slidesPerView: 1,
      },
      768: {
        slidesPerView: 2,
      },
      1024: {
        slidesPerView: 3,
      },
    },
  });
  
  
  $( document ).ready(function() {
	  
	  $("#plan0").css("display", "block");
	    $("#plan1").css("display", "none");
		  $("#plan2").css("display", "none");
	  
	  
	   $('.plan0').click(function(e) {  
       $("#plan0").css("display", "block");
	    $("#plan1").css("display", "none");
		  $("#plan2").css("display", "none");


      $("html, body").animate({
        scrollTop: $("#plan0").offset().top - 120
    }, 500);
    a.preventDefault()
    }); 

	$('.plan1').click(function(e) {  
       $("#plan0").css("display", "none");
	    $("#plan1").css("display", "block");
		  $("#plan2").css("display", "none");

      $("html, body").animate({
        scrollTop: $("#plan1").offset().top - 120
    }, 500);
    a.preventDefault()
    }); 
	$('.plan2').click(function(e) {  
     $("#plan0").css("display", "none");
	    $("#plan1").css("display", "none");
		  $("#plan2").css("display", "block");

      $("html, body").animate({
        scrollTop: $("#plan2").offset().top - 120
    }, 500);
    a.preventDefault()
    });
	  
	  

    
	
	
});