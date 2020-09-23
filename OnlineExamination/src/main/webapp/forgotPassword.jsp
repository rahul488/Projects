<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<style>
	body{
	background-position: center;
	background-repeat: no-repeat;
	background:url("rd.jpg");
	background-size:all;
	font-family: sans-serif;
	background-attachment: fixed;
	background-size: 100% 100%;
	top:0;
	background-position: relative;
	overflow: hidden;
}
	
		.login-box{
			
	width: 400px;
	height: 430px;
	margin:350px 750px;
	background-color: rgba(0,0,0,0.5);
	color: #fff;
	transform: translate(-50%,-50%);
	box-sizing: border-box;
	padding : 30px 30px; 
	position: relative;
	top: 0;
		}
		.login-box input{
	width: 100%;
	margin-bottom: 25px;
}
.login-box input[type="email"],input[type="password"]{
	border: none;
	border-bottom: 1px solid #fff;
	background: transparent;
	outline: none;
	height: 17px;
	color: #fff;
	font-size: 17px;
}
.login-box input[type="submit"]{

	border-radius: 20px;
	height: 30px;
	border: none;

}
.login-box input[type="submit"]:hover{
	cursor: pointer;
	background: #39dc79;
	color: #000;
}
	</style>
</head>
<body>
	<div class="login-box">
		  <form action="Forgot" method="post">
			<p>Username</p>
			<input type="email" placeholder="Enter Username" name="username">
			<p>Password</p>
			<input type="password" placeholder="Enter new Password" name="password">
			<input type="password" placeholder="Confirm Password" name="password1">
			<input type="submit">
		</form>
	</div>
</body>
</html>