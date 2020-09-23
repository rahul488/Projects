<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*" %>
  <%@ page import="com.org.Dao.*" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<style type="text/css">
		.btn{
			margin-left: 700px;
		font-size: 20px;
		font-family: sans-serif;
		background-color: red;
		border-radius: 17px;
		}
		.btn:hover{
		background-color: green;
		}
		hr{
			border-style:double;
			border-bottom-color: black;
		}
	</style>
</head>
<body>
	<h1>Java</h1>
	<h3>Answer the following question(2 marks for each correct answer)</h3>
	<hr/>
	
	<%
		String query="select *  from question";
		Connector connector=new Connector();
		Connection con=connector.getConnection();
		Statement st=con.createStatement();
		ResultSet rs = st.executeQuery(query);
	%>
	<form action="CheckResult.jsp">
		<%int i=0; %>
		<%while(rs.next()) {%>
		<%=++i %>.<%=rs.getString(1) %>
			<br>
			<input type="radio" name="<%= rs.getString(1)%>" value="<%= rs.getString(2) %>"><%= rs.getString(2) %>
			<br>
			<input type="radio" name="<%= rs.getString(1) %>" value="<%= rs.getString(3) %>"><%= rs.getString(3) %>
			<br>
			<input type="radio" name="<%= rs.getString(1) %>" value="<%= rs.getString(4) %>"><%= rs.getString(4) %>
			<br>
			<input type="radio" name="<%= rs.getString(1) %>" value="<%= rs.getString(5) %>"><%= rs.getString(5) %>
			<br>
		<%}%>
		<%con.close();st.close(); %>
		<hr>
		<input class="btn" type="submit">
	</form>
	
</body>
</html>