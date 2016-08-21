
$('#tokenfield-typeahead').tokenfield();

$('#tokenfield-typeahead').tokenfield('readonly');

$('.token').click(function(){
	var thisToken = $(this);
	
	if (thisToken.hasClass('tagSelected'))
	{
		thisToken.removeClass('tagSelected');
		thisToken.css({'background-color': '#ededed'});
	}
	else
	{
		thisToken.addClass('tagSelected');
		thisToken.css({'background-color': '#42DCA3'});
	}
});

var tagsSelected = new Array();

$(document).ready(function(){
	if (tagsSelected.length == 0)
	{
		var allTokens = document.getElementsByClassName('token');
		for (var i = 0; i < allTokens.length; i++) {
			tagsSelected.push(allTokens[i].dataset.value);
		}
	}
	$.ajax({
		type : "GET",
		url : "photos",
		data : {
			myTags: tagsSelected //notice that "myArray" matches the value for @RequestParam
			//on the Java side
		},
		success : function(response) {
			$("#photosDiv").html(response); 
		},
		error : function(e) {
			alert('Error: ' + e);
		}
	}); 
});

$('.token').click(function(){		
	tagsSelected = new Array();
	$('.tagSelected').each(function() {
		tagsSelected.push($(this).data('value'));
	})
	if (tagsSelected.length == 0)
	{
		var allTokens = document.getElementsByClassName('token');
		for (var i = 0; i < allTokens.length; i++) {
			tagsSelected.push(allTokens[i].dataset.value);
		}
	}
	$.ajax({
		type : "GET",
		url : "photos",
		data : {
			myTags: tagsSelected //notice that "myArray" matches the value for @RequestParam
			//on the Java side
		},
		success : function(response) {
			$("#photosDiv").html(response); 
		},
		error : function(e) {
			alert('Photogallery error please refresh page.');
		}
	}); 
});