<!DOCTYPE html>
<html lang="en">
<head>
<title>Order Management System</title>

<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<script src="static/js/vue.min.js"></script>

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="static/bootstrap-3.3.7/css/bootstrap.min.css">

<!-- jQuery first, then Tether, then Bootstrap JS. -->
<script src="static/js/jquery-3.2.0.min.js"></script>
<script src="static/bootstrap-3.3.7/js/bootstrap.min.js"></script>
<style>
	#content{
		padding:5px;
	}
	
	#content .input-row{
		margin-top:5px;
	}
</style>
</head>
<body>
	<div id="content">
		<h1>Order</h1>
		<label for="car-model" class="input-row">Car Model</label>
		<input type="text" id="car-model" class="form-control" placeholder="Car Model"/>
		
		<label for="license-number" class="input-row">License Number</label>
		<input type="text" class="form-control" id="license-number"
				placeholder="License Number"/>
	
		<label for="total-miles" class="input-row">Total Miles</label>
		<input type="text" id="total-miles"
				class="form-control" aria-label="Amount"/>

		<label for="client-name" class="input-row">Client Name</label>
		<input type="text" id="car-model" class="form-control" placeholder="Username" />
		
		<label for="phone-number" class="input-row">Phone</label>
		<input type="text" id="phone-number" class="form-control" placeholder="Phone" />
		
		<label for="total-amount" class="input-row">Total Amount</label>
		<div class="input-group input-row">
			<span class="input-group-addon">¥</span>
			<input type="text" id="total-amount"
				class="form-control" aria-label="Amount (to the nearest rmb"/>
			<span class="input-group-addon">.00</span>
		</div>
		
		
		<button type="button" class="btn btn-success form-control input-row" >Submit</button>
	</div>
	
</body>
<script src="static/js/controller/index.js"></script>
</html>
