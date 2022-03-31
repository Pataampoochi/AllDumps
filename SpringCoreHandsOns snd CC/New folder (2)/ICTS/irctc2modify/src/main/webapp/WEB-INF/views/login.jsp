<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">

<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<title>Insert title here</title>
<style type="text/css">
body {
	background-color: rgb(200, 240, 300);
	
}
table{
align-items: center;
}
.material-icons {
	vertical-align: middle;
}
</style>
</head>
<body style="background-color: rgb(200, 240, 300);">
<jsp:include page="nav.jsp"></jsp:include>

	<%-- <sf:form action="showTicketBookingForm" modelAttribute="login"
		name="form">
		<table>
			<tr>
				<td><sf:label path="user">User Name</sf:label></td>
				<td><sf:input path="user" type="text" id="user" /></td>
			</tr>
		


		<tr>
			<td><sf:label path="password">Password:</sf:label></td>
			<td><sf:input path="password" type="password" id="password" /></td>
		</tr>
		


		<tr>
			<td><input type="submit" id="submit" value="Book"></td>
			<td><input type="reset" id="reset"></td>
		</tr>
		
</table>

	</sf:form>
 --%>	<!-- Body -->
	<div class="row">
		<div class="col-sm-1"></div>
		<div class="col-sm-10" >
			<!--  <img  src="images/2.png" height="400px" >  -->
			<h3 id="services">Login Here</h3>
			<sf:form action="showTicketBookingForm" modelAttribute="login"
		name="form">
		<table >
			<tr>
				<td><sf:label path="user">User Name</sf:label></td>
				<td><sf:input path="user" type="text" id="user" /></td>
			</tr>
		


		<tr>
			<td><sf:label path="password">Password:</sf:label></td>
			<td><sf:input path="password" type="password" id="password" /></td>
		</tr>
		


		<tr>
			<td><input type="submit" id="submit" value="Book"></td>
			<td><input type="reset" id="reset"></td>
		</tr>
		
</table>

	</sf:form>
		</div>
		<div class="col-sm-1"></div>
	</div>
 <jsp:include page="fotter.jsp"></jsp:include>

<!--Script tags  -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous">
		
	</script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous">
		
	</script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
		integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
		crossorigin="anonymous">
		
	</script>
</body>
</html>