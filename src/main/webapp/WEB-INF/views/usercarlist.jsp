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
	<div style="border: 2px solid blue; float: left; margin: 5px">
<h1>Welcome ${user}</h1><br/>

		<h1>Your rented car list</h1>
		
		 <c:if test="${cr!=null}"> 
		<table>
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

					<td><img height="30px" width="30px" src="../images/${car.id}.jpg"/> </td>
					</tr></c:forEach></table></c:if>
		
		<table>
		
		<tr>
		<td><form action="/carlistuser/sedan">
			<input type="submit" value="Show Sedan Cars" />
		</form></td>
		<td><form action="/carlistuser/hatchback">
			<input type="submit" value="Hatchback Cars" />
		</form></td>
		<td><form action="/carlistuser/coupe">
			<input type="submit" value="Show Coupe Cars" />
		</form></td>
		
		<td><form action="/carlistuser">
			<input type="submit" value="Show All Cars" />
		</form>
		</td>
		</tr>
		</table>
		
		<td><form action="/customer/viewmine">
		<input type="submit" value="View my credentials"/>
		</form></td>

	</div>


</body>
</html>