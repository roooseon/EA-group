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
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Login</h2></td>
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

<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body>
	<!-- <div style="margin: 0 auto; width: 300px"> -->
	<div align="center">
		<br /> <br />
		<h2>Login</h2>
		<br /> <br />
		<form action="/login" method="post">
			
				<label for="userName">User Name</label> <input type="text"
					name="username" id="username" required autofocus>
			</div>
			<div style="float: left; padding: 8px 0px">
				<label for="password">Password</label> <input type="password"
					name="password" id="password" required>
			</div>
			<br />
			<input type="hidden"       
		name="${_csrf.parameterName}"
		value="${_csrf.token}"/>
			<div style="float: left; padding: 8px 0px">
				<button style="margin-left: 74px" type="submit">Sign in</button>
			</div>
		</form>
	</div>
	<br />

</body>
</html> --%>