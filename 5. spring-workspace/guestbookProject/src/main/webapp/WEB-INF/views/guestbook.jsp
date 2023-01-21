<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>guestbook.jsp</title>
</head>
<body>
	<c:forEach var="messageList" items="${messageList}">
		번호 : ${messageList.messageId }<br>
		작성자 이름 : ${messageList.guestName }<br>
		메시지 암호 : ${messageList.password }<br>
		<form action="${pageContext.request.contextPath}/guestbook/deleteMessage?messageId=${messageList.messageId}">
			<input type="text" name="messageId" value=${messageList.messageId } readonly="readonly"><br>
			<input type="text" name="password" placeholder="비밀번호 입력">
			<input type="submit" value="삭제">
		</form>
		메시지 내용 : ${messageList.message }<br>
		<a href="${pageContext.request.contextPath}/guestbook/modifyMessage?messageId=${messageList.messageId}">수정</a>
		<hr>
	</c:forEach>
</body>
</html>