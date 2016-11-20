<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Vehicle</title>
</head>
<body>

	<form:form modelAttribute="newVehicle" method="post">
		<table>

			<%-- <tr><td>Category:</td><td><form:select id="category" path="category.Id"
items="${categories}" itemValue="Id" itemLabel="cName" /></td>
	<td>	<form:errors path="category" cssStyle="color:red;"/></td>
	</tr> --%>
			<tr>
				<td>Type:</td>
				<td><form:input id="type" name="type" path="type"
						type="text" /></td>
				<td><form:errors path="type" cssStyle="color:red;" /></td>
			</tr>
			

			<tr>
				<td>Number:</td>
				<td><form:input id="number" name="plateNumber" path="number"
						type="text" /></td>
				<td><form:errors path="number" cssStyle="color:red;" /></td>
			</tr>



			<tr>
				<td>Model:</td>
				<td><form:input id="model" name="model" path="model"
						type="text" /></td>
				<td><form:errors path="model" cssStyle="color:red;" /></td>
			</tr>


			<tr>
				<td>Seat:</td>
				<td><form:input id="seat" name="seat" path="seat" type="text" /></td>
				<td><form:errors path="seat" cssStyle="color:red;" /></td>
			</tr>


			<tr>
				<td>Status:</td>
				<td><form:input id="status" name="status" path="status"
						type="text" /></td>
				<td><form:errors path="status" cssStyle="color:red;" /></td>
			</tr>



			<tr>
				<td><input type="submit" value="Add" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>