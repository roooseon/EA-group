<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
}
th, td {
    padding: 5px;
    text-align: left;
}



form {width: 40%;
      margin-right: 30%;
      margin-left: 30%;
      }

input[type=submit]:hover {
	background-color: #45a049;
}
body{
background-color: #f2f2f2;
}

div {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 20px;
}
</style>


<title>Insert title here</title>
</head>
<body>

	<h1>Car Details</h1>
		<table>
			<tr>
				<th>Company</th>
				<th>Model</th>
				<th>Status</th>
				<th>Type</th>
				<th>Plate Number</th>
				<th>Manufactured year</th>
				<th>Daily Rent</th>
				<th>Image</th>
			</tr>

			<tr>

				<td>${car.company}</td>
				<td>${car.model}</td>
				<td>${car.status }</td>
				<td>${car.carType}</td>
				<td>${car.number}</td>
				<td>${car.builtYear}</td>
				<td>${car.dailyRent}</td>
				<td><img height="60px" width="60px" src="../images/${car.id}.jpg"/> </td>
			</tr>
		</table>
	
		

		<table style="border: 0px solid black;">
			<tr>
				<td><form action="/rentID/${car.id}" method = "GET" >
						<input type="submit" value="Rent" />
					</form>
				</td>
				</tr>

		</table>
</body>
</html>