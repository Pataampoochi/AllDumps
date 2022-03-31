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
	<jsp:include page="nav.jsp"></jsp:include>

	<div class="row">
		<div class="col-sm-1" ></div>
		<div class="col-sm-10" >
			<h1 id="heading">Indian Railway System</h1>
			<sf:form name="form" modelAttribute="ticketBooking"
				action="getTicketBookingResultPage">

				<table>

					<tr>
						<td><sf:label path="fromCity">From:</sf:label></td>
						<td><sf:select path="fromCity" id="fromCity"
								items="${fromCityList}"></sf:select>
					</tr>
					<tr>
						<td><sf:label path="toCity">To:</sf:label></td>
						<td><sf:select path="toCity" id="toCity"
								items="${toCityList}"></sf:select>
					</tr>

					<tr>
						<td><input type="submit" id="submit" value="Book" /></td>
						<td><input type="reset" value="Clear" /></td>
					</tr>
				</table>
			</sf:form>
		</div>
		<div class="col-sm-1" ></div>
	</div>
	<jsp:include page="fotter.jsp"></jsp:include>
</body>
</html>