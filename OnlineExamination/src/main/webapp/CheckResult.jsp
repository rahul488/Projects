<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*" %>
    <%@ page import="java.util.*" %>
    <%@ page import="com.org.Dao.*" %>
    <%@ page import="com.org.Bean.*" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<%
		final List<Answer> list=new ArrayList<Answer>();
		String query="select * from question";
		Connector connector=new Connector();
		Connection con=connector.getConnection();
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next()){
			Answer ans=new Answer();
			ans.setQuestion(rs.getString(1));
			ans.setAns(request.getParameter(rs.getString(1)));
			list.add(ans);
		}
		session.setAttribute("list", list);
		response.sendRedirect("ShowResult.jsp");
	%>
</body>
</html>