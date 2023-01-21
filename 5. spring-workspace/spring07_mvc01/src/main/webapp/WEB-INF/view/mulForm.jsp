<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sumform.jsp</title>
</head>
<body>
	<h1>곱하기 입력창</h1>
	<form action="${pageContext.request.contextPath}/calcul/mul" method="post">
		<h3>두 숫자를 입력하세요</h3><br>
		<input type="number" name="num1" placeholder="숫자 1">		
		<input type="number" name="num2" placeholder="숫자 2">
		<input type="submit" value="곱하기">		
	</form>
</body>
</html>