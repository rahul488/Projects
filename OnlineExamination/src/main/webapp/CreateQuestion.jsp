<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<style>
		*{
			top: 0;
			right: 0;
		}
		body{
		background-position: center;
		background-repeat: no-repeat;
		background: url("D2.jpg");
		background-size:all;
		font-family: sans-serif;
		background-attachment: fixed;
		background-size: 100% 100%;
		overflow: hidden;
		}
		.login-box{
		width: 550px;
		height: 550px;
		margin:280px 750px;
		background-color: rgba(0,0,0,0.5);
		color: #fff;
		transform: translate(-50%,-50%);
		box-sizing: border-box;
		padding: 25px 25px;
	}
	.login-box input{
		
		width:100%;
		margin-bottom: 40px;
	}
	.login-box input[type="text"],input[type="submit"]{
	border: none;
	outline: none;
	height: 40px;
	margin-top: 5px;
	border-radius: 20px;
	color: balck;
	font-size: 18px;
	text-align: center;
}
	.login-box input[type="submit"]{
		color: black;
	}

	.login-box input[type="submit"]:hover{
		cruser: pointer;
		background-color: blue;
	}
	.login-box input[type="button"]:hover{
		cruser: pointer;
		background-color: blue;

	</style>
</head>
<body>
	<div class="login-box">
		<form action="add" method="post">
			<input type="text" placeholder="Enter Question" name="question">
			<input type="text" placeholder="Option-1" name="op1">
			<input type="text" placeholder="Option-2" name="op2">
			<input type="text" placeholder="Option-3" name="op3">
			<input type="text" placeholder="Option-4" name="op4">
			<input type="text" placeholder="Correct-Ans" name="ans">
			<input type="submit" value="Add">
		</form>
	</div>
</body>
</html>