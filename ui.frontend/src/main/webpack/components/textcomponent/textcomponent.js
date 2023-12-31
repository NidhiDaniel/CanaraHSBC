$(".txt-link-in-window")
  .unbind("click")
  .bind("click", function () {
    if ($(".txt-link-in-window") !== null) {
      event.preventDefault();
      var newlink = $(this).find("a").attr("href");
      var outside = $(this).closest("a").attr("href");
      if (newlink === undefined) {
        window.open(
          outside,
          "_blank",
          "toolbar=yes,scrollbars=yes,resizable=yes,top=500,left=500,width=4000,height=4000"
        );
      } else {
        window.open(
          newlink,
          "_blank",
          "toolbar=yes,scrollbars=yes,resizable=yes,top=500,left=500,width=4000,height=4000"
        );
      }
    }
  });

$(document).ready(function () {
  if ($(".txt-primary_btn").length) {
    $(".txt-primary_btn").each(function () {
      if ($(this).has(".txt-secondary_btn").length) {
        $(this).removeClass("txt-primary_btn");
      }
    });
  }
  if ($(".txt-secondary_btn").length) {
    $(".txt-secondary_btn").each(function () {
      if ($(this).has(".txt-primary_btn").length) {
        $(this).removeClass("txt-secondary_btn");
      }
    });
  }
  if ($(".txt-heading-title").length) {
    $(".txt-heading-title").each(function () {
      const headingText = $(this).text();
      const headingDiv = $("<div class='text-heading-title'></div>");
      const heading = $("<h2>" + headingText + "</h2>");
      const linesDiv = $("<div class='text-heading-title-lines'></div>");
      const span1 = $("<span></span>");
      const span2 = $("<span></span>");
      const span3 = $("<span></span>");
      linesDiv.append(span1);
      linesDiv.append(span2);
      linesDiv.append(span3);
      headingDiv.append(heading);
      headingDiv.append(linesDiv);
      $(this).replaceWith(headingDiv);
    });
  }
  updateText();
  window.addEventListener("resize", updateText);
});

function updateText() {
  var screenWidth = $("body").width();
  if ($(".txt-heading-title").length) {
    var textHeading = document.querySelector(".txt-heading-title");
    const originalText = textHeading.textContent.trim();
    let newText = "";
    let words = originalText.split(" ");
    let currentLine = "";
    if (screenWidth > 320 && screenWidth < 385) {
      words.forEach((word) => {
        if (currentLine.length + word.length > 23) {
          newText += `${currentLine}<br>`;
          currentLine = "";
        }
        currentLine += `${word} `;
      });

      if (currentLine.length > 0) {
        newText += currentLine.trim();
      }
      textHeading.innerHTML = newText;
    } else if (screenWidth < 320) {
      words.forEach((word) => {
        if (currentLine.length + word.length > 18) {
          newText += `${currentLine}<br>`;
          currentLine = "";
        }
        currentLine += `${word} `;
      });

      if (currentLine.length > 0) {
        newText += currentLine.trim();
      }
      textHeading.innerHTML = newText;
    } else {
      textHeading.innerHTML = originalText;
    }
  }
}
