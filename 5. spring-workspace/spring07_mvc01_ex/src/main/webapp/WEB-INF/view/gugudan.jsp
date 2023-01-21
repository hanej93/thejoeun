<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>gugudan.jsp</title>
</head>
<body>

	<c:forEach var="dan" items="${gugu }">
		<h1>${dan }</h1>
	</c:forEach>
	
</body>
</html>