
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList" %>
<%@page import="TripPackage.NodeClass" %>
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
    border: none;
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
  body {
    padding-top: 120px;
    padding-bottom: 40px;
    background-color: #eee;
  
  }
  .btn 
  {
   outline:0;
   border:none;
   border-top:none;
   border-bottom:none;
   border-left:none;
   border-right:none;
   box-shadow:inset 2px -3px rgba(0,0,0,0.15);
  }
  .btn:focus
  {
   outline:0;
   -webkit-outline:0;
   -moz-outline:0;
  }
  
  
  .form-signin {
    max-width: 280px;
    padding: 15px;
    margin: 0 auto;
      margin-top:50px;
  }
  .form-signin .form-signin-heading, .form-signin {
    margin-bottom: 10px;
  }
  .form-signin .form-control {
    position: relative;
    font-size: 16px;
    height: auto;
    padding: 10px;
    -webkit-box-sizing: border-box;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
  }
  .form-signin .form-control:focus {
    z-index: 2;
  }
  .form-signin input[type="text"] {
    margin-bottom: -1px;
    border-bottom-left-radius: 0;
    border-bottom-right-radius: 0;
    border-top-style: solid;
    border-right-style: solid;
    border-bottom-style: none;
    border-left-style: solid;
    border-color: #000;
  }
  .form-signin input[type="password"] {
    margin-bottom: 10px;
    border-top-left-radius: 0;
    border-top-right-radius: 0;
    border-top-style: none;
    border-right-style: solid;
    border-bottom-style: solid;
    border-left-style: solid;
    border-color: rgb(0,0,0);
    border-top:1px solid rgba(0,0,0,0.08);
  }
  .form-signin-heading {
    color: #fff;
    text-align: center;
    text-shadow: 0 2px 2px rgba(0,0,0,0.5);
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
	<a href="http://localhost:8081/SmartTrip/Search.jsp"><font color="white">HOME</font></a>
	<a herf="#"><font color="white">EXPLORE</font></a>
	</div>
 	  
<form name="addlocation" method="post" action="addLocation">

	<!-- Form Name -->
<!-- <legend>Form Name</legend> -->

<!-- Text input-->
<div align="center" class="form-group">
  <label class="col-md-4 control-label" for="textinput">Location name</label>  
  <div class="col-md-4">
  <input id="location" name="location" type="text" placeholder="Location name" class="form-control input-md">
    
  </div>
</div>

<!-- Text input-->
<div align="center" class="form-group">
  <label class="col-md-4 control-label" for="textinput">Cost</label>  
  <div class="col-md-4">
  <input id="cost" name="cost" type="text" placeholder="Cost" class="form-control input-md">
    
  </div>
</div>

<!-- Text input-->
<div align="center" class="form-group">
  <label class="col-md-4 control-label" for="textinput">City</label>  
  <div class="col-md-4">
  <!--input id="city" name="city" type="text" placeholder="City" class="form-control input-md"-->
  <select name="selectcity" id = "selectcity" onchange="initialize();">
        <option value="NewYorkCity">NewYorkCity</option>
        <option value="LosAngeles">LosAngeles</option>
   </select>
    
  </div>
</div>


<div align="center" class="form-group">
  <label class="col-md-4 control-label" for="textinput">Pincode</label>  
  <div class="col-md-4">
  <input id="pincode" name="pincode" type="text" placeholder="Pincode" class="form-control input-md">
    +
  </div>
</div>

<!-- Text input-->
<div align="center" class="form-group">
  <label class="col-md-4 control-label" for="textinput">Average time to visit</label>  
  <div class="col-md-4">
  <input id="time" name="time" type="text" placeholder="Average time to visit" class="form-control input-md">
    
  </div>
</div>

<!-- Text input-->
<div align="center" class="form-group">
  <label class="col-md-4 control-label" for="textinput">Latitude</label>  
  <div class="col-md-4">
  <input id="Latitude" name="Latitude" type="text" placeholder="Latitude" class="form-control input-md">
    
  </div>
</div>


<!-- Text input-->
<div align="center" class="form-group">
  <label class="col-md-4 control-label" for="textinput">Longitude</label>  
  <div class="col-md-4">
  <input id="Longitude" name="Longitude" type="text" placeholder="Longitude" class="form-control input-md">
    
  </div>
</div>
<div align="center" class="form-group">
  <label class="col-md-4 control-label" for="textinput">Website</label>  
  <div class="col-md-4">
  <input id="Website" name="Website" type="text" placeholder="Website" class="form-control input-md">
    
  </div>
</div>
<!--
<br>
<div align="center" class="form-group">
  <input type="button" id="searchbutton" name="searchbutton" value="Search" style="height:10px;width:50px" onclick="pincodeLocation();">Search</button>
</div>
-->
<br>
<!-- Button -->
<div align="center" class="form-group">
  <label class="col-md-4 control-label" for="singlebutton"></label>
  <div class="col-md-4">
    <button id="singlebutton" name="singlebutton" class="btn btn-primary">Submit</button>
  </div>
</div>
		            
	                
		  
		  <table id="hiddentable" style="display:none">
			
	        <% 
	        ArrayList<NodeClass> nodes = (ArrayList<NodeClass>)request.getAttribute("nodes");
                  for(int i = 0; i < nodes.size(); i++)
                  {
                  	
                      out.println("<tr>");
                      out.println("<td>" + nodes.get(i).NodeName + "</td>");
                      out.println("<td>" + nodes.get(i).Lat+"</td>");
                      out.println("<td>" + nodes.get(i).Long+"</td>");
                      out.println("</tr>");
                      
                  }
                  
                  
          	%>
	        
	        </table>
<hr>
		<div align="center" id="Google_Map" style="width: 100%; height: 400px;"></div>
		<script type="text/javascript" src="http://code.jquery.com/jquery-2.1.0.min.js"></script>
		<script type="text/javascript" src="http://maps.google.com/maps/api/js?key=AIzaSyA0YdltJ_hj0sXEVKHUDZ1jGwsbWfsvF9g"></script>
	  <script type="text/javascript">
	  
		var contentstring=[];
		
		var latitude=[];
		var longitude=[];
		var markers = [];
		var iterator = 0;
		var areaiterator = 0;
		var map;
		var infowindow = [];
		geocoder = new google.maps.Geocoder();
		
		//$(document).ready(function () {
			//setTimeout(function() { initialize(); }, 400);
		//});
		
		function initialize() {           
			infowindow = [];
			markers = [];
			GetValues();
			iterator = 0;
			areaiterator = 0;
			region = new google.maps.LatLng(latitude[areaiterator], longitude[areaiterator]);
			map = new google.maps.Map(document.getElementById("Google_Map"), { 
				zoom: 4,
				mapTypeId: google.maps.MapTypeId.ROADMAP,
				center: region,
			});
			drop();
		}
		
		function GetValues() {
			//Get the Latitude and Longitude of a Point site : http://itouchmap.com/latlong.html
			
			
			var hiddentable = document.getElementById("hiddentable");
			for (var i = 0;i<hiddentable.rows.length; i++) {
			   //iterate through rows
			    var row=hiddentable.rows[i];
				contentstring[i] = row.cells[0].innerHTML;
				latitude[i] = row.cells[1].innerHTML;
				longitude[i] = row.cells[2].innerHTML;
			}
			
		}
			   
		function drop() {
			for (var i = 0; i < contentstring.length; i++) {
				setTimeout(function() {
					addMarker();
				}, 800);
			}
		}
	 
		function addMarker() {
			var address = contentstring[areaiterator];
			var icons = 'http://maps.google.com/mapfiles/ms/icons/red-dot.png';
			var templat = latitude[areaiterator];
			var templong = longitude[areaiterator];
			var temp_latLng = new google.maps.LatLng(templat, templong);
			markers.push(new google.maps.Marker(
			{
				position: temp_latLng,
				map: map,
				icon: icons,
				draggable: false
			}));            
			iterator++;
			info(iterator);
			areaiterator++;
		}
	 
		function info(i) {
			infowindow[i] = new google.maps.InfoWindow({
				content: contentstring[i - 1]
			});
			infowindow[i].content = contentstring[i - 1];
			google.maps.event.addListener(markers[i - 1], 'click', function() {
				for (var j = 1; j < contentstring.length + 1; j++) {
					infowindow[j].close();
				}
				infowindow[i].open(map, markers[i - 1]);
			});
		}
    </script>
    
    
    

</fieldset>
</form>
      
	
	
	
      </fieldset>
    </div>

	
	</body>
<footer>
  <p>Copyright © Team 1</p>
  <p><a href="#">Admin</a></p>
  
</footer>
</html>



