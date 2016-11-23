<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Rent a Car</title>

<script type="text/javascript">

	window.onload = function() {
		document.getElementById('errorMsgRent').innerHTML="";
	};
	
	function validateForm() {
		return Boolean(myFunctionClick());
		//alert(Boolean(myFunctionClick()));
	}
	
	function myFunctionClick() {
		document.getElementById('errorMsgRent').innerHTML="";
		document.getElementById('errorMsgRented').innerHTML="";
		var today =new Date();
		var startDate = document.getElementById('rentedDate').value;
				
				var isTrue =1;
				// validation for from date
				var startDateParse =parseDMY(startDate);
				if(isNaN (startDateParse)){
					document.getElementById('errorMsgRent').innerHTML="Please enter valid date in YYYY/MM/DD format";
					isTrue=0;
				}
				if(today>parseDMY(startDate)){
					document.getElementById('errorMsgRent').innerHTML="Date must be greater than today";
					isTrue=0;
				}
				
				//validation for to date
				var returnDate = document.getElementById('returnedDate').value;
				var returnDateParse =parseDMY(returnDate);
				if(isNaN (returnDateParse)){
					document.getElementById('errorMsgRented').innerHTML="Please enter valid date in YYYY/MM/DD format";
					isTrue=0;
				}
				if(today>parseDMY(startDate)){
					document.getElementById('errorMsgRented').innerHTML="Date must be greater than today";
					isTrue=0;
				}
				if(startDateParse>returnDateParse){
					document.getElementById('errorMsgRented').innerHTML="Rent return date must be greater than rented date";
					isTrue=0;
				}
				
				return isTrue;
				//alert("date must not be null and must be in YYYY/MM/DD");
			
	}
	
	function parseDMY(value) {
    var date = value.split("/");
    var d = parseInt(date[2], 10),
        m = parseInt(date[1], 10),
        y = parseInt(date[0], 10);
    return new Date(y, m - 1, d);
}

	

</script>


</head>
<body>

	<h2>Rent a Car</h2>

<div style="float:left">
	<table frame="box">
		
			<tr><td>Company:</td><td>${car.company}</td></tr>
			<tr><td>Status : </td><td>${car.status }</td></tr>
			<tr><td>Type   : </td><td>${car.carType}</td></tr>
			<tr><td>Plate Number: </td><td>${car.number}</td>
			<tr><td>Model : </td><td>${car.model}</td></tr>
			<tr><td>Manufactured Year : </td><td>${car.builtYear}</td></tr>
			<tr><td>Rent Per Day: </td><td>${car.dailyRent}</td></tr>
			<tr><td>No of Seats: </td><td>${car.seat}</td></tr>
		
	</table>

</div>
	<div><img style="margin-left: 10px;" height="auto" width="auto" src="../images/${car.id}.jpg" /> </div>
<div style="clear:both"/>


	<form method="POST" action="/pay" onsubmit="return validateForm()">
		<table>
			
			<tr>

				<td><label>From Date:</label></td>
				<td><input type="text" name="rentedDate" id="rentedDate"/></td>
				<td><span id="errorMsgRent" style="color:red"/></td>
			</tr>
			<tr>
				<td><label>To Date:</label></td>
				<td><input type="text" name="returnedDate" id="returnedDate"/></td>
				<td><span id="errorMsgRented" style="color:red"/></td>
			</tr>

			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
			
			

		</table>
		
	</form>
	
	
</body>






</html>