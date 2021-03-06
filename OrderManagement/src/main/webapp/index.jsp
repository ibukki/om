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
<link rel="stylesheet"
	href="static/bootstrap-3.3.7/css/bootstrap-datetimepicker.min.css">

<!-- jQuery first, then Tether, then Bootstrap JS. -->
<script src="static/js/jquery-3.2.0.min.js"></script>
<script src="static/bootstrap-3.3.7/js/bootstrap.min.js"></script>
<script src="static/bootstrap-3.3.7/js/bootstrap-datetimepicker.min.js"></script>
<script src="static/bootstrap-3.3.7/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
<style>
	#content{
		padding:5px;
	}
	
	#content .input-row{
		margin-top:5px;
	}
	
	#content .button-row{
		margin-top:15px;
	}
	
	#navi{
		height:40px;
		width:100%;
		background:#666;
	}
	
	#navi .backBtn{
		margin-top: 7px;
	    color: #f2f2f2;
	    background: none;
	    border: none;
	}
	
	#navi .saveBtn{
		margin-top: 7px;
	    color: #f2f2f2;
	    background: none;
	    float:right;
	    margin-right:5px;
	    border: none;
	}
</style>
</head>
<body>
	<div id="content">
		<div id="navi">
			<button type="button" class="backBtn" v-on:click="backToHome">
			  <span class="glyphicon glyphicon glyphicon-menu-left" aria-hidden="true"></span> Back
			</button>
			
			<button type="button" class="saveBtn" v-bind:disabled="disableSubmitButton" v-on:click="submitOrder">
			  Save
			</button>
		</div>
		<label for="car-model" class="input-row">Car Model</label><span>*</span>
		<input type="text" id="car-model" class="form-control" placeholder="Car Model" v-model="car.carModel"/>
		
		<label for="license-number" class="input-row">License Number</label><span>*</span>
		<input type="text" class="form-control" id="license-number"
				placeholder="License Number" v-model="car.licenseNumber"/>
		
		<label for="total-miles" class="input-row">Total Miles</label>
		<input type="text" id="total-miles" v-model="order.mileage"
				class="form-control" aria-label="Miles"/>
		
		<label for="maintian-type" class="input-row">Maintain Type</label><span>*</span>
		<select class="form-control" v-model="order.maintainType">
			<option value="SMALL_MAINTENANCE">Small Maintenance</option>
			<option value="BIG_MAINTENACE">Big Maintenance</option>
			<option value="BIG_MAINTENACE">Quick Fix</option>
			<option value="TYRE_REPAIR" selected>Tyre Repair</option>
			<option value="OTHER" >Other</option>
		</select>
		
		<label for="client-name" class="input-row">Client Name</label>
		<input type="text" id="car-model" v-model="user.userName" class="form-control" placeholder="Client Name" />
		
		<label for="phone-number" class="input-row">Phone</label>
		<input type="text" id="phone-number" v-model="user.mobile" class="form-control" placeholder="Phone" />
		
		<label for="total-amount" class="input-row">Total Amount</label><span>*</span>
		<div class="input-group input-row">
			<span class="input-group-addon">�</span>
			<input type="text" id="total-amount"
				class="form-control" v-model="order.totalAmount" aria-label="Amount (to the nearest rmb"/>
			<span class="input-group-addon">.00</span>
		</div>
		  
		<label for="inshop-date" class="input-row date-picker">Checkin Date</label>
	    <div class='input-group date' id='inshopDatePicker'>
               <input type='text' class="form-control" v-model="order.inshopDate"/>
               <span class="input-group-addon">
                   <span class="glyphicon glyphicon-calendar"></span>
               </span>
        </div>
		
		<label for="checkout-date" class="input-row date-picker">Checkout Date</label>
	    <div class='input-group date' id='checkoutDatePicker'>
               <input type='text' class="form-control" v-model="order.checkoutDate"/>
               <span class="input-group-addon">
                   <span class="glyphicon glyphicon-calendar"></span>
               </span>
        </div>
        
		<label for="comment" class="input-row">Comment</label>
		<div>
			<textarea id="comment" class="form-control" v-model="order.comment"></textarea>
		</div>
		
	</div>
	
</body>
<script src="static/js/controller/index.js"></script>
</html>
