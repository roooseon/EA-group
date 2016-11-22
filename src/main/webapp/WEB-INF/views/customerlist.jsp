<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<table border="0">
			<tr>
				<td align="center"><h2>User - Registration</h2></td>
			</tr>
		</table>
		<table border="1">


			<tr>
				<td>Name</td>
				<td>Username</td>
				<td>email</td>
				<td>Country</td>
				<td>State</td>
				<td>City</td>
				<td>Zip</td>
				<td>PhoneNumber</td>
			</tr>

			<c:forEach var="customer" items="${customers}">

				<tr>
					<td>${customer.name}</td>
					<td>${customer.username}</td>
					<td>${customer.email}</td>
					<td>${customer.address.country}</td>
					<td>${customer.address.state}</td>
					<td>${customer.address.city}</td>
					<td>${customer.address.zip}</td>
					<td>${customer.phoneNumber}</td>
					<td><form action="customerdelete/${customer.id}">
							<input type="submit" value="Delete"/></td>
					</form>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>