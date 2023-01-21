<%@page import="java.sql.SQLException"%>
<%@page import="jsp07_db.model.MessageDto"%>
<%@page import="jsp07_db.model.MessageDao"%>
<%@page import="jsp07_db.db.MyConnector"%>
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
	// 어떤 방명록을 수정할지 알아야 함
	int messageId = Integer.parseInt(request.getParameter("message_id"));
	
	// id에 해당하는 방명록 데이터를 가져온다
	try(Connection conn = MyConnector.getConnection()){
		
		MessageDao messagedao = MessageDao.getInstance();
		MessageDto messageDto = messagedao.selectOneById(conn, messageId);
%>
	<form action="updateProc.jsp" method="post">
		<fieldset>
			<legend>방명록 수정</legend>
			<input type="hidden" name="messageId" value="<%=messageId %>">
			<input type="text" name="guestName" placeholder="작성자" value="<%=messageDto.getGuestName()%>"><br>
			<textarea rows="5" cols="20" placeholder="내용" name="message"><%=messageDto.getMessage() %></textarea>
			<input type="submit" value="메시지 남기기">
		</fieldset>
	</form>
	
<%
	} catch(Exception e){%>
		<h2>잘못된 접근입니다</h2>
		<a href="message.jsp">방명록 목록으로 돌아가기</a>
	<%
	}
%> 	
</body>
</html>	
   
