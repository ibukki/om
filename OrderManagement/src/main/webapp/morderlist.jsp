<!DOCTYPE html>
<html lang="en">
<head>
<title>Order Management System - Order List</title>

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
	body,html{
		font-size:14px;
		margin:0px;
		padding:0px;
	}
	
	#navi{
		height:40px;
		width:100%;
		background:#666;
	}
	
	#navi button{
		margin-top: 7px;
	    color: #f2f2f2;
	    background: none;
	    border: none;
	}
	
	#detailSearchPanel{
		background:#f3f3f3;
		padding:5px;
		border:1px solid #ccc;
	}
	
	#detailSearchPanel .irow{
		width:100%;
		height:3rem;
	}
	
	.irow{
		
	}
	
	.rInput{
		width:100%;
		height:3rem;
	}
	
	.rInputLeft{
		width:48%;
		height:3rem;
		float:left;
	}
	
	.rInputRight{
		width:48%;
		height:3rem;
		float:right;
	}
	
	.brow{
		height:3rem;
	}
	
	.brow button:nth-child(1){
		float:left;
	}
	
	.brow button:nth-child(2){
		float:right;
	}
	
	#orderPanel ul,#orderPanel li{
		margin:0px;
		padding:0px;
	}
	
	#orderPanel li{
		list-style:none;
		width:100%;
		height:80px;
		border-bottom:1px solid #ccc;
	}
	
	.liLeft{
		width:75%;
		float:left;
		min-width:240px;
		padding-left:10px;
		padding-top:5px;
	}
	
	.liRight{
		width:25%;
		float:left;
		text-align:center;
	}
	
	.liRight span{
		line-height:80px;
	}
</style>
</head>
<body>
	<div id="content">
		<div id="navi">
			<button type="button" class="backBtn" v-on:click="backToHome">
			  <span class="glyphicon glyphicon glyphicon-menu-left" aria-hidden="true"></span> Back
			</button>
		</div>
		<div id="detailSearchPanel">
			<div class="irow">
				<div class="rInputLeft">
					<input type="text" placeholder="Mobile or License Number" class="form-control" />
				</div>
				<div class="rInputRight">
					<Select class="form-control" >
						<option value="SMALL_MAINTENANCE" selected>Small Maintenance</option>
						<option value="BIG_MAINTENACE">Big Maintenance</option>
						<option value="BIG_MAINTENACE">Quick Fix</option>
						<option value="TYRE_REPAIR">Tyre Repair</option>
						<option value="OTHER" >Other</option>
					</Select>
				</div>
			</div>
			<div class="irow">
				<div class="rInputLeft">
					<div class='input-group date' id='startDatePicker'>
			               <input type='text' class="form-control" placeholder="Start Date"/>
			               <span class="input-group-addon">
			                   <span class="glyphicon glyphicon-calendar"></span>
			               </span>
			        </div>
				</div>
				<div class="rInputRight">
					<div class='input-group date' id='endDatePicker'>
			               <input type='text' class="form-control" placeholder="End Date"/>
			               <span class="input-group-addon">
			                   <span class="glyphicon glyphicon-calendar"></span>
			               </span>
			        </div>
				</div>
			</div>
			<div class="brow">
				<button type="button" class="btn btn-info btn-small">
					<span class="glyphicon glyphicon-search" aria-hidden="true"></span>Search
				</button>
			</div>
		</div>
		<div id="orderPanel">
			<ul>
				<li v-for="order in orders">
					<div class="liLeft">
						<div class="row1">
							<span>Order No:</span> {{order.id}}
						</div>
						<div class="row2">
							<span>License No:</span> {{order.licenseNumber}}
						</div>
						<div class="row3">
							<span>Entry Date:</span>
							{{order.inshopDate}}
						</div>
					</div>
					<div class="liRight">
						<span>
							�{{order.amount}} 
						</span>
					</div>
				</li>
			</ul>
		</div>
	</div>
</body>
<script src="static/js/controller/morderlist.js"></script>
</html>