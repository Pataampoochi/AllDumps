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
 	<sf:form name="form" method="post" modelAttribute="ticketBooking" action="getTicketBookingResultPage">
 		
 		<table>
 			<caption>Book your Tatkal Ticket</caption>
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
 				<td><input type="submit" id="submit" value="Book"/></td>
 				<td><input type="reset" value="Clear"/></td>
 			</tr>
 		</table>
 	</sf:form>
</body>
</html>