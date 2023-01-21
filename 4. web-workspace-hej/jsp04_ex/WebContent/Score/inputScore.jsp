<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<datalist id="tickmarks">
		<option value="0"></option>
		<option value="10"></option>
		<option value="20"></option>
		<option value="30"></option>
		<option value="40"></option>
		<option value="50"></option>
		<option value="60"></option>
		<option value="70"></option>
		<option value="80"></option>
		<option value="90"></option>
		<option value="100"></option>
	</datalist>
	<form action="show.jsp">

		<input type="text" name="name" placeholder="이름을 입력하세요">
		<label>국어</label> <input type="range" name="kor" min="0" max="100"
			list="tickmarks">
		<label>영어</label> <input type="range" name="eng" min="0" max="100"
			list="tickmarks">
		<label>수학</label> <input type="range" name="math" min="0" max="100"
			list="tickmarks">
		<label>사회</label> <input type="range" name="app" min="0" max="100"
			list="tickmarks">
		<label>과학</label> <input type="range" name="le" min="0" max="100"
			list="tickmarks">
		<input type="submit" value="전송">
	</form>
</body>
</html>