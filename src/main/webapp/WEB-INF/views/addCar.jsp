<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<title>Add a new car</title>
<style>
body {
	background-color: #f2f2f2;
}

form {
	width: 50%;
	margin-right: 15%;
	margin-left: 35%;
}

input[type=submit]:hover {
	background-color: #45a049;
}

div {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 20px;
}
</style>
</head>
<body>
	<div>
	<!-- <br /> Language : <a href="?lang=en">English</a>|<a href="?lang=np">Nepali</a><br />
	 -->	
		<form:form commandName="car" method="POST" action="addcar"
			enctype="multipart/form-data">
			<h2> Language : <a href="?lang=en">English</a>|<a href="?lang=np">Nepali</a></h2>
			<h2>Add Car Information</h2>
			<table>
				<tr>
					<td><form:label path="company"><spring:message code="message.company" text="Default Text" /></form:label></td>
					<td><form:input path="company" /></td>
					<td><form:errors path="company" cssStyle="color:red;" /></td>
				</tr>
				<tr>

					<td><form:label path="model"><spring:message code="message.model" text="Default Text" /></form:label></td>
					<td><form:input path="model" /></td>
					<td><form:errors path="model" cssStyle="color:red;" /></td>
				</tr>
				<tr>
					<td><form:label path="number">Number</form:label></td>
					<td><form:input path="number" /></td>
					<td><form:errors path="number" cssStyle="color:red;" /></td>
				</tr>


				<tr>
					<td>Car Type</td>
					<td><form:select path="carType">
							<form:option value="NONE" label="--- Select ---" />
							<form:options items="${carType}" />
						</form:select></td>

					<td><form:errors path="carType" /></td>

				</tr>

				<tr>
					<td>Status</td>
					<td><form:select path="status" id="status">
							<form:option value="NONE" label="--- Select ---" />
							<form:options items="${value}" />

						</form:select></td>
					<td><form:errors path="status" /></td>
				</tr>

				<tr>
					<td><form:label path="seat">Seat</form:label></td>
					<td><form:input path="seat" /></td>
					<td><form:errors path="seat" cssStyle="color:red;" /></td>
				</tr>


				<tr>
					<td><form:label path="builtYear">Built Year</form:label></td>
					<td><form:input path="builtYear" /></td>
					<td><form:errors path="builtYear" cssStyle="color:red;" /></td>
				</tr>

				<tr>
					<td><form:label path="dailyRent">Daily Rent</form:label></td>
					<td><form:input path="dailyRent" /></td>
					<td><form:errors path="dailyRent" cssStyle="color:red;" /></td>
				</tr>

				<tr>

					<td><form:label path="image">Image</form:label></td>
					<td><form:input type="file" path="tempImg" /></td>

				</tr>

				<tr>
					<td colspan="2"><input type="submit" value="Submit" /></td>
				</tr>

			</table>
		</form:form>
	</div>
</body>
</html>

