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
	background-color: #373434;
}

.material-icons {
	vertical-align: middle;
}

.row {
	width: 100%;
}
</style>
</head>
<body>


<jsp:include page="nav.jsp"></jsp:include>

	<!-- Body -->
	<div class="row">
		<div class="col-sm-1"></div>
		<div class="col-sm-10" style="background-color: lavenderblush;">
			<!--  <img  src="images/2.png" height="400px" >  -->
			<p id="Aboutus">
				<b>Airlines -An Overview on Air Travel and Air Lines</b>
			<p>Air travel is indeed the fastest way to cover long distances.
				In recent times it has become a lot cheaper and offers travelers a
				wide choice. In the airline industry there are two types of
				travelers: the business traveler and the leisure traveler. Business
				travelers are usually flexible on the price of the tickets, but not
				on the dates. Leisure travelers on the other hand are not flexible
				on the price, but are on the dates. Most airlines try to strike a
				balance between these two types of travellers and offer different
				types of schemes targeting one or the other</p>
			<b>Before boarding the flight</b>
			<p>Whether you are travelling on business or for leisure, there
				are certain points which you need to bear in mind before travelling
				by air. The check-in normally opens three hours prior to the flight
				departure. It is recommended that you arrive two hours before the
				departure for domestic and three hours for international, which will
				allow you enough time to complete the check-in formalities. Before
				leaving home, check that you have all the relevant travel documents
				which includes tickets, photo-id proof and passport for
				international travel, and other relevant documentation that may be
				required. After you have arrived at the terminal, you can check for
				the flight information and the flight schedule which is displayed on
				the screens. Keep the ticket and passport ready when you are waiting
				to check-in.</p>
			<p>The convenient option of web check-in is also available today
				which will allow you to check in 72 hours before departure from
				office or home.</p>
			<b> The different classes in airlines</b>
			<p>Most international flights usually offer three classes: First
				Class, Business Class and Economy Class. First Class is the most
				expensive and offers maximum comfort. Business class also has almost
				the same amenities, with small variations of seat dimensions, food
				options and personalized service. Both the classes offer lounge
				access, delicious meals and drinks, extra space to work. First class
				may have flat beds and private pods. The Economy Class offers basic
				facilities and often food too needs to be purchased. Some airlines
				also offer the Premium Economy class which is a good choice for
				travelers who need to work or catch up on some sleep. A premium
				economy seat costs more than the regular economy.</p>
			</p>
			<h3 id="services">Domestic Airlines</h3>
			<div class="row">
				<!-- Image 1-->
				<div class="col-12 col-md-3 col-sm-6 mb-4">
					<div class="card">
						<img id="10030" src="images/1.jfif">
						<div class="card-body">
							<h6 class="card-title">
								Air Asia <a href="#" class="badge badge-success">4.4<i
									class="material-icons pl-1"
									style="vertical-align: bottom; font-size: smaller;">star</i></a>
							</h6>
							<!-- <p class="card-text">
								Rs. 200.00 <span style="font-size: small; color: gray"><strike>Rs.
										250.00</strike> 20%<span class="material-icons pl-1"
									style="color: brown; font-size: medium; vertical-align: text-bottom;">
										new_releases </span></span> -->
							</p>
							<p class="card-text"
								style="font-size: small; color: rgb(77, 77, 77);">Search
								your booking to check in or reprint your boarding pass</p>
							<div class="row">
								<div class="col-6">
									<a href="login" class="btn btn-success"
										style="border-radius: 0%;">
										<!-- <i
										class="material-icons pr-1"
										style="vertical-align: text-bottom; font-size: medium;">shopping_cart</i> -->Book
										Ticket
									</a>
								</div>
								<div class="col-6 text-center">
									<!-- <span class="material-icons"
										onmouseover="this.style.color='red'"
										onmouseout="this.style.color='grey'"
										style="font-size: xx-large; color: gray; cursor: pointer;">
										favorite_border </span> -->
								</div>
							</div>

						</div>
					</div>
				</div>
				<!-- Image 2-->
				<div class="col-12 col-md-3 col-sm-6 mb-4">
					<div class="card">
						<img id="10030" src="images/1.jfif">
						<div class="card-body">
							<h6 class="card-title">
								Air Asia <a href="#" class="badge badge-success">4.4<i
									class="material-icons pl-1"
									style="vertical-align: bottom; font-size: smaller;">star</i></a>
							</h6>
							<!-- <p class="card-text">
								Rs. 200.00 <span style="font-size: small; color: gray"><strike>Rs.
										250.00</strike> 20%<span class="material-icons pl-1"
									style="color: brown; font-size: medium; vertical-align: text-bottom;">
										new_releases </span></span> -->
							</p>
							<p class="card-text"
								style="font-size: small; color: rgb(77, 77, 77);">Search
								your booking to check in or reprint your boarding pass</p>
							<div class="row">
								<div class="col-6">
									<a href="login" class="btn btn-success"
										style="border-radius: 0%;">
										<!-- <i
										class="material-icons pr-1"
										style="vertical-align: text-bottom; font-size: medium;">shopping_cart</i> -->Book
										Ticket
									</a>
								</div>
								<div class="col-6 text-center">
									<!-- <span class="material-icons"
										onmouseover="this.style.color='red'"
										onmouseout="this.style.color='grey'"
										style="font-size: xx-large; color: gray; cursor: pointer;">
										favorite_border </span> -->
								</div>
							</div>

						</div>
					</div>
				</div>
				<!--  -->
				<!-- Image 3-->

				<div class="col-12 col-md-3 col-sm-6 mb-4">
					<div class="card">
						<img id="10030" src="images/1.jfif">
						<div class="card-body">
							<h6 class="card-title">
								IndiaGo <span class="badge badge-warning">3.5 <span
									class="material-icons"
									style="vertical-align: bottom; font-size: smaller;">
										grade </span></span>
							</h6>
							<!-- <p class="card-text">
								Rs. 200.00 <span style="font-size: small; color: gray"><strike>Rs.
										250.00</strike> 20%<span class="material-icons pl-1"
									style="color: brown; font-size: medium; vertical-align: text-bottom;">
										new_releases </span></span> -->
							</p>
							<p class="card-text"
								style="font-size: small; color: rgb(77, 77, 77);">Search
								your booking to check in or reprint your boarding pass</p>
							<div class="row">
								<div class="col-6">
									<a href="login" class="btn btn-success"
										style="border-radius: 0%;">
										<!-- <i
										class="material-icons pr-1"
										style="vertical-align: text-bottom; font-size: medium;">shopping_cart</i> -->Book
										Ticket
									</a>
								</div>
								<div class="col-6 text-center">
									<!-- <span class="material-icons"
										onmouseover="this.style.color='red'"
										onmouseout="this.style.color='grey'"
										style="font-size: xx-large; color: gray; cursor: pointer;">
										favorite_border </span> -->
								</div>
							</div>

						</div>
					</div>
				</div>

				<!-- Image 4-->
				<div class="col-12 col-md-3 col-sm-6 mb-4">
					<div class="card">
						<img id="10030" src="images/1.jfif">
						<div class="card-body">
							<h6 class="card-title">
								IndiaGo <span class="badge badge-warning">3.5 <span
									class="material-icons"
									style="vertical-align: bottom; font-size: smaller;">
										grade </span></span>
							</h6>
							<!-- <p class="card-text">
								Rs. 200.00 <span style="font-size: small; color: gray"><strike>Rs.
										250.00</strike> 20%<span class="material-icons pl-1"
									style="color: brown; font-size: medium; vertical-align: text-bottom;">
										new_releases </span></span> -->
							</p>
							<p class="card-text"
								style="font-size: small; color: rgb(77, 77, 77);">Search
								your booking to check in or reprint your boarding pass</p>
							<div class="row">
								<div class="col-6">
									<a href="login" class="btn btn-success"
										style="border-radius: 0%;">
										<!-- <i
										class="material-icons pr-1"
										style="vertical-align: text-bottom; font-size: medium;">shopping_cart</i> -->Book
										Ticket
									</a>
								</div>
								<div class="col-6 text-center">
									<!-- <span class="material-icons"
										onmouseover="this.style.color='red'"
										onmouseout="this.style.color='grey'"
										style="font-size: xx-large; color: gray; cursor: pointer;">
										favorite_border </span> -->
								</div>
							</div>

						</div>
					</div>
				</div>

				<!-- Image 4-->




			</div>
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