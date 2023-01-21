<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/marvel_update" method="post">
		<fieldset>
			<legend>마블 영화 수정</legend>
			<input type="hidden" name="marvelId" value="${marvel.marvelId }">
			등록일<input type="datetime-local" value="${marvel.writeDate }" name="writeDate" readonly>
			<input type="text" name="title" placeholder="영화제목(한글)"  value="${marvel.title }" required>
			<input type="text" name="titleEng" placeholder="영화제목(영어)" value="${marvel.titleEng }" required>
			개봉일<input type="date" name="releaseDate" value="${marvel.releaseDate }" required>
			<input type="number" name="worldBoxOffice" value="${marvel.worldBoxOffice }" required>
			<input type="submit" value="메시지 수정">
		</fieldset>
	</form>
</body>
</html>