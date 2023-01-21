<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>uploadResult.jsp</title>
</head>
<body>
	<h1>결과</h1>
	<c:if test="${result }">
		<h3>업로드된 이미지</h3>
		<img alt="" src="${pageContext.request.contextPath}/image/${img }">
	</c:if>
	
</body>
</html>