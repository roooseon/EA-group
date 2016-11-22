<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>
    <div align="center">
        <form:form action="/customer/signup" modelAttribute="customer" method="post">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>USER - REGISTRATION</h2></td>
                </tr>
                <tr>
                    <td>Name:</td>
                    <td><form:input path="name" /></td>
                    <td><form:errors path="name" cssStyle="color:red;"/><td>
                    
                </tr>
                
                <tr>
                    <td>Email:</td>
                    <td><form:input path="email" /></td>
                    <td><form:errors path="email" cssStyle="color:red;"/><td>
                </tr>
                
                <tr>
                    <td>Phone Number:</td>
                    <td><form:input path="phoneNumber" /></td>
                    <td><form:errors path="phoneNumber" cssStyle="color:red;"/><td>
                </tr>
                
                <tr>
                    <td>Country</td>
                    <td><form:input path="address.country" /></td>
                    <td><form:errors path="address.country" cssStyle="color:red;"/><td>
                </tr>
                
                <tr>
                    <td>State:</td>
                    <td><form:input path="address.state" /></td>
                    <td><form:errors path="address.state" cssStyle="color:red;"/><td>
                </tr>
                
                <tr>
                    <td>City:</td>
                    <td><form:input path="address.city" /></td>
                </tr>
                
                <tr>
                    <td>Zip:</td>
                    <td><form:input path="address.zip" /></td>
                </tr>
                
                 <tr>
                    <td>UserName</td>
                    <td><form:input path="username" /></td>
                    <td><form:errors path="username" cssStyle="color:red;"/><td>
                </tr>
                
                <tr>
                    <td>Password:</td>
                    <td><form:password path="password" /></td>
                    <td><form:errors path="password" cssStyle="color:red;"/><td>
                </tr>
                
                <tr>
                    <td>Confirm Password:</td>
                    <td><form:password path="confirmPassword" /></td>
                   <td> <c:if test="${message!=null }"><span style="color:red">"${message }"</span></c:if></td>
                </tr>
                
                
                
            
                    <td colspan="2" align="center"><input type="submit" value="Register" /></td>
               
            </table>
        </form:form>
    </div>
</body>
</html>