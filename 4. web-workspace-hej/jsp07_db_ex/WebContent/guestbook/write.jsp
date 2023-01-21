<%@page import="java.sql.SQLException"%>
<%@page import="jsp07_db_ex.model.MessageDao"%>
<%@page import="java.sql.Connection"%>
<%@page import="jsp07_db_ex.db.MyConnector"%>
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<!-- 
	MessageDto messageDto = new MessageDto();
	pageContext.setAttribute("messageDto", messageDto);
	리퀘스트 스코프에  있는 messageDto = messageDto;
	
	pageContext.setAttribute("abc", efg);
	페이지 스코프에 있는 abc = efg;
 -->
<jsp:useBean id="messageDto" class="jsp07_db_ex.model.MessageDto" scope="page">
	<jsp:setProperty property="*" name="messageDto"/>
</jsp:useBean>
<%
	
	messageDto.setWriteDate(LocalDateTime.now());

	try(Connection conn = MyConnector.getConnection()){
		MessageDao messageDao = MessageDao.getInstance();
		messageDao.insert(conn, messageDto);	
	} catch(SQLException e){
		e.printStackTrace();
	} catch(Exception e) {
		e.printStackTrace();
	}

	
	// "새로운 요청" 보냄! Request(요청)
	response.sendRedirect("message.jsp");
	
%>
