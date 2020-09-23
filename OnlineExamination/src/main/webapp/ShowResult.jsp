<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="java.sql.*"%>
    <%@ page import="java.util.*" %>
    <%@ page import="com.org.Dao.*" %>
    <%@ page import="com.org.Bean.*" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
	 <style>
	 	
	 		body{
	 		
	 			background-color:black;
	 		}
	 	.check{
	 		height:600px;
	 		width:720px;
	 		margin-left: 500px;
	 		margin-top: 100px;
	 		background-color: green;
	 		box-sizing: border-box;
	 	}
	 	.check h1{
	 		padding-top:120px;
	 		text-align: center;
	 	
	 	}
	 	.check p{
	 		text-align: center;
	 	}
	 	.btn{
	 		margin-left: 340px;
	 		background-color: red;
	 		border-radius: 20px;
	 		font-family: bold;
	 		font-size: 25px;
	 		height: 33px;
	 		width: 50px;
	 	}
	 	.btn:hover{
	 		background-color:blue;
	 		
	 	}
	 
	 </style>
</head>
<body>
	<%
		
	String query="select * from question";
	Connector connector=new Connector();
	Connection con=connector.getConnection();
	
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(query);
	
	List<Answer> list=(List<Answer>)session.getAttribute("list");
	int mark=0,i=0;
	
	while(rs.next()){
		
		String ans=rs.getString(6);
		Answer answerBean=list.get(i++);
		String ans1=answerBean.getAns();
		if(ans == null){
			answerBean.setStatus("Not Attempted");
		}
		else if(ans.equalsIgnoreCase(ans1)){
			answerBean.setStatus("Correct");
			mark+=2;
		}
		else{
			answerBean.setStatus("False");
		}
	}
	%>
	<form action="ShowResultPaper.jsp" class="form">
	
	<div class="check">
	<h1>Your Result is</h1>
		<p><%=mark%></p>
		<h1>Please click on the Submit button to see the ResultSeet</h1>
		<br>
		<input type="submit" class="btn" value="Go">
	</div>
	</form>
	<%
		response.setIntHeader("Refresh",5);
	
	%>
</body>
</html>