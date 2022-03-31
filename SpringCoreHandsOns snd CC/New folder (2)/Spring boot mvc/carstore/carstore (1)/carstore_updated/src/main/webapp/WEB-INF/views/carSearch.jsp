<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<br>
	<br>
	<h1 id="heading">Windsor Car Showroom</h1>
	 <sf:form action="/getCarSearchResultForm" name="form" modelAttribute="carSearch">
	 	<table>
	 	<tr>
	 	<td>Customer Name:</td><td><sf:input path="customerName" id="customerName"/></td></tr>
	 	<tr><td>Mobile Number:</td><td><sf:input path="mobileNumber" id="mobileNumber"/></td></tr>
	 	<tr><td>Gender:</td><td><sf:radiobutton path="gender" name="gender" value="Male"/>Male</td><td><sf:radiobutton path="gender" name="gender" value="Female"/>Female</td></tr>
	 	<tr><td>Customer City:</td><td><sf:select path="customerCity" items="${cities }" id="customerCity"/></td></tr>
	 	<tr><td>Brand:</td><td><sf:select path="brand" items="${brands}" id="brand"/></td></tr>
	 	<tr><td>Fuel/Transmission:</td><td><sf:select path="fuelType" items="${fuelTypes}" id="fuelType"/></td></tr>
	 	<tr><td>Budget Upto:</td><td><sf:select path="budgetUpto" items="${budgetUpto}" id="budgetUpto"/></td></tr>
	 	<tr><td><input type="submit" value="CarSearch"/></td><td><input type="reset" value="Clear"/></td></tr>
	 </table>
	 </sf:form>
 
</body>
</html>