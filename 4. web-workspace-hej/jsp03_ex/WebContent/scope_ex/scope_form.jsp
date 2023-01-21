<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="form_proc.jsp" method="post">
		<input type="text" name="name" placeholder="이름을 입력해주세요.">
		<input type="email" name="email" placeholder="이메일을 입력해주세요.">
		<input type="date" name="birth">
		<fieldset>
			<legend>취미</legend>
			<label><input type="checkbox" name="hobbies" value="취미1">취미1</label>
			<label><input type="checkbox" name="hobbies" value="취미2">취미2</label>
			<label><input type="checkbox" name="hobbies" value="취미3">취미3</label>
		</fieldset>
		<input type="submit" value="전송">
	</form>
</body>
</html>