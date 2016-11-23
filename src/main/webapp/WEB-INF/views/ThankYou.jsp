<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Thank You</title>
</head>
<body>

<h2>Thank You!!!</h2>
		<form method="GET" action="/updatecarstatus/${car.id}">
			<input type = "submit" value = "Home" />
			</form>

<div style="float:left">
<table frame="box">
			<tr><td>Company:</td><td>${payment.rent.car.company}</td></tr>
			<%-- <tr><td>Status : </td><td>${payment.rent.car.status }</td></tr> --%>
			<tr><td>Type   : </td><td>${payment.rent.car.carType}</td></tr>
			<tr><td>Plate Number: </td><td>${payment.rent.car.number}</td>
			<tr><td>Model : </td><td>${payment.rent.car.model}</td></tr>
			<tr><td>Manufactured Year : </td><td>${payment.rent.car.builtYear}</td></tr>
			<tr><td>Rent Per Day: </td><td>${payment.rent.car.dailyRent}</td></tr>
			<tr><td>No of Seats: </td><td>${payment.rent.car.seat}</td></tr>
			<tr><td>ReturnedDAte: </td><td>${payment.rent.rentedDate }</td></tr>
			<tr><td>Payment Per Day: </td><td>${payment.rent.returnedDate}</td></tr>
			<tr></tr>
			<tr><td>Rented Days: </td><td>${payment.rent.totalNoOfDays}</td></tr>
			<tr><td>Total Charge: </td><td>${payment.rent.totalAmt}</td></tr>
			
			<tr><td>CreditCard Type: ${payment.cctype}</td></tr>
			<tr><td>ReturnedDAte: ${payment.rent.rentedDate }</td></tr>
			<tr><td>Payment Per Day: ${payment.rent.returnedDate}</td></tr>
			
		
			
		
	</table>
	</div>
	<div><img height="auto" width="auto" src="../images/${payment.rent.car.id}.jpg"/> </div>
	
	



</body>
</html>