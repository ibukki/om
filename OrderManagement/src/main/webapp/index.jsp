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
</head>
<body>
	<div id="content">
		<h2>Hello World! -- {{name}}</h2>

		<div class="input-group">
			<span class="input-group-addon" id="basic-addon1">@</span> <input
				type="text" class="form-control" placeholder="Username"
				aria-describedby="basic-addon1">
		</div>

		<div class="input-group">
			<input type="text" class="form-control"
				placeholder="Recipient's username" aria-describedby="basic-addon2">
			<span class="input-group-addon" id="basic-addon2">@example.com</span>
		</div>

		<div class="input-group">
			<span class="input-group-addon">$</span> <input type="text"
				class="form-control" aria-label="Amount (to the nearest dollar)">
			<span class="input-group-addon">.00</span>
		</div>

		<label for="basic-url">Your vanity URL</label>
		<div class="input-group">
			<span class="input-group-addon" id="basic-addon3">https://example.com/users/</span>
			<input type="text" class="form-control" id="basic-url"
				aria-describedby="basic-addon3">
		</div>

	</div>
</body>
<script src="static/js/controller/index.js"></script>
</html>
