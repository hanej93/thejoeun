<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정 결과 화면</title>
</head>
<body>
	<h1>결과</h1>
	<c:choose>
		<c:when test="${ result}">
			<h2>데이터를 수정하였습니다.</h2>
		</c:when>
		<c:otherwise>
			<h2>수정 실패!!!!!!</h2>
		</c:otherwise>
	</c:choose>
	<a href="${pageContext.request.contextPath }/list">목록으로 돌아가기</a>
	
</body>
</html>