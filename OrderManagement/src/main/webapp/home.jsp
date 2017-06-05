<!DOCTYPE html>
<html lang="en">
<head>
<title>Order Management System - Home</title>

<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<script src="static/js/vue.min.js"></script>

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="static/bootstrap-3.3.7/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="static/bootstrap-3.3.7/css/bootstrap-datetimepicker.min.css" />
<link rel="stylesheet"
	href="static/css/home.css"/>

<!-- jQuery first, then Tether, then Bootstrap JS. -->
<script src="static/js/jquery-3.2.0.min.js"></script>
<script src="static/bootstrap-3.3.7/js/bootstrap.min.js"></script>
<script src="static/bootstrap-3.3.7/js/bootstrap-datetimepicker.min.js"></script>
<script src="static/bootstrap-3.3.7/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
<style>
	.body,.html{
		font-size:16px;
		background:#f2f2f2;
	}
	
	.header{
		margin:0px;
		padding:0px;
		text-align:center;
		background:#31708f;
		height:15rem;
	}
	
	.header h1{
		line-height:15rem;
		padding:0px;
		margin:0px;
		color:#f5f5f5;
	}
	
	#content{
		padding:5px;
	}
	
	#content .input-row{
		margin-top:5px;
	}
	
	#content .button-row{
		margin-top:15px;
	}
	
	#actionPanel{
		margin-top:5px;
		position:relative;
		width:100%;
		padding-top:10px;
		height:80px;
		border-top:1px solid #31708f;
		border-bottom:1px dotted #31708f;
	}
	
	.buttonHoder{
		float:left;
		width:50%;
		height:60px;
		text-align:center;
	}
	
	.buttonHoder button{
		width:98%;
		height:100%;
		margin:0 auto;
	}
</style>
</head>
<body>
	<div class="header">
	  <h1>Manage Orders</h1>
	</div>
	<div id="content">
		<div id="actionPanel">
			<div id="newMOrder" class="buttonHoder">
				<button type="button" class="btn btn-primary btn-lg">
				  <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
				  New Order
				</button>
			</div>
			<div id="orderList" class="buttonHoder">
				<button type="button" class="btn btn-info btn-lg" v-on:click="goToOrderList">
				  <span class="glyphicon glyphicon-search" aria-hidden="true"></span>
				  View Orders
				</button>
			</div>
		</div>
	</div>
</body>
<script src="static/js/controller/home.js"></script>
</html>