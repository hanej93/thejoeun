<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <c:if test="${조건절}">내용</c:if> --%>
	<c:if test="${true}">
		무조건 실행!<br>
	</c:if>
	<c:if test="${false}">
		실행하지 않음<br>
	</c:if>
	<!-- 조건의 결과를 result에 담는다 -->
	<c:if test="${ param.age > 20 }" var="result" scope="request">
		성인입니다!!<br>
	</c:if>
	result: ${result }
	<hr>
	<%-- if-else는 없음! 비슷한 choose절이 있음 --%>
	<c:choose>
		<c:when test="${param.age > 10 }">
			10보다 크다<br>
		</c:when>
		<c:when test="${param.age > 5 }">
			5보다 크다<br>
		</c:when>
		<c:otherwise>
			5보다 작거나 같다
		</c:otherwise>
	</c:choose>
	
</body>
</html>