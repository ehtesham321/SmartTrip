<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
<html>
<head>
<style>
tr {
	align: center;
}
input[type=val] {
    border: 1px solid #111;
    padding: 0.5em;
    font-size: 15px;
    line-height: 1.2em;
    width: 40%;
    background: #444;
    color: #fff;
    font-family: helvetica, sans-serif;
    background: -webkit-gradient(linear, left top, left bottom, from(#222), to(#444));
    -webkit-appearance: none;
    /*box-shadow*/
    -webkit-box-shadow: 1px 1px 1px #333;
    -moz-box-shadow: 1px 1px 1px #333;
    box-shadow: 1px 1px 1px #333;
}
input[name=usercitySelect] {
    border: 1px solid #111;
    padding: 0.5em;
    font-size: 15px;
    line-height: 1.2em;
    width: 40%;
    background: #444;
    color: white;
    font-family: helvetica, sans-serif;
    background: -webkit-gradient(linear, left top, left bottom, from(#222), to(#444));
    -webkit-appearance: none;
    /*box-shadow*/
    -webkit-box-shadow: 1px 1px 1px #333;
    -moz-box-shadow: 1px 1px 1px #333;
    box-shadow: 1px 1px 1px #333;
}
input[type=datetime-local] {
    border: 1px solid #111;
    padding: 0.5em;
    font-size: 15px;
    line-height: 1.2em;
    width: 40%;
    background: #444;
    color: #fff;
    font-family: helvetica, sans-serif;
    background: -webkit-gradient(linear, left top, left bottom, from(#222), to(#444));
    -webkit-appearance: none;
    /*box-shadow*/
    -webkit-box-shadow: 1px 1px 1px #333;
    -moz-box-shadow: 1px 1px 1px #333;
    box-shadow: 1px 1px 1px #333;
}
input[type=submit] {

background-color: #008CBA; /* Green */
    border: 1px solid #111;
    width: 40%;
    color: white;
    padding: 4px 60px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    display: table;
	align: center;
    
}
input[type=reset] {
background-color: #008CBA; 
    border: none;
    color: white;
    padding: 4px 60px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    align: center;
}
fieldset {
    background-color:rgba(0,0,0,0.9);
    display: block;
    margin-left: 120px;
    margin-right: 120px;
    padding-top: 0.35em;
    padding-bottom: 0.625em;
    padding-left: 0.75em;
    padding-right: 0.75em;
    border: 2px groove (internal value);
    box-shadow: 1px 2px 3px rgba(0,0,0,.5);
}
legend {
    background-color:rgba(0,0,0,0.5);
}
header {
	background-color:rgba(0,0,0,0.5);
	padding: 1em;
	clear: left;
}
h1 {
	text-align: center;
	text-color: '#87CEFA';
	color: #87CEFA;
	font-family:'American Typewriter';
}
h3 {
	text-align: center;
	text-color: '#87CEFA';
	color: #87CEFA;
}
footer {
    padding: 1em;
    color: white;
    background-color: background-color:rgba(0,0,0,0.5);
    clear: left;
    text-align: center;
}
</style>
<link rel="stylesheet" type="text/css" href="home.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">



<header>
    <h1  style="font-family:'AppleGothic'">SMART TRIP</h1>
    <h3  align="center" style="font-family:'AppleChancery'" >The smarter way to travel</h3>
  </header>
</head>
<body background="nyc.jpg">
<div/>

	
	<div id="form" name="FormController">
	<fieldset id="SearchForm" class="SearchForm">
	<div id="nav" name="NavController" align="right">
	<a href="#"><font color="white">HOME</font></a>
	<a herf="#"><font color="white">EXPLORE</font></a>
	</div>
 	  <form method="POST" action="search" name="searchPage" class="simple_form">
 	  <table style="width:100%">
 	  
 	  <tr>
 	 	 <span id="arrivalTime" >
 	 	 <td style="text-color:'white'"><font color="white">When Would You Like To Start?:</font></td>
 	 	 <td><input type="datetime-local" name="userarrivalTime" /></td>
 	 	 </span>
 	  </tr>
 	  <tr>
 	  	<span id="departureTime">
 	  	<td><font color="white"> When Would You Want To Go Back? </font></td>
 	  	<td><input type="datetime-local" name="userdepartureTime" /></td>
 	  	 </span>
 	  </tr>
 	  <tr>
 	  	 <span id="budget">
 	 	 <td><font color="white">What Would Your Budget Be?:</font></td>
 	 	 <td><input type="val"  name="userbudget" /></td>
 	 	 </span>
 	  </tr>
 	 <tr>
 	 	<span id="citySelect">
 	  	<p id="buttons">
                <td><font color="white">Please Select A City </font></td>
 	  	<td><select type="singleSelect" name="usercitySelect" >
 	  	<option value="default">NEW YORK CITY</option>
 	  	</select></td>
 	  	</span>
 	  	
 	  </tr>
 	  <tr>
 	  	<p id="buttons">
 	  	<td><!-- <input type="reset" id="reset" value="Reset" />--></td>
   	<td><input type="submit" name="search"  value="Search" /></td>
 	  	</p>
                <script>
                     jsFormValidator.App.create().Validator.applyRules('Search');
                     </script>
                
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
      <hr>
      <div class="w3-content w3-section" style="max-width:500px" align="center">
	
		<img class="mySlides w3-animate-fading" src="download.jpg" style="width:60%">
	  	<img class="mySlides w3-animate-fading" src="images.jpg" style="width:60%">
	  	<img class="mySlides w3-animate-fading" src="mt-everest-tourism-171676392.jpg" style="width:60%">
	  	<img class="mySlides w3-animate-fading" src="traveller.jpg" style="width:60%">
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
	
      </fieldset>
    </div>

	<div align="center">
	<a href="http://localhost:8000/SmartTrip/AdminLogin.jsp">Admin</a>
	</div>
	</body>
<footer>
  <p>Copyright © Team 1</p>
</footer>
</html>