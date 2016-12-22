<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@page import="TripPackage.PackageClass" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
<title>Packages</title>


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
    border: none;
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
#node {
  
    border-radius: 50px;
    border: 2px solid #73AD21;
    padding: 20px; 
    width: 200px;
    height: 150px;    
}
</style>
<header>
   <h1  style="font-family:'AppleGothic'">SMART TRIP</h1>
   <h3  align="center" style="font-family:'AppleChancery'" >The smarter way to travel</h3>
 </header>
</head>

<body background="nyc.jpg">
	<div id="form" name="FormController">
	<fieldset id="SearchForm" class="SearchForm">
	<div id="nav" name="NavController" align="right">
	<a href="http://localhost:8081/SmartTrip/Search.jsp"><font color="white">HOME</font></a>
	<a herf="#"><font color="white">EXPLORE</font></a>
	</div>
	<h1>Plans based on your information</h1>
	<table align="center" style="width:60%" border="0">
	  <tr>
	    <th><font color="white"><u>Plans</u></font></th>
	    <th><font color="white"><u>Time (Hrs)</u></font></th> 
	    <th><font color="white"><u>Cost ($)</u></font></th>
	  </tr>
	 
	  <%
	  ArrayList<PackageClass> plansList = (ArrayList<PackageClass>) request.getAttribute("plansList");
	  for(int i=0 ; i < plansList.size();i++)
	  {
		  out.println("<tr>");
		  out.println("<td align='center'><a href=\"plans?action="+plansList.get(i).PlanName+"\"><font color='white'>"+ plansList.get(i).PlanName+"</font></a></td>");
		  out.println("<td align='center'><font color='white'>"+ plansList.get(i).Time+"</font></td>");
		  out.println("<td align='center'><font color='white'>"+ plansList.get(i).Fare+"</font></td>");
		  out.println("</tr>");
		  
		  
	  }
	  %>
	  
	  
	  
	<!--
	  <tr>
	    <td>Plan 1</td>
	    <td>5 hours</td> 
	    <td>50$</td>
	  </tr>
	  <tr>
	    <td>Plan 2</td>
	    <td>6 hours</td> 
	    <td>20$</td>
	  </tr>
	  <tr>
	    <td>Plan 3</td>
	    <td>7 hours</td> 
	    <td>80$</td>
	  </tr>
	-->
	</table>
	
	<hr>
		<div align="center" id="google_map" style="width: 100%; height: 400px;"></div>

	  <script>
      var map;
      function initMap() {
        map = new google.maps.Map(document.getElementById('google_map'), {
          center: {lat: -34.397, lng: 150.644},
          zoom: 8
        });
        
        if (navigator.geolocation) {
            navigator.geolocation.getCurrentPosition(function (position) {
                initialLocation = new google.maps.LatLng(position.coords.latitude, position.coords.longitude);
                map.setCenter(initialLocation);
            });
        }
      }
      
      function grabMyPosition() {
    	    if (navigator.geolocation) {
    	        navigator.geolocation.getCurrentPosition(centerMe);
    	    } else {
    	        alert("You don't support this");
    	    }
    	}
      
    	function centerMe(position) {
    	    var coords = new google.maps.LatLng(
    	        position.coords.latitude,
    	        position.coords.longitude
    	    );

    	    map.setCenter(coords);
    	}
    	
    	
    </script>
    <script src="https://developers.google.com/maps/documentation/javascript/examples/markerclusterer/markerclusterer.js">
    </script>
    <script async defer
    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyA0YdltJ_hj0sXEVKHUDZ1jGwsbWfsvF9g&callback=initMap">
    </script>
	</fieldset>
	</div>
	
</body>
<footer>
  <p>Copyright © Team 1</p>
</footer>
</html>