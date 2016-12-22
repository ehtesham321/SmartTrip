<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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
		<title>Admin Login</title>
		<header>
			   <h1  style="font-family:'AppleGothic'; color: royalblue; font-size:52px; boldfont-weight: bold;">SMART TRIP</h1>
			   <h3  align="center" style="font-family:'AppleChancery'; color: darkgray; font-size:30px; font-weight: bold;" >The smarter way to travel</h3>
		</header>
	</head>
		
	<body>
		<div id="adminlogin" Style="font-size:24px; width:28%; position:fixed; top:26%; left:40%;">
			<h2 text-align="center"> SMART TRIP ADMIN LOGIN </h2>
			<form method="POST" action="adminlogin" name="adminLogin" class="simple_form">
				<table class="table table-striped" style=" border:1px solid lightgrey; border-radius:5px;">
					<tr id="adminUsername">
				 		<td> USERNAME: </td>
					 	<td><input type="text" name="adminUsername" /></td>
					 </tr>
					 <tr id="adminPassword">
				 		<td> PASWORD: </td>
					 	<td><input type="password" name="adminPassword" /></td>
					 </tr>
					 <tr id="buttons">
					 	<td><input type="reset" id="reset" value="Reset" /></td>
					 	<td><input type="submit" name="search" value="Search" /></td>
					 </tr>
				</table>		
			</form>
		</div>
        <footer>
	        <h4>Copyright © Team 1</h4>
		</footer>
	</body>   
</html>