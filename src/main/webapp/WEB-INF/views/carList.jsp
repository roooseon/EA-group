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
</head>
<body>
	<div style="border: 2px solid blue; float: left; margin: 5px">
		<h1>Car Details</h1>
	<table>
		<tr>
			<td>Company</td>
			<td>Model</td>
			<td>Status</td>
			<td>Type</td>
			<td>Plate Number</td>
			<td>Manufactured year</td>
			<td>Image</td>
		</tr>
		<c:forEach items="${car}" var="car">
			<tr>
			 
			<td>${car.company} </td>
			<td>${car.model}</td>
			<td>${car.status }</td>
			<td>${car.carType}</td>
			<td>${car.number}</td>
			<td>${car.builtYear}</td>
			<td>${car.dailyRent}</td>
			
			<td>${car.image}</td>
			
			<td><a href = " <c:url value='/cardetails/${car.id}' />" >View Details</a></td>
			
			
			
			<%-- <td><form action="car/${car.id}" method="post">
				<input type="submit" name="rent" value= "rent" /> 
			</form></td> --%>
		</tr>
		</c:forEach>
		
	</table>



<!-- 		<br /> <a -->
<%-- 			href="<spring:url value="/product/delete?id=${car.id}" /> "> --%>
<!-- 			</span> Delete -->
<!-- 		</a> <br /> <a -->
<%-- 			href="<spring:url value="/product/update?id=${car.id}" /> "> --%>
<!-- 			</span> Update -->
<!-- 		</a> -->
	</div>



</body>
</html>