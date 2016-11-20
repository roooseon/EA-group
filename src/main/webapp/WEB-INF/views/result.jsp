<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Submitted Car Information</h2>
   <table>
    <tr>
        <td>Type</td>
        <td>${type}</td>
    </tr>
    <tr>
        <td>Status</td>
        <td>${status}</td>
    </tr>
    <tr>
        <td>Seat</td>
        <td>${seat}</td>
    </tr>
</table>  
</body>
</html>