<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>addMessage.jsp</title>
<style>
	#messageContainer{border: 1px solid black;width:300px;height:110px;padding:5px;}
	#message{margin:3px;}
</style>
</head>
<body>
<h1>방명록 작성</h1><br>
	<div id="messageContainer">
		<form action="${pageContext.request.contextPath}/guestbook/addMessage" method="post">
			작성자 이름 : <input id="message" type="text" name="guestName" placeholder="작성자 이름을 입력하세요"><br>
			메시지 암호 : <input id="message" type="text" name="password" placeholder="암호를 입력하세요"><br>
			메시지 내용 : <input id="message" type="text" name="message" placeholder="메시지 내용을 입력하세요"><br>
			<input type="submit" value="작성"><br>
		</form>
	</div>
</body>
</html>