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

	<h3>Congratulations, your ticket got bokked!!!</h3>
	<table>
		<tr>
			<td>PNR Number:</td>
			
		</tr>
		<tr>
			<td>Train Number:</td>
			
		</tr>
		<tr>
			<td>Train Name:</td>
			
		</tr>
		<tr>
			<td>Date of Travel:</td>
			
		</tr>
		<tr>
			<td>Departure:</td>
			
		</tr>
		<tr>
			<td>Duration:</td>
			
		</tr>
		<tr>
			<td>Arrival:</td>
			
		</tr>
		<tr>
			<td>Total Fare Amount:</td>
			
		</tr>
		<c:forEach var="i" items="${list}">
			<tr>
				<td><c:out value="${i.getBrandName()}" /></td>
				<td><c:out value="${i.getModelName()}" /></td>
				<td><c:out value="${i.getPrice()}" /></td>
				<td><c:out value="${i.getFuelType()}" /></td>
				<td><c:out value="${i.getMileage()}" /></td>
				<td><c:out value="${i.getSeatingCapacity()}" /></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>