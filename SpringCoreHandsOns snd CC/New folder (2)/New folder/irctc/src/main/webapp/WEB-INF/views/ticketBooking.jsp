<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: rgb(200, 240, 300)">
	<br>
	<br>
	<!-- Add code here.. -->

	<h1 id="heading">Indian Railway System</h1>
	<center style="font-weight: bold;">Book Your Tatkal Ticket</center>
	<sf:form action="/showTicketBookingForm" name="form"
		modelAttribute="ticketBooking">
		<table>
			<tr>
				<td>Customer Name:</td>
				<td><sf:input path="customerName" id="customerName" /></td>
			</tr>
			<tr>
				<td>Mobile Number:</td>
				<td><sf:input path="mobileNumber" id="mobileNumber" /></td>
			</tr>
			<tr>
				<td>From:</td>
				<td><sf:input path="noOfTickets" id="noOfTickets" /></td>
				
			</tr>
			<tr>
				<td>TO:</td>
				<td><sf:select path="toCity" items="${cityListTo }"
						id="toCity" /></td>
			</tr>
			<tr>
				<td>class:</td>
				<td><sf:select path="travelClass" items="${classTypes }"
						id="travelClass" /></td>
			</tr>
			<tr>
				<td>No.Of Tickets:</td>
				<td><sf:select path="travelClass" "
						id="travelClass" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Book" /></td>
				<td><input type="reset" value="Clear" /></td>
			</tr>
		</table>
	</sf:form>

</body>
</html>