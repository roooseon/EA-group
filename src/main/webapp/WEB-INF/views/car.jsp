<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Add car Information</h2>
<form:form method="POST" action="/addcar">
   <table>
    <tr>
        <td><form:label path="model">Model</form:label></td>
        <td><form:input path="model" /></td>
    </tr>
    <tr>
        <td><form:label path="number">Number</form:label></td>
        <td><form:input path="number" /></td>
    </tr>
    <tr>
        <td><form:label path="type">Type</form:label></td>
        <td><form:input path="type" /></td>
    </tr>
    <tr>
        <td><form:label path="seat">Seat</form:label></td>
        <td><form:input path="seat" /></td>
    </tr>
    <tr>
        <td><form:label path="status">Status</form:label></td>
        <td><form:input path="status" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
</body>