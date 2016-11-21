<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<div align="center">
        <form:form action="customer/check" commandName="customer" method="post">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Spring MVC Form Demo - Registration</h2></td>
                </tr>
                <tr>
                <td>UserName</td>
                    <td><form:input path="username" /></td>
                </tr>
                
                <tr>
                    <td>Password:</td>
                    <td><form:password path="password" /></td>
                </tr>
    <tr><td><input type="submit" value="Login" /></td></tr>
               
            </table>
        </form:form>
    </div>
	
</body>
</html>