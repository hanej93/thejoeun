<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	String name = request.getParameter("name");

	System.out.println("\"a.jsp\"의 name: " +name);
	pageContext.setAttribute("name", name);
	request.setAttribute("name", name);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>a.jsp</title>
</head>
<body>
	<h1>a 페이지</h1>
	<jsp:forward page="b.jsp"></jsp:forward>
</body>
</html>