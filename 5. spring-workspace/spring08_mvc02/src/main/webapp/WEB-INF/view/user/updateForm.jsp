<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정 화면</title>
</head>
<body>
	<h1>수정 화면</h1>
	<c:if test="${empty user }">
		<h2>수정할 데이터가 없습니다.</h2>
		<a href="/user/list">목록으로 돌아가기</a>
	</c:if>

	<c:if test="${not empty user }">
		<form action="/user/update" method="post">
			<input type="text" name="id" value="${user.id }" readonly><br>
			가입일 : <input type="datetime-local" name="joinedDate" value="${user.joinedDate }" readonly><br>
			<input type="text" name="userId" placeholder="아이디를 입력하세요"
				value="${user.userId }"><br> <input type="password"
				name="password" placeholder="비밀번호를 입력하세요" value="${user.password }"><br>
			생년월일 : <input type="date" max="2021-06-10" name="birthDate"
				value="${user.birthDate }"><br> <input type="tel"
				name="phone" placeholder="전화번호 기입"
				pattern="[01]{3}-[0-9]{4}-[0-9]{4}" value="${user.phone }"><br> <input
				type="text" name="address" placeholder="주소를 입력하세요" value="${user.address }"><br>
			<input type="submit" value="수정">
		</form>
	</c:if>

</body>
</html>