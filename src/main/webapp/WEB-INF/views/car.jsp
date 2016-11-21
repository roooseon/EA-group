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
			<td>Car Type</td>
			<td><form:select path="carType">
					<form:option value="NONE" label="--- Select ---" />
					<form:options items="${carType}" />
				</form:select></td>

			<td><form:errors path="carType" cssStyle="color:red;" /></td>
</tr>

			<tr>
				<td>Status</td>
				<td><form:select path="status" id="status">
						<form:option value="NONE" label="--- Select ---"/>
						<form:options items ="${value}"/>
						
				</form:select></td>
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
				<td><form:label path="dailyRent">Daily Rent</form:label></td>
				<td><form:input path="dailyRent" /></td>
			</tr>
			
			<tr>

				<td><form:label path="image">Image</form:label></td>
				<td><input type="file" name="image" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>

		</table>
	</form:form>
</body>
</html>

