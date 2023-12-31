/* eslint-disable max-len */
$(document).ready(function () {
  const phoneNumberInput = document.getElementById("mobNumField");
  const emailInput = document.getElementById("emailField");
  const nameInput = document.getElementById("nameField");
  const pattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
  const namePattern = /^[a-zA-Z]+(?:\s[a-zA-Z]+){0,2}$/;

  if (nameInput) {
    nameInput.addEventListener("input", function () {
      if (namePattern.test(nameInput.value)) {
        $("#error-name").hide();
      }
    });
  }

  if (phoneNumberInput) {
    phoneNumberInput.addEventListener("input", function (event) {
      const maxLength = 10;
      if (this.value.length > maxLength) {
        this.value = this.value.slice(0, maxLength);
        event.preventDefault();
      }
      if (phoneNumberInput.value.length == maxLength) {
        $("#error-mob").hide();
      }
    });
  }

  if (emailInput) {
    emailInput.addEventListener("input", function () {
      const email = emailInput.value;
      if (pattern.test(email)) {
        $("#error-email").hide();
      }
    });
  }

  $("form").submit(function (event) {
    event.preventDefault();

    var mobileNumber = $("#mobNumField").val().length;
    var email = $("#emailField").val();
    if(namePattern.test($("#nameField").val())){
      if (pattern.test(email)) {
        if (mobileNumber != 10) {
          $("#error-mob").show();
        } else {
          $("#emailField").hide();
          $("#error-mob").hide();
          const data = Object.fromEntries(new FormData(event.target));
          data["id"] = $(this).attr("id");
          const fieldNames = Object.keys(data);
          const fieldValues = Object.values(data);
  
          $.ajax({
            type: "GET",
            contentType: "application/json",
            url: "/bin/contactform",
            data: { fieldNames: fieldNames, fieldValues: fieldValues },
            dataType: "json",
          });
  
          var ctaLink = this.querySelector('[id^="cf_link_"]').value;
          var target = this.querySelector('[id^="cf_submitBtn_"]').value;
          if (target == "newWindow") {
            window.open(
              ctaLink,
              "_blank",
              "toolbar=yes,scrollbars=yes,resizable=yes"
            );
            location.reload();
          } else if (target == "_self") {
            window.open(ctaLink, "_self");
          } else if (target == "_blank") {
            window.open(ctaLink, "_blank");
            location.reload();
          }
        }
      } else {
        $("#error-email").show();
      }
    } else{
      $("#error-name").show();
    }
    
  });

  $("#txtAge").bind("keyup", "keydown", function (event) {
    var inputLength = event.target.value.length;
    if (event.keyCode != 8) {
      if (inputLength === 2 || inputLength === 5) {
        var thisVal = event.target.value;
        thisVal += "/";
        $(event.target).val(thisVal);
      }
    }
  });
  let $btn = $("#btnDOB"),
    $input = $("#txtAge"),
    dp = $input
      .datepicker({
        showEvent: "none",
        dateFormat: "dd/mm/yyyy",
        maxDate: new Date(
          new Date().valueOf() - 18 * 365 * 24 * 60 * 60 * 1000
        ),
      })
      .data("datepicker");

  $btn.on("click", function () {
    dp.show();
    $input.focus();
  });

  $("#txtAge").datepicker({
    onSelect: function (fd, d, calendar) {
      if (d.getDate() != "") {
        dp.hide();
      }
    },
  });
});

(function ($) {
  $.fn.datepicker.language["en"] = {
    days: [
      "Sunday",
      "Monday",
      "Tuesday",
      "Wednesday",
      "Thursday",
      "Friday",
      "Saturday",
    ],
    daysShort: ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"],
    daysMin: ["Su", "Mo", "Tu", "We", "Th", "Fr", "Sa"],
    months: [
      "January",
      "February",
      "March",
      "April",
      "May",
      "June",
      "July",
      "August",
      "September",
      "October",
      "November",
      "December",
    ],
    monthsShort: [
      "Jan",
      "Feb",
      "Mar",
      "Apr",
      "May",
      "Jun",
      "Jul",
      "Aug",
      "Sep",
      "Oct",
      "Nov",
      "Dec",
    ],
    today: "Today",
    clear: "Clear",
    dateFormat: "mm/dd/yyyy",
    timeFormat: "hh:ii aa",
    firstDay: 0,
  };
})(jQuery);
