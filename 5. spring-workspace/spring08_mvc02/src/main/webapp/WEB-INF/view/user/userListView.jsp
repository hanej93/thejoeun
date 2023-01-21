<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>userListView.jsp</title>
<link rel="stylesheet" type="text/css" href="/resources/css/userList.css">

</head>
<body>
	<div class="container">
	<h1>유저 화면 리스트</h1>
		<c:forEach var="user" items="${userList}">
			<section>
				id: ${user.id }<br>
				유저아이디: ${user.userId }<br>
				비밀번호 : ${user.password }<br>
				생일 : ${user.birthDate }<br>
				휴대폰 번호 : ${user.phone }<br>
				주소 : ${user.address }<br>
				<c:if test="${user.joinedDate.second eq 0 }">
	                <fmt:parseDate value="${user.joinedDate }" pattern="yyyy-MM-dd'T'HH:mm" var="parsedDateTime"/>
	                <fmt:formatDate var="t" value="${parsedDateTime }" pattern="yyyy-MM-dd HH:mm"/>
	            </c:if>
	
	            <c:if test="${user.joinedDate.second ne 0 }">
	                <fmt:parseDate value="${user.joinedDate }" pattern="yyyy-MM-dd'T'HH:mm:ss" var="parsedDateTime"/>
	                <fmt:formatDate var="t" value="${parsedDateTime }" pattern="yyyy-MM-dd HH:mm:ss"/>
	            </c:if>
				가입일 : ${t }<br>
				<a href="/user/update?id=${user.id }">수정</a>
				<a href="/user/delete?id=${user.id }">삭제</a>
			</section>
			<hr>
		</c:forEach>
	</div>
</body>
</html>