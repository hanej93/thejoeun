<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	// sendRedirect.jsp
	// sendRedirect는 페이지를 전환하는 아이
	// 클라이언트에게 url에 해당되는 페이지를 재요청하도록 한다!
	response.sendRedirect("http://localhost:8080/response/redirectResult.jsp");
%>
<!-- 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sendRedirect.jsp</title>
</head>
<body>
	<h1>처음에 요청하는 sendRedirect 페이지</h1>
</body>
</html> 
-->