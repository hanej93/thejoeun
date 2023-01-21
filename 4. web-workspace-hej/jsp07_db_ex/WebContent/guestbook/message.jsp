<%@page import="java.sql.SQLException"%>
<%@page import="jsp07_db_ex.model.MessageDao"%>
<%@page import="jsp07_db_ex.db.MyConnector"%>
<%@page import="java.sql.Connection"%>
<%@page import="jsp07_db_ex.model.MessageDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	List<MessageDto> messageList = null;
	try(Connection conn = MyConnector.getConnection()){
		MessageDao messageDao = MessageDao.getInstance();
		
		messageList = messageDao.selectList(conn);
		
	} catch(SQLException e){
		e.printStackTrace();
	} catch(Exception e){
		e.printStackTrace();
	}
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방명록</title>
</head>
<body>
	<form action="write.jsp" method="post">
		<fieldset>
			<legend>방명록 쓰기</legend>
			<input type="text" name="guestName" placeholder="작성자"><br>
			<textarea rows="5" cols="20" placeholder="내용" name="message"></textarea>
			<input type="submit" value="메시지 남기기">
		</fieldset>
	</form>
	<hr>
    
	<c:forEach var="msg" items="<%=messageList %>">
		<div>
			메시지번호: ${msg.messageId} ,  작성일: ${msg.writeDate}<br>
			작성자: ${msg.guestName }<br>
			<textarea rows="5" cols="50" disabled="disabled">${msg.message }</textarea>
			<a href="update.jsp?message_id=${msg.messageId }">수정</a>
		</div>
	</c:forEach>
	
	
</body>
</html>