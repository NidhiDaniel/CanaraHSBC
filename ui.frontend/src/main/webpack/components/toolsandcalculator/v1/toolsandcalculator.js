
import Swiper from "../../../dependencies/js/swiper";

var swiper = new Swiper("#calculatorSlider", {
  slidesPerView: 2,
  spaceBetween: 30,
  loop: true,
  navigation: {
    nextEl: ".swiper_calc_next",
    prevEl: ".swiper_calc_prev",
  },
  breakpoints: {
    640: {
      slidesPerView: 2,
    },
    768: {
      slidesPerView: 3,
    },
    1024: {
      slidesPerView: 5,
    },
  },
});
