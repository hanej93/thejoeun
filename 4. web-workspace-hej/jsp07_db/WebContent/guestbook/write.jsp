<%@page import="java.sql.SQLException"%>
<%@page import="jsp07_db.model.MessageDao"%>
<%@page import="jsp07_db.db.MyConnector"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="jsp07_db.model.MessageDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("utf-8");%>

<jsp:useBean id="messageDto" class="jsp07_db.model.MessageDto" scope="page">
	<jsp:setProperty property="*" name="messageDto"/>
</jsp:useBean>
<%
	messageDto.setWriteDate(LocalDateTime.now());
	

	try(Connection conn = MyConnector.getConnection()){
		MessageDao messageDao = MessageDao.getInstance();
		messageDao.insert(conn, messageDto);
	} catch(SQLException e){
		e.printStackTrace();
	} catch(Exception e){
		e.printStackTrace();
	}
	
	response.sendRedirect("message.jsp");
	
%>
