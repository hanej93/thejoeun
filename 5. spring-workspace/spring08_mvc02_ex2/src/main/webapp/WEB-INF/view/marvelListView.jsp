<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마블 리스트</title>
</head>
<body>

	<c:forEach var="marvel" items="${marvelList}">
	    마블아이디 : ${marvel.marvelId }<br>
	    영화제목 : ${marvel.title }<br>
	    영화제목(영어) : ${marvel.titleEng }<br>
	    개봉날짜 : ${marvel.releaseDate }<br>
	    박스오피스 : ${marvel.worldBoxOffice }<br>
	    작성날짜 : ${marvel.writeDate }<br>
	    수정날짜 : ${marvel.updateDate }<br>
	    <hr>
	</c:forEach>
</body>
</html>