<%@page import="java.util.HashSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String userId = request.getParameter("userId");
	HashSet<String> loginFail = (HashSet<String>) request.getAttribute("loginFail");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>[[로그인 실패]]</h1>
	<h1>
		아이디:
		<%=userId%></h1>
	<h1>
		<ul>
			<%
				for (String text : loginFail) {
			%>
			<li><%=text%></li>
			<%
				}
			%>
		</ul>
	</h1>
</body>
</html>