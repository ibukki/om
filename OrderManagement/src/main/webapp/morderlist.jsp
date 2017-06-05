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
		
	#searchPanel{
		background:#f3f3f3;
		padding:5px;
		border:1px solid #ccc;
	}
	
	#searchPanel .irow{
		width:100%;
		height:3rem;
	}
	
	.irow{
		
	}
	
	.rInput{
		width:100%;
		height:3rem;
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
</style>
</head>
<body>
	<div id="content">
		<div id="searchPanel">
			<div class="irow">
				<div class="rInput">
					<input type="text" placeholder="Mobile" class="form-control" />
				</div>
			</div>
			<div class="irow">
				<div class="rInput">
					<input type="text" placeholder="License Number" class="form-control" />
				</div>
			</div>
			<div class="irow">
				<div class="rInput">
					<input type="text" placeholder="Maintain Type" class="form-control" />
				</div>
			</div>
			<div class="irow">
				<div class="rInput">
					<div class='input-group date' id='startDatePicker'>
			               <input type='text' class="form-control" placeholder="Start Date"/>
			               <span class="input-group-addon">
			                   <span class="glyphicon glyphicon-calendar"></span>
			               </span>
			        </div>
				</div>
			</div>
			<div class="irow">
				<div class="rInput">
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
					<span class="glyphicon glyphicon glyphicon-chevron-up" aria-hidden="true"></span>
				</button>
				<button type="button" class="btn btn-info btn-small">
					<span class="glyphicon glyphicon-search" aria-hidden="true"></span>Search
				</button>
			</div>
		</div>
		<div id="orderPanel">
		
		</div>
	</div>
</body>
<script src="static/js/controller/morderlist.js"></script>
</html>