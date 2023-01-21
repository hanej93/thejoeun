<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>a/main.jsp</title>
</head>
<body>
	<h1>a.jsp파일</h1>
	<!-- 
		target.jsp 파일을 가져오자 
		상대경로 방식
	-->
	<jsp:include page="../b/c/target.jsp"/>
	<!-- 
		root부터 접근을 하는데, 웹콘텐트로  부터 접근한다
		맨앞에 /를 넣으면 됨
	-->
	<jsp:include page="/path_ex/b/c/target.jsp"/>
</body>
</html>