<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@page import="TripPackage.PackageClass" %>


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
        <div style="padding: 10px; width:50% ">
            <h2>Plans based on your information:</h2>
            <table class="table table-striped" style="font-size:24px; border:1px solid lightgrey; border-radius:5px;">
                <tr>
                    <th><b>Plan(s)</th>
                    <th>Time(Hrs)</th> 
                    <th>Cost($)</b></th>
                </tr>
                <%
                ArrayList<PackageClass> plansList = (ArrayList<PackageClass>) request.getAttribute("plansList");
                for(int i=0 ; i < plansList.size();i++)
                {
                    out.println("<tr>");
                    out.println("<td><a href=\"plans?action="+plansList.get(i).PlanName+"\">"+ plansList.get(i).PlanName+"</a></td>");
                    out.println("<td>"+ plansList.get(i).Time+"</td>");
                    out.println("<td>"+ plansList.get(i).Fare+"</td>");
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
        </div>
        <footer>
	        <h4>Copyright © Team 1</h4>
		</footer>
	</body>   
</html>