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
		<tr style="background-color: yellow">
			<td>PNR Number:</td>
			<td>${ticketBook.getPnrNumber() }</td>
		</tr>
		<tr>
			<td>Train Number:</td>
			<td>${train.getTrainNumber()}</td>
		</tr>
		<tr>
			<td>Train Name:</td>
			<td>${train.getTrainName()}</td>
		</tr>
		<tr>
			<td>Date Of Travel:</td>
			<td>${ticketBook.getDateOfTravel() }</td>
		</tr>
		<tr>
			<td>Departure:</td>
			<td>${train.getDeparture()}</td>
		</tr>
		<tr>
			<td>Duration:</td>
			<td>${train.getDuration()}</td>
		</tr>
		<tr>
			<td>Arrival:</td>
			<td>${train.getArrival()}</td>
		</tr>
		<tr>
			<td>Total Fare Amount:</td>
			<td>${ticketBook.getTotalfareAmount()}</td>
		</tr>
	</table>
	<br/>
	<br/>
	<a href="/showTicketBookingForm" id="bookTicket">Book Different Ticket</a>
</body>
</html>