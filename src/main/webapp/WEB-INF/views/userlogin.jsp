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
        <form action="/login" method="post">
        
       <div style="color:red"> ${error}</div>
       <%--  <c:if test="${pa.error}">
					<div class="alert alert-danger">
						<spring:message code="AbstractUserDetailsAuthenticationProvider.badCredentials"/><br />
						login failed
					</div>
		</c:if>
         --%>
            <table border="0">
                <tr>
                <c:if test="${message!=null}"><td colspan="2" align="center"><h2>${message }</h2></td></c:if>
                    <td colspan="2" align="center"><h2>Please Login First</h2></td>
                </tr>
                <tr>
                <td>UserName</td>
                    <td><input type="text"
					name="username" id="username" required autofocus></td>
                </tr>
                
                <tr>
                    <td>Password:</td>
                    <td><input type="password"
					name="password" id="password" required autofocus></td>
                </tr>
    <tr><td><input type="submit" value="Login" /></td></tr>
    <td><a href = " <c:url value="/customer/signup" />" >Signup for free</a></td>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
               
            </table>
        </form>
    </div>
	
</body>
</html>

