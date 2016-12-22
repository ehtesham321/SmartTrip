
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
 	  
<form>

	<!-- Form Name -->
<!-- <legend>Form Name</legend> -->

<!-- Text input-->
<div align="center" class="form-group">
  <label class="col-md-4 control-label" for="textinput">Transport From</label>  
  <div class="col-md-4">
  <input id="textinput" name="textinput" type="text" placeholder="Transport From" class="form-control input-md"> 
  </div>
</div>

<!-- Text input-->
<div align="center" class="form-group">
  <label class="col-md-4 control-label" for="textinput">Transport To</label>  
  <div class="col-md-4">
  <input id="textinput" name="textinput" type="text" placeholder="Transport To" class="form-control input-md">
  </div>
</div>

<!-- Text input-->
<div align="center" class="form-group">
  <label class="col-md-4 control-label" for="textinput">Transport By</label>  
  <div class="col-md-4">
  <input id="textinput" name="textinput" type="text" placeholder="Transport By" class="form-control input-md">   
  </div>
</div>

<!-- Text input-->
<div align="center" class="form-group">
  <label class="col-md-4 control-label" for="textinput">Transport Cost</label>  
  <div class="col-md-4">
  <input id="textinput" name="textinput" type="text" placeholder="Transport Cost" class="form-control input-md">   
  </div>
</div>

<!-- Text input-->
<div align="center" class="form-group">
  <label class="col-md-4 control-label" for="textinput">Transport Time</label>  
  <div class="col-md-4">
  <input id="textinput" name="textinput" type="text" placeholder="Transport Time" class="form-control input-md">
  </div>
</div>
<br>
<!-- Button -->
<div align="center" class="form-group">
  <label class="col-md-4 control-label" for="singlebutton"></label>
  <div class="col-md-4">
    <button id="singlebutton" name="singlebutton" class="btn btn-primary">Submit</button>
  </div>
</div>
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



