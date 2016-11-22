<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Make a Payment</h2>


	<table>
		
			<tr><td>Company:</td><td>${rent.car.company}</td></tr>
			<tr><td>Status : </td><td>${rent.car.status }</td></tr>
			<tr><td>Type   : </td><td>${rent.car.carType}</td></tr>
			<tr><td>Plate Number: </td><td>${rent.car.number}</td>
			<tr><td>Model : </td><td>${rent.car.model}</td></tr>
			<tr><td>Manufactured Year : </td><td>${rent.car.builtYear}</td></tr>
			<tr><td>Rent Per Day: </td><td>${rent.car.dailyRent}</td></tr>
			<tr><td>No of Seats: </td><td>${rent.car.seat}</td></tr>
			<tr><td>ReturnedDAte: </td><td>${rent.rentedDate }</td></tr>
			<tr><td>Payment Per Day: </td><td>${rent.returnedDate}</td></tr>
			
		
	</table>
	
	<form method="POST" action="/payment">
	<table>
			<tr>
				<td><label>Credit Card Type:</label></td>
				<!-- <td><input type="text" name="cctype" /></td> -->
				<td><select name="cctype" id="cctype">
						
						<option value="VISA">VISA</option>
						<option value="DISCOVER">DISCOVER</option>
						<option value="MASTERCARD">MASTERCARD</option>
						
				</select></td>
			</tr>
			<tr>

				<td><label>Credit Card no:</label></td>
				<td><input type="text" name="creditCardNo" /></td>
			</tr>
			<tr>
				<td><label>CVV:</label></td>
				<td><input type="text" name="cVV" /></td>

			</tr>

			<tr>
				<td><input type="submit" value="PAY" /></td>
			</tr>

		</table>
		</form>

</body>
</html>