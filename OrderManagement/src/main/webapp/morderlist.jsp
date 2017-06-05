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
		background:#31708f;
		padding:5px;
	}
	
	#searchPanel .irow{
		width:100%;
		height:4.5rem;
	}
	
	.rLabel{
		width:100%;
		line-height:1.5rem;
		color:#ccc;
		font-size:12px;
		height:1.5rem;
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
				<div class="rLabel">Mobile:</div>
				<div class="rInput">
					<input type="text" class="form-control" />
				</div>
			</div>
			<div class="irow">
				<div class="rLabel">License Number:</div>
				<div class="rInput">
					<input type="text" class="form-control" />
				</div>
			</div>
			<div class="irow">
				<div class="rLabel">Maintain Type:</div>
				<div class="rInput">
					<input type="text" class="form-control" />
				</div>
			</div>
			<div class="irow">
				<div class="rLabel">Start Date</div>
				<div class="rInput">
					<input type="text" class="form-control" />
				</div>
			</div>
			<div class="irow">
				<div class="rLabel">End Date</div>
				<div class="rInput">
					<input type="text" class="form-control" />
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