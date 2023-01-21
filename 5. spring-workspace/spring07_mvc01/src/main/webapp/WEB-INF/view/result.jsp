<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과화면</title>
</head>
<body>
	<h1>결과화면</h1><br>
	<h1>${result }</h1>
	<form action="${pageContext.request.contextPath }/calcul/sum">
		<input type="submit" value="더하기">
	</form>
	<form action="${pageContext.request.contextPath }/calcul/sub">
		<input type="submit" value="빼기">
	</form>
	<form action="${pageContext.request.contextPath }/calcul/mul">
		<input type="submit" value="곱하기">
	</form>
	<form action="${pageContext.request.contextPath }/calcul/div">
		<input type="submit" value="나누기">
	</form>
</body>
</html>