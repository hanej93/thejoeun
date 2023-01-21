<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>정보입력</h1>
	<form action="proc.jsp" method="post">
		<input type="text" name="name" placeholder="이름">
		<input type="text" name="salary" placeholder="연봉">
		<input type="text" name="position" placeholder="직급">
		생일: <input type="date" name="birthDate">
		<input type="submit" value="입력 확인">
	</form>
</body>
</html>