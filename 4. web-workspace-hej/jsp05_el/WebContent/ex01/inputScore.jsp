<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01/inputScore.jsp</title>
</head>
<body>
	<h1>학생 정보 입력</h1>
	<form action="process.jsp" method="post">
		<input type="text" name="name" placeholder="이름">><br>
		생일: <input type="date" name="birth"><br>
		<input type="number" name="kor" min="0" max="100" placeholder="국어점수"><br>
		<input type="number" name="eng" min="0" max="100" placeholder="영어점수"><br>
		<input type="number" name="math" min="0" max="100" placeholder="수학점수"><br>
		<input type="submit" value="전송"><br>
	</form>
</body>
</html>