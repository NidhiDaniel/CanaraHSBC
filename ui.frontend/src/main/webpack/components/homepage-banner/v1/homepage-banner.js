import Swiper from "../../../dependencies/js/swiper";
if(document.getElementById("bannerDelay") !== null){
  let bannerDelay = document.getElementById("bannerDelay").value;
  let disableInteraction = document.getElementById("disableInteraction").value;
var swiper = new Swiper("#mainSlider", {
  autoplay: {
      delay: bannerDelay,
      disableOnInteraction: disableInteraction,
  },
  pagination: {
      el: ".swiper-pagination",
      clickable: true,
  },
});}
