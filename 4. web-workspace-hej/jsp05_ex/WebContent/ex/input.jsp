<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="proc.jsp">
		<fieldset>
			<legend>영화 1</legend>
			<input type="text" name="korTitle1" placeholder="영화제목(한글)">
			<input type="text" name="engTitle1" placeholder="영화제목(영어)">
			<label>월드 박스오피스</label>
			<input type="number" name="worldBoxOffice1" min="0">
		</fieldset>
		<fieldset>
			<legend>영화 2</legend>
			<input type="text" name="korTitle2" placeholder="영화제목(한글)">
			<input type="text" name="engTitle2" placeholder="영화제목(영어)">
			<label>월드 박스오피스</label>
			<input type="number" name="worldBoxOffice2" min="0">
		</fieldset>
		<fieldset>
			<legend>영화 3</legend>
			<input type="text" name="korTitle3" placeholder="영화제목(한글)">
			<input type="text" name="engTitle3" placeholder="영화제목(영어)">
			<label>월드 박스오피스</label>
			<input type="number" name="worldBoxOffice3" min="0">
		</fieldset>
		<input type="submit">
	</form>
</body>
</html>