<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


<script type="text/javascript">

	window.onload = function() {
		document.getElementById('errorCredit').innerHTML="";
		document.getElementById('errorCCV').innerHTML="";
	};
	
	function validateForm() {
		return Boolean(myFunctionClick());
	}
	
	function myFunctionClick() {
		var isTrue =1;
		
		document.getElementById('errorCredit').innerHTML="";
		document.getElementById('errorCCV').innerHTML="";
		var today =new Date();
		var creditCardNumber = document.getElementById('creditCardNo').value;
		var cVV = document.getElementById('cVV').value;

		
		if(isEmpty(creditCardNumber)){
			document.getElementById('errorCredit').innerHTML="Required";
			isTrue=0;
		}else{
			if(!(creditCardNumber.length>9 && creditCardNumber.length < 15)){
				
				document.getElementById('errorCredit').innerHTML="must be between 9 to 15";
				isTrue=0;
			}
		}
		
		
		if(isEmpty(cVV)){
			document.getElementById('errorCCV').innerHTML="Required";
			isTrue=0;
		}else{
			if(!(cVV.length==3)){	
				document.getElementById('errorCCV').innerHTML="must be 3 digit";
				isTrue=0;
			}
		}
		
		
		
				
		return isTrue;
			
			
	}
	
	
	function isEmpty(value){
		  return (value == null || value === '');
	}

	

</script>



</head>
<body>

<h2>Make a Payment</h2>

<div style="float:left">
	<table frame="box">
		
			<tr><td>Company:</td><td>${rent.car.company}</td></tr>
			<tr><td>Status : </td><td>${rent.car.status }</td></tr>
			<tr><td>Type   : </td><td>${rent.car.carType}</td></tr>
			<tr><td>Plate Number: </td><td>${rent.car.number}</td>
			<tr><td>Model : </td><td>${rent.car.model}</td></tr>
			<tr><td>Manufactured Year : </td><td>${rent.car.builtYear}</td></tr>
			<tr><td>Rent Per Day: </td><td>${rent.car.dailyRent}</td></tr>
			<tr><td>No of Seats: </td><td>${rent.car.seat}</td></tr>
			<tr><td>Rent Date: </td><td>${rent.rentedDate }</td></tr>
			<tr><td>Returned Date: </td><td>${rent.returnedDate}</td></tr>
			<tr><td>Rented Days: </td><td>${rent.totalNoOfDays}</td></tr>
			<tr><td>Total Charge: </td><td>${rent.totalAmt}</td></tr>
			
		
	</table>
	</div>
	<div><img height="auto" width="auto" src="../images/${rent.car.id}.jpg"/> </div>
	
	<div style="clear:both"/>
	<form method="POST" action="/payment" onsubmit="return validateForm()">
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
				<td><input type="text" name="creditCardNo" id="creditCardNo" /></td>
				<td><span id="errorCredit" style="color:red"/></td>
			</tr>
			<tr>
				<td><label>CVV:</label></td>
				<td><input type="text" name="cVV" id="cVV" /></td>
				<td><span id="errorCCV" style="color:red"/></td>

			</tr>

			<tr>
				<td><input type="submit" value="PAY" /></td>
			</tr>

		</table>
		</form>

</body>
</html>