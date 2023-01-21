<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name = "hello";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 
		action tag 방식: 동적 힙에 저장되는 애들
		디렉티브 방식        : 정적 static
	 -->
	<h1>main.jsp에서 작성한 코드 시작</h1>
	<%@ include file="sub.jsp" %>
	<h1>main.jsp에서 작성한 코드 끝</h1>

</body>
</html>