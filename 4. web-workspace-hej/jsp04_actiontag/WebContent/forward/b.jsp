<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String name = request.getParameter("name");

	System.out.println("\"b.jsp\"의 name: " + name);

	String pageData = (String)pageContext.getAttribute("name");
	String requestData = (String)request.getAttribute("name");
	System.out.println("\"b.jsp\"의 pageData: " + pageData);
	System.out.println("\"b.jsp\"의 requestData: " + requestData);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>b.jsp</title>
</head>
<body>
	<h1>b 페이지</h1>
	<jsp:forward page="c.jsp"></jsp:forward>
</body>
</html>