<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="Login.css">
</head>
<body>
	<div class="login-box">
		<h1>Create Account</h1>
		<form action="signup" method="post">
			<p>Username</p>
			<input type="email" placeholder="Enter Username" name="username">
			<p>Password</p>
			<input type="password" placeholder="Enter Password" name="password">
			<input type="submit" value="Create">
		</form>
	</div>
</body>
</html>