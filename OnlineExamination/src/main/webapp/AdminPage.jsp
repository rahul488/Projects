<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<style>
		
		body{
			background:url("D3.jpg");
			background-position :center;
			background-repeat : no repeat;
			background-size: all;
			font-family: sans-serif;
			background-attachment: fixed;
			background-size: 100% 100%;
			overflow: hidden; 
		}
		.login-box{
		width: 350px;
		height: 250px;
		margin:280px 750px;
		background-color: rgba(0,0,0,0.5);
		color: #fff;
		transform: translate(-50%,-50%);
		box-sizing: border-box;
		padding: 25px 25px;
	}
	.login-box input{
	width: 100%;
	margin-top: 40px;
	margin-bottom: 30px;
	}
	.login-box input[type="password"],input[type="submit"]{
		border:none;
		border-radius: 20px;
		outline: none;
		height: 30px;
		font-size: 25px;
		text-align: center;
	}
	.login-box input[type="password"]:hover{
	background: #39dc79;
	}
	.login-box input[type="submit"]:hover{
	background: #39dc79;
	}
	marquee p{
	font-size: 40px;
	color: blue;
	}
	</style>
</head>
<body>
	<marquee direction="left">
		<p>Welcome to online Examination System</p>
	</marquee>
	<div class="login-box">
		<form action="AdminLogin.jsp">
			<input type="password" placeholder="Enter Password" name="code">
			<input type="submit" placeholder="Go">
		</form>
	</div>
</body>
</html>