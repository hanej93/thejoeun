<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ol>
	<c:forEach var="num" items="${requestScope.lottoNums }">
		<h1><li>${pageScope.num}</li></h1>
	</c:forEach>
	</ol>
	
	
	<form action="list.jsp" method="post">
		
		<input type="submit">
	</form>
	
</body>
</html>