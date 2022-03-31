<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight Booking</title>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"> </script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"> </script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

<style type="text/css">
body{
background-color: rgb(200, 240, 300); 

}
h1{
padding-left: 100px;
}
.col-xs-6{
margin-top: 150px;
}
.material-icons{
            vertical-align: middle;
        }
.navbar {
background-color:rgb(0, 150, 204) !important; 
}
.nav-link{
color:#000000 !important;
}
</style>
</head>
<body>
<!-- Navigation Bar-->
    <nav class="navbar navbar-expand-md bg-dark navbar-dark">
        <a class="nav-link" href="#">AirLines</a>
        
      

          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item">
              <a class="nav-link" href="#"><span class="material-icons">
                home</span> &nbspHome</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">International</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Domestic</a>
              </li> 
          </ul>
        </div>  
      </nav>
<!-- Stack the columns on mobile by making one full-width and the other half-width -->
<div class="row">
  <div class="col-xs-6"><img alt="images" src="images/2.jpg" ></div>
  <div class="col-xs-6">
	
	<!-- Add code here.. -->
	
	
 	<sf:form name="form" method="post" modelAttribute="ticketBooking" action="getTicketBookingResultPage">
 		<center>
 		 <h1 id="heading">Welcome To Indian AirLines</h1>
 		<table>
 			<center>Book your ticket</center>
 			<tr>
 				<td><sf:label path="customerName" >Customer Name:</sf:label></td>
 				<td><sf:input path="customerName" id="customerName" type="text"/></td>
 				<td><sf:errors path="customerName" cssStyle="color:red;"></sf:errors></td>
 			</tr>
 			<tr>
 				<td><sf:label path="mobileNumber" >Mobile Number:</sf:label></td>
 				<td><sf:input path="mobileNumber" id="mobileNumber" type="text"/></td>
 				<td><sf:errors path="mobileNumber" cssStyle="color:red;"></sf:errors></td>
 			</tr>
 			<tr>
 				<td><sf:label path="fromCity" >From:</sf:label></td>
 				<td><sf:select path="fromCity" id="fromCity" items="${fromCityList}"></sf:select>
 			</tr>
 			<tr>
 				<td><sf:label path="toCity" >To:</sf:label></td>
 				<td><sf:select path="toCity" id="toCity" items="${toCityList}"></sf:select>
 			</tr>
 			<tr>
 				<td><sf:label path="travelClass" >Class:</sf:label></td>
 				<td><sf:select path="travelClass" id="travelClass" items="${classTypeList}"></sf:select>
 			</tr>
 			<tr>
 				<td><sf:label path="noOfTickets" >No Of Tickets:</sf:label></td>
 				<td><sf:input path="noOfTickets" id="noOfTickets" type="text"/></td>
 				<td><sf:errors path="noOfTickets" cssStyle="color:red;"></sf:errors></td>
 			</tr>
 			<tr>
 				<td><sf:label path="">Select Date</sf:label></td>
 				<td><sf:input path="noOfTickets" id="noOfTickets" type="date"/></td>
 			</tr>
 			<tr>
 				<td><input type="submit" id="submit" value="Book"/></td>
 				<td><input type="reset" value="Clear"/></td>
 			</tr>
 		</table>
 		</center>
 	</sf:form>
 	</div></div>
</body>
</html>