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

     