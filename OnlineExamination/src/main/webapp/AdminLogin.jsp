<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
	<%
	
		String password=request.getParameter("code");
		if(password.equals("#34nalanda@78")){
			response.sendRedirect("AdminSection.jsp");
		}
		else{
			response.sendRedirect("Admin.jsp");
		}
	
	%>
</body>
</html>