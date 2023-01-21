<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userId = request.getParameter("userId");
	String password = request.getParameter("password");
	
	if(userId.equals("groot") && password.equals("imgroot")){
		response.sendRedirect("login.jsp");
	} else{
		response.sendRedirect("fail.jsp");
	}

%>
<!-- <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html> -->