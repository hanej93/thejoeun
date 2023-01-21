<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>폼</title>
</head>
<body>
	<h1>클라이언트에 정보 받기</h1>
	<form action="request.jsp" method="get">
		<input type="text" name="name" placeholder="이름을 입력하세요"><br>
		<input type="text" name="address" placeholder="주소를 입력하세요"><br>
		<fieldset>
			<legend>성별</legend>
			<input type="radio" value="man" name="gender" id="man"><label
				for="man">남</label> <input type="radio" value="woman" name="gender"
				id="woman"><label for="woman">여</label>
		</fieldset>
		<fieldset>
			<legend>취미</legend>
			<input type="checkbox" value="운동" name="hobby" id="excersice"><label
				for="excersice">운동</label> <input type="checkbox" value="낚시"
				name="hobby" id="fishing"><label for="fishing">낚시</label>
		</fieldset>
		<input type="submit" value="보내기">
	</form>
</body>
</html>