<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		
		<!--Add code here  -->
		
		<sf:form id="error">
			<h3>Unable to book ticket. Below are the error details:</h3>
			<h3>Response code: ${responseCode}</h3>
			<h3>Error Message: ${errorMessage}</h3>
	<a href="/showTicketBookingForm" id="bookTicket">Book Different Ticket</a>
		</sf:form>
	
</body>
</html>