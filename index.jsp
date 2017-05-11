<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 	
		<style>
			header {
						background-color:yellow;
						padding: 1em;
						clear: left;
				}
			footer {
					    padding: 1em;
					    color: white;
					    position:fixed; 
					    top:92%;
					    width:100%; 
					    background-color: limegreen;
					    clear: left;
					    text-align: center;
				}
		</style>
		<header>
			   <h1  style="font-family:'AppleGothic'; color: royalblue; font-size:52px; boldfont-weight: bold;">SMART TRIP</h1>
			   <h3  align="center" style="font-family:'AppleChancery'; color: darkgray; font-size:30px; font-weight: bold;" >The smarter way to travel</h3>
		</header>
	</head>
	<body>
		<div id="searchform" Style="font-size:20px; width:33%; position:fixed; top:26%; left:40%;">
			<form method="POST" action="search" name="searchPage" class="simple_form">
				<table class="table table-striped" style=" border:1px solid lightgrey; border-radius:5px;">
				<tr id="arrivalTime">
			 		<td> ARRIVAL TIME: </td>
				 	<td><input type="datetime-local" name="userarrivalTime" /></td>
				 </tr>
				 <tr id="departureTime">
				 	<td> DEPARTURE TIME: </td>
				 	<td><input type="datetime-local" name="userdepartureTime" /></td>
				 </tr>
				 <tr id="budget">
					 <td> BUDGET: </td>
					 <td><input type="val"  name="userbudget" /></td>
				</tr>
				<tr id="citySelect">
				 	<td> SELECT CITY: </td>
				 	<td>
				 		<select type="singleSelect" name="usercitySelect" >
				 		<option value="default">NEW YORK CITY</option>
				 		</select>
				 	</td>		 	
				 </tr>
				 <tr id="buttons">
				 	<td><input type="reset" id="reset" value="Reset" /></td>
				 	<td><input type="submit" name="search" value="Search" /></td>
				 </tr>
			</table>
			<!--TODO: Interest selection
			<span id="interest"> INTEREST: 
				<input type="radio" ng-model="user.interest" value="all" /> ALL
				<input type="radio" ng-model="user.interest" value="clture" /> CULTURE
				<input type="radio" ng-model="user.interest" value="entertainment" />ENTERTAINMENT
				<input type="radio" ng-model="user.interest" value="food" /> FOOD
				<input type="radio" ng-model="user.interest" value="shopping" />SHOPPING				 	
				<input type="radio" ng-model="user.interest" value="sport" />SPORT
			</span>	
			-->
			</form>
	    </div>
	
		<div class="w3-content w3-section" style="padding:10px; ">
			<img class="mySlides w3-animate-fading" src="download.jpg" width="28%" >
		  	<img class="mySlides w3-animate-fading" src="images.jpg" width="28%">
		  	<img class="mySlides w3-animate-fading" src="mt-everest-tourism-171676392.jpg" width="28%">
		  	<img class="mySlides w3-animate-fading" src="traveller.jpg" width="28%">
		</div>
		<script>
			var myIndex = 0;
			carousel();
			
			function carousel() {
			    var i;
			    var x = document.getElementsByClassName("mySlides");
			    for (i = 0; i < x.length; i++) {
			       x[i].style.display = "none";
			    }
			    myIndex++;
			    if (myIndex > x.length) {myIndex = 1}
			    x[myIndex-1].style.display = "block";
			    setTimeout(carousel, 9000);
			}
		</script>
		<footer>
	        <h4>Copyright © Team 1</h4>
		</footer>
	</body>   
</html>
