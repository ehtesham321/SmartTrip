<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList" %>
<%@page import="TripPackage.NodeClass" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		 
        <link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
        <title>Route Details</title>
        
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
		#node {
    border-radius: 50px;
    border: 2px solid #73AD21;
    padding: 5px; 
    width: 200px;
    height: 150px;  
      
				}
		footer {
		    padding: 1em;
		    color: white;
		    background-color: background-color:rgba(0,0,0,0.5);
		    clear: left;
		    text-align: center;
		}
		</style>
		<header>
		   <h1  align="center" style="font-family:'AppleGothic'">SMART TRIP</h1>
		   <h3  align="center" style="font-family:'AppleChancery'" >The smarter way to travel</h3>
		 </header>
		 
          
    </head>
    <body background="nyc.jpg">
    	<!-- <label style="font-size:32px; position:fixed; top:15%; left:43%;padding:10px;"> Route Details </label>-->
    	<div id="form" name="FormController">
    	<fieldset id="SearchForm" class="SearchForm">
    	<div id="nav" name="NavController" align="right">
		<a href="http://localhost:8081/SmartTrip/Search.jsp"><font color="white">HOME</font></a>
		<a herf="#"><font color="white">EXPLORE</font></a>
		</div>
        <!-- <div style="padding:10px;border:1px solid black;border-radius: 5px; background: skyblue;">-->
	        <div align="center" "font-size:24px; margin:10px; padding:10px; border:1px solid blue;border-radius: 5px; background: yellow; float:left;">
	            <font color="white">Summary:</font>
	            <hr>
	            <font color="white">Total Cost($): ${total_cost}</font>
	            <br />
	            <font color="white">Total Time(Hrs): ${total_time}</font>
	        </div>
	        <hr>
	        <br>
	        <!-- <div align="center" style="font-size:24px; margin:10px; padding:10px; border:1px solid green;border-radius:5px; background:white; float:right;"> -->
	            
		            
		            <% 
		            
	                ArrayList<NodeClass> nodes = (ArrayList<NodeClass>)request.getAttribute("nodes");
	                    for(int i = 0; i < nodes.size(); i++)
	                    {	
	                  
	                    	out.println("<table border='0' style=\"width:30%\" align='center' id='node'>");
	                    	out.println("<tbody>");
	                    	
	                    	out.println("<tr>");
	                    
	                    	out.println("<th  colspan=\"3\" align='center'><font color='white'>" + nodes.get(i).NodeName + "</font></th>");
		     
		                    out.println("</tr>");
	                    	
	                    	out.println("<tr>");
	                    	out.println("<td rowspan=\"3\"><img src=\"nyc.jpg\" height=\"80\" width=\"80\"></td>");
	                    	out.println("<td align='center'><font color='white'>" + "Time" + "</font></td>");
		                    out.println("<td align='center'><font color='white'>" + nodes.get(i).Time + "</font></td>");
		                    out.println("</tr>");
		                    
		                    out.println("<tr>");
	                    	//out.println("<td rowspan=\"3\"><img src=\"smiley.gif\" height=\"80\" width=\"80\"></td>");
	                    	out.println("<td align='center'><font color='white'>" + "Cost" + "</font></td>");
		                    out.println("<td align='center'><font color='white'>" + nodes.get(i).Cost + "</font></td>");
		                    out.println("</tr>");
		                    
		                    out.println("<tr>");
	                    	//out.println("<td rowspan=\"3\"><img src=\"smiley.gif\" height=\"80\" width=\"80\"></td>");
	                    	//out.println("<td align='center'><font color='white'>" + System.out.print("five") + "</font></td>");
	                    	//out.println("<form action=\"nodes.get(i).Website>\"");
	                    	//<form action=nodes.get(i).Website>
   							// <input type="submit" value="This is a button link">
	                    	out.println("<td align='center'><font color='white'>" + "<a href=\""+nodes.get(i).Website +"\" >Website</a>" + "</font></td>");
	                    	// out.println("</form>");
		                    //out.println("<td align='center'><font color='white'>" + "<button class=\"button button2\">Website</button>" + "</font></td>");
		                    out.println("</tr>");
		                    
	                        
	                        out.println("</tbody>");
	                        out.println("</table>");
	                        out.println("<br/>");
	                    }
	                    
	                    
	            	%>
		        
		        
		        <table id="hiddentable" style="display:none">
		        
		        <% 
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
	        <!-- </div> -->
		<!-- </div> -->
		

		<hr>
		<div id="floating-panel">
	    <b>Mode of Travel: </b>
	    <select id="mode">
	      <option value="DRIVING">Driving</option>
	      <option value="WALKING">Walking</option>
	      <option value="BICYCLING">Bicycling</option>
	      <option value="TRANSIT">Transit</option>
	    </select>
	    </div>
	    
	    <div id="floating-panel">
	    <b>Start: </b>
	    <select id="start">
	      <%
	      for(int i=0;i<nodes.size();i++){
	    	  out.println("<option value=\""+nodes.get(i).Lat+", "+nodes.get(i).Long+"\">"+nodes.get(i).NodeName+"</option>");
	      }
	      %>
	    </select>
	    <b>End: </b>
	    <select id="end">
	      <%
	      for(int i=0;i<nodes.size();i++){
	    	  out.println("<option value=\""+nodes.get(i).Lat+", "+nodes.get(i).Long+"\">"+nodes.get(i).NodeName+"</option>");
	      }
	      %>
	    </select>
	    </div>
    
    
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
		
		$(document).ready(function () {
			setTimeout(function() { initialize(); }, 400);
		});
		
		function initialize() {           
			infowindow = [];
			markers = [];
			GetValues();
			iterator = 0;
			areaiterator = 0;
			var table = document.getElementById("mytab1");
			var directionsDisplay = new google.maps.DirectionsRenderer;
	        var directionsService = new google.maps.DirectionsService;
	        
			region = new google.maps.LatLng(latitude[areaiterator], longitude[areaiterator]);
			map = new google.maps.Map(document.getElementById("Google_Map"), { 
				zoom: 4,
				mapTypeId: google.maps.MapTypeId.ROADMAP,
				center: region,
			});
			
			directionsDisplay.setMap(map);
			
			calculateAndDisplayRoute(directionsService, directionsDisplay);
	        document.getElementById('mode').addEventListener('change', function() {
	          calculateAndDisplayRoute(directionsService, directionsDisplay);
	        });
	        
	        document.getElementById('start').addEventListener('change', function() {
		          calculateAndDisplayRoute(directionsService, directionsDisplay);
		        });
	        
	        document.getElementById('end').addEventListener('change', function() {
		          calculateAndDisplayRoute(directionsService, directionsDisplay);
		        });
			
			drop();
		}
		
		function calculateAndDisplayRoute(directionsService, directionsDisplay) {
	        var selectedMode = document.getElementById('mode').value;
	        directionsService.route({
	        	origin: document.getElementById('start').value,
	        	destination: document.getElementById('end').value,
	          // Note that Javascript allows us to access the constant
	          // using square brackets and a string value as its
	          // "property."
	          travelMode: google.maps.TravelMode[selectedMode]
	        }, function(response, status) {
	          if (status == 'OK') {
	            directionsDisplay.setDirections(response);
	          } else {
	            window.alert('Directions request failed due to ' + status);
	          }
	        });
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
		</div>
		
		
  <hr>
    </body>
    <footer>
	  <p>Copyright © Team 1</p>
	</footer>
</html>
