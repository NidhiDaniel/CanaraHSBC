//Display Title in mobile view
$(document).ready(function () {
    if (window.matchMedia("(max-width: 991px)").matches) {
        if (document.getElementById("toggle") !== null) {
            var toggle = document.getElementById("toggle").value;
            if (toggle == "true") {
                $('#box').css({ 'display': 'block' });
            }
        }
    }
});
