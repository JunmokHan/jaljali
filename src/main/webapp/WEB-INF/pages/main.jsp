<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
	<title>Welcome Your Visit</title>

	<!-- Bootstrap -->
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">



	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="/style/css/bootstrap_custom.less">

	<!--[if lt IE 9]>
	<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	<![endif]-->
</head>
<body>

<%--배경 이미지 --%>
<div id="background-image">
</div>

<%--header--%>
<jsp:include page="layout/header.jsp"/>

<%--body--%>

<div class="container">
	<div class="container-fluid">
		<div id="body-content">
			<div class="form-group col-xs-6">
				<div class="col-md-12">
					<div class="col-md-1">
						<span class="glyphicon glyphicon-envelope"></span>
					</div>
					<div class="col-md-11">
						<input type="text" placeholder="example@example.com" class="form-control" size="20">
					</div>
				</div>
				<div class="col-md-12">
					<div class="col-md-1">
						<span class="glyphicon glyphicon-lock">
						</span>
					</div>
					<div class="col-md-11">
						<input type="password" placeholder="Password" class="form-control">
					</div>
				</div>
				<div class="col-md-12">
					<button id="signIn" class="btn btn-default" type="button">LogIn</button>
				</div>
			</div>
			<div class="form-group col-xs-6">
				<div class="form-group col-md-12">
					<div class="col-md-1">
						<span class="glyphicon glyphicon-envelope"></span>
					</div>
					<div class="col-md-11">
						<input type="text" placeholder="example@example.com" class="form-control">
					</div>
					<div class="col-md-1">
						<span class="glyphicon glyphicon-lock"></span>
					</div>
					<div class="col-md-11">
						<input type="password" placeholder="Password" class="form-control">
					</div>
					<div class="col-md-1">
						<span class="glyphicon glyphicon-phone"></span>
					</div>
					<div class="col-md-11">
						<input type="text" placeholder="Phone or Tell" class="form-control">
					</div>
					<div class="col-md-12">
						<button id="signUp" class="btn btn-default" type="button" onclick="">Add User</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<%--footer--%>
<jsp:include page="layout/footer.jsp"/>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
</body>
<script>
	$(function(){
		$('#signIn').click(function(){
			$.ajax({

			})
			alert("로그인 합시다.");
		});

		$('#signUp').click(function(){
			alert("회원가입 합시다.");
		});

	});
</script>
</html>
