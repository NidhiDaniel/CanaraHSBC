
$(function() {




    $(".search-but").on("click", function(event) {
        event.preventDefault();
        $("#search").addClass("open");

        document.getElementById("search").style.display = "block";
        $('#search > div > input[type="text"]').focus();
    });
    $("#search, #search button.close").on("click keyup", function(event) {
        if (event.target == this || event.target.className == "close" || event.keyCode == 27) {
            document.getElementById("search").style.display = "none";
        }
    });




});




$(document).ready(function() {






    //var value = document.getElementById("searchForm").getAttribute("action");

    var value = "/bin/choicesearchresult";

    var queryString = window.location.search;

    var fulltext = queryString.split("q=");
if(fulltext[1] ){
    if (fulltext[1].includes("%25")) {

        fulltext[1] = fulltext[1].replaceAll('%25', '%');

    }}
    var finalURL = value + "?fulltext=" + fulltext[1]+"&start=0";

    if (fulltext) {

        $.ajax({
            //async : false,
            url: finalURL,
            method: "GET",

            success: function(result) {
                var title = null;
                var url = null;
                var description = null;




                if (result) {
                    for (i = 0; i < result.length; i++) {
                        var innerHTML = "";
                        var descHTML = "";
                        var openHTML = "";
                        var closeHTML = "";

                        title = result[i].pageName;
                        url = result[i].pagePath;
                        description = result[i].pageDesc;
                        if (description) {
                            var desc_length = description.length;
                            if (desc_length > 35) {
                                description = truncate(description, 35);
                            }

                           // document.getElementById("search").style.display = "none";

                        }var html = appendHTML(title, url, description);
						   if(html){

                            $(".resultSection .searchresult").append(html);
                            var numItems = $('.results').length;
                            if (numItems == 0 ){
        $("#loadMore").hide();
 $("#noContent").show();
    }else{
     $("#loadMore").show();
    }
    if(numItems >0 && numItems < 10){$("#noContent").hide(); $("#loadMore").hide();}
						   }
                    }



                }

            }



        });
    }
	$("#loadMore").click(function(){
        var numItems = $('.results').length;


    if (numItems == 0 ){
        $("#loadMore").hide();
 $("#noContent").show();
    }else{
     $("#noContent").hide();
    }
    if(numItems >0 &&  numItems < 10){$("#loadMore").hide();}

		var queryString = window.location.search;
var value = "/bin/choicesearchresult";
    var fulltext = queryString.split("q=");
    if(fulltext[1] ){
    if (fulltext[1].includes("%25")) {

        fulltext[1] = fulltext[1].replaceAll('%25', '%');

    }}
	var numItems = $('.results').length;

	var start = numItems + 50;
    var finalURL = value + "?fulltext=" + fulltext[1]+"&start="+start;


	$.ajax({
            //async : false,
            url: finalURL,
            method: "GET",

            success: function(result) {
                var title = null;
                var url = null;
                var description = null;




                if (result) {
                    for (i = 0; i < result.length; i++) {
                        var innerHTML = "";
                        var descHTML = "";
                        var openHTML = "";
                        var closeHTML = "";

                        title = result[i].pageName;
                        url = result[i].pagePath;
                        description = result[i].pageDesc;
                        if (description) {
                            var desc_length = description.length;
                            if (desc_length > 35) {
                                description = truncate(description, 35);
                            }
                           var html = appendHTML(title, url, description);
						   if(html){
                            $(".resultSection .searchresult").append(html);
						   }
                           // document.getElementById("search").style.display = "none";

                        }
                    }



                }
			}
  });
        event.preventDefault();
  });

});


function truncate(str, n) {
    return (str.length > n) ? str.substr(0, n - 1) + '&hellip;' : str;
}

function appendHTML(title, url, description) {
    var flag = url.includes("knowledge-centre");
    var excludePathFlag = url.includes("site-configuration");
    var path;
    if(url.endsWith(".html")){
        path = url;
    }
    else {
            path = url + ".html";
    }
    if (!excludePathFlag) {
        if (!flag) {

            var openHTML = '<div class="results">' +
                '<p>';

            var innerHTML =
                '<div class="pageTitle" >' +
                '<a href="' + path + '" style="font-size:20px;color: blue;">' + title +
                '</a>' +
                '</div>';
				var descHTML="";
            if (description) {
                var descHTML = '<div class="pageDesc" style="font-size:14px;">' +
                    description +
                    '</div>';
            }

           var closeHTML = '</p>' +
                '</div>';

            if (innerHTML) {
                return  openHTML + innerHTML + descHTML + closeHTML;

            }
        }
    }
	return null;
}