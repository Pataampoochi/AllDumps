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
	<!-- Add code here.. -->
	<h1 id="heading">Windsor Car Showroom</h1>
	<table>
		<center></center><caption style="font-weight: bolder;">Search Cars</caption></center>

		<sf:form action="getCarSearchResultPage" modelAttribute="carSearch" 
			name="form">
			<tr>
				<td>Customer Name:</td>
				<td><sf:input path="customerName" id="customerName" name="customerName"/></td>
				<td><sf:errors path="customerName" /></td>
			</tr>
			<tr>
				<td>Mobile Number:</td>
				<td><sf:input path="mobileNumber" id="mobileNumber" /></td>
				<td><sf:errors path="mobileNumber" /></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td>
				<sf:radiobutton path="gender" value="male"/>
                <label class='radiolabel'>Male</label> 
                
                <sf:radiobutton path="gender" value="female" />
                <label class='radiolabel'>Female</label> </td>
			</tr>
			<tr>
			<tr>
				<td>Customer City:</td>
				<td><sf:select path="gender" id="gender" items="${cityList}" /></td>
			</tr>
			<tr>
			<tr>
				<td>Brand:</td>
				<td><sf:select path="gender" id="gender" items="${brandList}" /></td>
			</tr>
			<tr>
			<tr>
				<td>Fuel/Transmission:</td>
				<td><sf:select path="gender" id="gender" items="${fuelTypeList}" /></td>
			</tr>
			<tr>
			<tr>
			<tr>
				<td>Budget Upto:</td>
				<td><sf:select path="gender" id="gender" items="${budgetList}" /></td>
			</tr>
			
				<td><input type="submit" value="CarSearch" name="CarSearch" /></td>
				<td><input type="reset" value="Clear" /></td>
			</tr>
		</sf:form>
	</table>
	 
 
</body>
</html>