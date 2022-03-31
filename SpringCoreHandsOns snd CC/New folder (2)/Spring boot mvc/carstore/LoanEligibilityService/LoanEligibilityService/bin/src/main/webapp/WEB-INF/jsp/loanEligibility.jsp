<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title>Loan Bazaar : Loan Eligibility Check</title>
</head>

<body style="background-color: rgb(200, 250, 300)">

	<!-- ADD YOUR CODE HERE -->
	<center>
		<h3 style="color: blue">Loan Bazaar - Find the Best Loan For You</h3>
		<form:form modelAttribute="customerDetails" action="eligibilityCheck"
			method="post" id="loanEligibilityForm">
			<table>
				<tr>
					<td>Name</td>
					<td><form:input type="text" path="name" id="name" /></td>
					<td><form:errors path="name" cssStyle="color:red"></form:errors></td>

				</tr>
				<tr>
					<td>Gender</td>
					<td><form:radiobuttons path="gender" items="${genderList}" /></td>
					<td><form:errors path="gender" cssStyle="color:red"></form:errors>
					</td>
				</tr>
				<tr>
					<td>Email</td>
					<td><form:input type="text" path="email" id="email" /></td>
					<td><form:errors path="email" cssStyle="color:red" ></form:errors></td>
				</tr>
				<tr>
					<td>Customer City</td>
					<td><form:select path="customerCity" items="${cityList}"
							id="customerCity"/></td>
					<td><form:errors path="customerCity" cssStyle="color:red"></form:errors></td>
				</tr>
				<tr>
					<td>Employment Type</td>
					<td><form:select path="employmentType" items="${employeeList}"
							id="employmentType" /></td>
					<td><form:errors path="employmentType" cssStyle="color:red"></form:errors></td>
				</tr>
				<tr>
					<td>Monthly Income in INR</td>
					<td><form:input type="text" path="monthlyIncome"
							id="monthlyIncome" /></td>
					<td><form:errors path="monthlyIncome" cssStyle="color:red"></form:errors></td>
				</tr>
				<tr>
					<td>Desired Loan Amount in INR</td>
					<td><form:input type="text" path="desiredLoanAmount"
							id="desiredLoanAmount" /></td>
					<td><form:errors path="desiredLoanAmount" cssStyle="color:red"></form:errors></td>
				</tr>
			</table>
			<button type="submit" id="submit">Submit</button>
		</form:form>
	</center>

</body>

</html>