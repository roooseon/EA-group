<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<title>Add a new car</title>
</head>
<body>

	<h2>Add car Information</h2>
	<form:form method="POST" action="addcar">
		<table>
			<tr>
				<td><form:label path="company">Company</form:label></td>
				<td><form:input path="company" /></td>
			</tr>
			<tr>
				<td><form:label path="model">Model</form:label></td>
				<td><form:input path="model" /></td>
			</tr>
			<tr>
				<td><form:label path="number">Number</form:label></td>
				<td><form:input path="number" /></td>
			</tr>


			<tr>
				<td><form:label path="carType">Type</form:label></td>
				<td><select name="carType" id="carType">
						<option value="SEDAN">SEDAN</option>
						<option value="HATCHBACK">HATCHBACK</option>
						<option value="COUPE">COUPE</option>
						<option value="CARAVAN">CARAVAN</option>
				</select></td>
			</tr>
			
			<tr>
				<td><form:label path="status">Status</form:label></td>
				<td><select name="status" id="status">
						<option value="AVAILABLE">AVAILABLE</option>
						<option value="RENTED">RENTED</option>
						<option value="RESERVED">RESERVED</option>
				</select></td>
			</tr>
		
			<tr>
				<td><form:label path="seat">Seat</form:label></td>
				<td><form:input path="seat" /></td>
			</tr>
			

			<tr>
				<td><form:label path="builtYear">Built Year</form:label></td>
				<td><form:input path="builtYear" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>

		</table>
	</form:form>
</body>
</html>

