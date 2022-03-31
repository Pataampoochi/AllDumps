<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Indian Railway System</title>
</head>
<body style="background-color: rgb(200, 240, 300)">
	<br>
	<br>
	<!-- Add code here.. -->
	<h1>Book your Tatkal Ticket</h1>
	<sf:form name="form" method="post" action="ticketBookingResult.jsp" modelAttribute="ticketBooking">
		<table>
			<tr>
				<td>Customer Name:</td>
				<td><sf:input id="customerName" path="customerName"/></td>
				<td><sf:errors path="customerName" style="color:red;"></sf:errors></td>
			</tr>
			
			<tr>
				<td>Mobile Number:</td>
				<td><sf:input id="mobileNumber" path="mobileNumber"/></td>
				<td><sf:errors path="mobileNumber" style="color:red;"></sf:errors></td>
			</tr>
			
			<tr>
				<td>From</td>
				<td><sf:select id="fromCity" path="fromCity" items="${fromCities}"/></td>
			</tr>
			
			<tr>
				<td>To</td>
				<td><sf:select id="toCity" path="toCity" items="${toCities}"/></td>
			</tr>
			
			<tr>
				<td>Class</td>
				<td><sf:select id="travelClass" path="travelClass" items="${class}"/></td>
			</tr>
			
			<tr>
				<td>No of Tickets</td>
				<td><sf:input id="noOfTickets" path="noOfTickets"/></td>
				<td><sf:errors path="noOfTickets" style="color:red;"></sf:errors></td>
			</tr>
			<tr>
				<td><input type="submit" value="Book" id="submit"/></td>
				<td><input type="reset" value="Clear"/></td>
			</tr>
			
		</table>
	</sf:form> 
 
</body>
</html>