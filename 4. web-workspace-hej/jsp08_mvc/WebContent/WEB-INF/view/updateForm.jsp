<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정화면</title>
</head>
<body>
	<h1>메시지 수정화면</h1>
	<form action="${pageContext.request.contextPath}/update" method="post">
	<fieldset>
		<legend>방명록</legend>
		<input type="hidden" name="messageId" value="${message.messageId }">
		<input type="datetime-local" value="${message.writeDate }" name="writeDate" readonly>
		<input type="text" name="guestName" placeholder="이름" value="${message.guestName }">
		<input type="submit" value="메시지 수정"><br>
		<textarea rows="5" cols="20" placeholder="내용" name="message">${message.message }</textarea>
	</fieldset>
</form>
</body>
</html>