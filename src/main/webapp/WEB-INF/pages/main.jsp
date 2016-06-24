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
	<link rel="stylesheet" href="/style/css/bootstrap.min.css">
	<link rel="stylesheet" href="/style/css/cover2.css">

	<!--[if lt IE 9]>
	<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	<![endif]-->
</head>
<body>
<div id="background-image">
</div>
<div>
<%--header--%>
<jsp:include page="layout/header.jsp"/>

<%--body--%>
<div>
	<div>
		<span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>
		<input type="text">
	</div>
	<div>
		<span class="glyphicon glyphicon-lock" aria-hidden="true">
		</span>
		<input type="text">
	</div>
	<div>
		<span class="glyphicon glyphicon-phone" aria-hidden="true"></span>
		<input type="text">
	</div>
</div>

<%--footer--%>
<jsp:include page="layout/footer.jsp"/>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
</div>
</body>
</html>
