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

		<c:forEach items="${car}" var="car">
			<p>Company: ${car.company} Status:${car.status } Type:
				${car.carType} Plate Number: ${car.number} Model: ${car.model}
				Manufactured Year: ${car.builtYear}</p>
			<input type="button" value="Rent">
			
			<a href="http://www.google.com/">  <input type="button" value="Visit Google" />
			</a>

		</c:forEach>

		<br />



		<%-- <br /> <a
			href="<spring:url value="/product/delete?id=${product.id}" /> ">
			</span> Delete
		</a> <br /> <a
			href="<spring:url value="/product/update?id=${product.id}" /> ">
			</span> Update
		</a> --%>
	</div>



</body>
</html>