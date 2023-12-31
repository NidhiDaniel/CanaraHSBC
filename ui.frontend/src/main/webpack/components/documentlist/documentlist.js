$(document).ready(function () { 
    if(document.getElementById("Documentlist_seemore") !== null){
        var seeMore = document.getElementById("Documentlist_seemore").value;
        }
    $('.documentlist_download_list ul').each(function(){
        var LiN = $(this).find('li').length;
        if (window.matchMedia("(max-width: 767px)").matches){
            if( LiN > 3){    
                $('li', this).eq(2).nextAll().hide().addClass('toggleable');
                $(this).append('<li class="more documentlistMore">'+seeMore+'</li>');
            }
        }
        else{
        if( LiN > 5){    
            $('li', this).eq(4).nextAll().hide().addClass('toggleable');
            $(this).append('<li class="more documentlistMore">'+seeMore+'</li>');
        }
        var newLiN = $(this).find('li').length;
        }
    });

    $('.documentlist_download_list ul').on('click','.documentlistMore', function(){
        let docDownUl = $(this).parent();
        let docDownList = docDownUl.parent();
        if(docDownList.siblings("#Documentlist_shownItems") !== null){
            var nextLoad = (parseInt(docDownList.siblings("#Documentlist_shownItems").attr("value"))) ;
            var shownItems;
            if (window.matchMedia("(max-width: 767px)").matches){
                shownItems = nextLoad + 3 ;
            }
            else{
                 shownItems = nextLoad + 5 ;
            }
        }
        var docLength = (docDownUl.find('li').length)-1;
        if( $(this).hasClass('less') ){    
            $(this).text('See More').removeClass('less'); 
            $(this).siblings('li.toggleable').slideToggle();
            docDownList.siblings("#Documentlist_shownItems").val("0");   
          }
        if(docLength>shownItems){
            $(this).siblings('li.toggleable').slice(nextLoad,nextLoad+3).slideToggle();
            var limit = shownItems+3;
            docDownList.siblings("#Documentlist_shownItems").val(nextLoad+3);
            if(limit>=docLength){
                $(this).text('See Less').addClass('less'); 
            }
        }       
    });
    
        $(".docpopUp").click(function(){
            let parentOfDocpopup=$(this).parent();
            parentOfDocpopup.parent().siblings("#vernacularLanguagePopup").modal('show');
        });
    
});
