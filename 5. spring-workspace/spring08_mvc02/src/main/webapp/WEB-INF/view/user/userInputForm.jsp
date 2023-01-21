<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>user input</title>
</head>
<body>
	<h1>user 인풋</h1>
	<form action="/user/input" method="post">
		<input type="text" name="userId" placeholder="아이디를 입력하세요"><br>
		<input type="password" name="password" placeholder="비밀번호를 입력하세요"><br>
		생년월일 : <input type="date" max="2021-06-10" name="birthDate"><br>
		<input type="tel" name="phone" placeholder="전화번호 기입" pattern="[01]{3}-[0-9]{4}-[0-9]{4}"><br>
		<input type="text" name="address" placeholder="주소를 입력하세요"><br>
		<input type="submit" value="가입">
	</form>
</body>
</html>