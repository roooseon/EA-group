<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Rent a Car</title>
</head>
<body>

	<h2>Rent a Car</h2>


	<table>
		
			<tr><td>Company:</td><td>${car.company}</td></tr>
			<tr><td>Status : </td><td>${car.status }</td></tr>
			<tr><td>Type   : </td><td>${car.carType}</td></tr>
			<tr><td>Plate Number: </td><td>${car.number}</td>
			<tr><td>Model : </td><td>${car.model}</td></tr>
			<tr><td>Manufactured Year : </td><td>${car.builtYear}</td></tr>
			<tr><td>Rent Per Day: </td><td>${car.dailyRent}</td></tr>
			<tr><td>No of Seats: </td><td>${car.seat}</td></tr>
		
	</table>


	<div><img height="100px" width="100px" src="../images/${car.id}.jpg"/> </div>



	<form method="POST" action="/pay">
		<table>
			<!-- <tr>
				<td><label>Rent per Day</label></td>
				<td><input type="text" name="rentPerDay" /></td>
			</tr> -->
			<tr>

				<td><label>From Date:</label></td>
				<td><input type="text" name="rentedDate" /></td>
			</tr>
			<tr>
				<td><label>To Date:</label></td>
				<td><input type="text" name="returnedDate" /></td>

			</tr>

			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>

		</table>
		
	</form>
	
	
	
</body>

</body>
</html>