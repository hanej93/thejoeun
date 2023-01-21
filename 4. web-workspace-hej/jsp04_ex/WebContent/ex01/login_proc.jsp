<%@page import="java.util.HashSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String userId = request.getParameter("userId");
	String password = request.getParameter("password");
	
	HashSet<String> loginFail = new HashSet<String>();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		if(userId.equals("test") && password.equals("test1")){ %>	
			<jsp:forward page="loginSuccess.jsp"></jsp:forward>
		<%
		} else {
			if(!userId.equals("test")){ 
				loginFail.add("아이디오류");
			}
			if(!password.equals("test1")){
				loginFail.add("비밀번호오류");
			}
			request.setAttribute("loginFail", loginFail);
			%>
			<jsp:forward page="loginFail.jsp"></jsp:forward>
	<% }%>
</body>
</html>