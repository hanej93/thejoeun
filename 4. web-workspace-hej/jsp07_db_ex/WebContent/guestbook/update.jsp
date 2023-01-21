<%@page import="jsp07_db_ex.model.MessageDto"%>
<%@page import="jsp07_db_ex.model.MessageDao"%>
<%@page import="jsp07_db_ex.db.MyConnector"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정</title>
</head>
<body>
	<%
	int messageId = Integer.parseInt(request.getParameter("message_id"));
	
	try(Connection conn = MyConnector.getConnection()){
		MessageDao messagedao = MessageDao.getInstance();
		MessageDto messagedto = messagedao.selectOneById(conn, messageId);
%>
	<form action="updateProc.jsp" method="post">
		<fieldset>
			<legend>방명록 쓰기</legend>
			<input type="hidden" name="messageId" value="<%=messageId %>">
			<input type="text" name="guestName" placeholder="작성자" value="<%=messagedto.getGuestName() %>"><br>
			<textarea rows="5" cols="20" placeholder="내용" name="message"><%=messagedto.getMessage() %></textarea>
			<input type="submit" value="메시지 남기기">
		</fieldset>
	</form>


	<%	
	} catch(Exception e){ %>
		<h2>접못된 접근입니다 </h2>
		<a href='message.jsp'>방명록으로 돌아가기</a>
	<%
	}
%>


</body>
</html>