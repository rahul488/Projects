<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="com.org.Dao.*" %>
    <%@ page import="com.org.Bean.*" %>
<!DOCTYPE html>
<html>
<head>
	<style type="text/css">
		body{
			background-color: black;
		}
		table{
			background-color: cyan;
			color:green;
			margin-top: 100px;
			margin-left: 200px;
		}
		#tname
		{
			font-size:50px;
		}
	</style>
</head>
<body>

<%int i=0; %>
	<%List<Answer> list=(List<Answer>)session.getAttribute("list"); %>
	<table border="bold">
	<caption id="tname"><u><strong>Answer Sheet</strong></u></caption>
	<tr>
		<th>Sl.no</th>
		<th>Question</th>
		<th>Answer</th>
		<th>Status</th>
	</tr>
	<%
			for(Answer ans:list){
				%>
				<tr>
					<td><%= ++i %>.</td>
					<td><%=ans.getQuestion() %></td>
					<td><%=ans.getAns()%></td>
					<td><%=ans.getStatus() %></td>
				</tr>
				<%
			}
	%></table>
</body>
</html>