<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car List</title>

<style>
body {
	background-color: #f2f2f2;
}
</style>
</head>
<body>
	<div float: left; margin: 5px">
		<h1>All Cars list</h1>		
		<table style="border: 0px solid black;">
			<tr>
				<th>Company</th>
				<th>Model</th>
				<th>Status</th>
				<th>Type</th>
				<th>Plate Number</th>
				<th>Seat</th>
				<th>Manufactured year</th>
				<th>Daily Rent</th>
				<th>Image</th>
			</tr>
			<c:forEach items="${car}" var="car">
				<tr>

					<td>${car.company}</td>
					<td>${car.model}</td>
					<td>${car.status }</td>
					<td>${car.carType}</td>
					<td>${car.number}</td>
					<td>${car.seat}</td>
					<td>${car.builtYear}</td>
					<td>${car.dailyRent}</td>
					<td><img height="30px" width="30px"
						src="../images/${car.id}.jpg" /></td>

					<td><form action="cardetails/${car.id}">
							<input type="submit" value="View Details" />
						</form></td>

					<%-- <td><form action="car/${car.id}" method="post">
				<input type="submit" name="rent" value= "rent" /> 
			</form></td> --%>
				</tr>
			</c:forEach>
	<td> <c:if test="${message!=null }"><span style="color:red">"${message }"</span></c:if></td>
	
		</table>


		<table>
			<tr>
				<td><form action="/addcar">
						<input type="submit" value="Addcar" />
					</form></td>
			</tr>
		</table>
		
		
	</div>



</body>
</html>