<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<div align="center">
		<table border=1>
		<tr><td>Name</td><td>${customer.name }</td></tr>
		<tr><td>Username</td><td>${customer.username}</td></tr>
		<tr><td>Email</td><td>${customer.email }</td></tr>
		<tr><td>Phone</td><td>${customer.phoneNumber }</td></tr>
		<tr><td>Country</td><td>${customer.address.country }</td></tr>
		</table>
		<form action="/carlistuser"><input type="submit" value="View cars"></form>
	</div>
	
</body>
</html>