<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<br>
	<br>
	<!--Add code here  -->
	 <br>
	<br>
	<h3>Here are cars matching your search criteria:</h3>
	<table border="1">
	<tr><td>Brand Name</td><td>Model Name</td><td>Price in lakh</td><td>Fuel/Transmission</td><td>Mileage</td><td>Seating Capacity</td></tr>
	<c:forEach var="i" items="${list}">
	<tr><td><c:out value="${i.getBrandName()}"/></td>
	<td><c:out value="${i.getModelName()}"/></td>
	<td><c:out value="${i.getPrice()}"/></td>
	<td><c:out value="${i.getFuelType()}"/></td>
	<td><c:out value="${i.getMileage()}"/></td>
	<td><c:out value="${i.getSeatingCapacity()}"/></td>
	</tr>
	</c:forEach>
	
	
	</table>
</body>
</html>