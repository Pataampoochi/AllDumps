<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: rgb(200, 240, 300)">
	<br>
	<br>
	
	<!--Add code here  -->
	<h3 id="ticket">Congratulations, your ticket got booked</h3>
	<table border="1">

		<tr>
			<td>Train Number:</td>
			<td>t.getTrainNumber()</td>
		</tr>
		<tr>
			<td>Train From:</td>
			<td>${t}</td>
		</tr>
		<tr>
			<td>Date Of Travel:</td>
			<td>ticketBook getDateOfTravel </td>
		</tr>
		<tr>
			<td>To:</td>
			<td>t.tot</td>
		</tr>
	</table>
	<br/>
	<br/>
	<a href="/showTicketBookingForm" id="bookTicket">Book Different Ticket</a>
</body>
</html>