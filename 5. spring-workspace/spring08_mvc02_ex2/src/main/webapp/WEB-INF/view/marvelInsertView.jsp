<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>영화 추가 화면</h1>
	<form action="/marvel/insert" method="post">
	    제목 :<input type="text" name="title">
	    영어제목 :<input type="text" name="titleEng">
	    개봉일 :<input type="date" name="releaseDate">
	    월드박스오피스 :<input type="number" min="0" name="worldBoxOffice">
	    <input type="submit" value="영화 추가">
	</form>
	
	
</body>
</html>