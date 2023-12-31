$(document).ready(function() {
    $('input[name="rating"]').on("change",function(){
        var rating = $("input[name='rating']:checked").val();
        if(rating == 5)
        {
            $("#ratingText").html("Excellent");        
        }
        if(rating == 4)
        {
            $("#ratingText").html("Very Good");        
        }
        if(rating == 3)
        {
            $("#ratingText").html("Satisfactory");        
        }
        if(rating == 2)
        {
            $("#ratingText").html("Average");        
        }
        if(rating == 1)
        {
            $("#ratingText").html("Poor");        
        }
    });
  });