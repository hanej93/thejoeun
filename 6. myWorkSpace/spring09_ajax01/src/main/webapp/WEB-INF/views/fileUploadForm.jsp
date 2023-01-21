<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>fileUploadForm.jsp</title>
</head>
<body>
	<form action="/user/fileUpload" method="post" enctype="multipart/form-data">
		<input type="text" name="name" placeholder="이름">
		<input type="file" name="uploadFile" multiple>
		<input type="submit" value="파일 업로드">
	</form>

</body>
</html>