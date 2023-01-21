<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String userId = request.getParameter("userId");
	String password = request.getParameter("password");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>[[로그인 성공]]</h1>
	<h1>아이디: <%=userId %></h1>
	<h1>비밀번호: <%=password %></h1>
</body>
</html>