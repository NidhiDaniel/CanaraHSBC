import Swiper from "../../../dependencies/js/swiper";
if(document.getElementById("pageguidecardstimer") !== null){
let pageguidecardstimer = document.getElementById("pageguidecardstimer").value;
var swiper = new Swiper("#insuranceGuideSlider", {
  spaceBetween: 30,
  slidesPerGroup: 1,
  loopFillGroupWithBlank: true,
  autoplay: {
    delay: pageguidecardstimer,
  },
  pagination: {
    el: ".swiper-pagination",
    clickable: true,
  },
  navigation: {
    nextEl: ".swiper_guide_next",
    prevEl: ".swiper_guide_prev",
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
}

$("#insuranceGuideSlider").hover(function() {
  (this).swiper.autoplay.stop();
}, function() {
  (this).swiper.autoplay.start();
});

$("p>span.add_character_limit").each(function(i){
  var len=$(this).text().trim().length;
  if(len>126)
  {
      $(this).text($(this).text().substr(0,126)+'... ');
  }

});
