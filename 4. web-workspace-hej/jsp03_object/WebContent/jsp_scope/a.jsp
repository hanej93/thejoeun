<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>a.jsp</title>
</head>
<body>
	객체들을 생성함
	<%
		pageContext.setAttribute("일번", "1번값");
		request.setAttribute("일번", 100);
		session.setAttribute("일번", 10.10);
		application.setAttribute("일번", true);
	%>
	
	<a href="b.jsp">b.jsp로 이동</a>
</body>
</html>