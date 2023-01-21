<%@page import="java.sql.SQLException"%>
<%@page import="jsp07_db_ex.model.MessageDao"%>
<%@page import="jsp07_db_ex.db.MyConnector"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// updateProc.jsp
request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="messageDto" class="jsp07_db_ex.model.MessageDto" scope="page">
	<jsp:setProperty property="*" name="messageDto"/>
</jsp:useBean>
<%
messageDto.setWriteDate(LocalDateTime.now());

try(Connection conn = MyConnector.getConnection()){
	MessageDao messageDao = MessageDao.getInstance();
	messageDao.update(conn, messageDto);
	
	response.sendRedirect("message.jsp");
	
} catch(SQLException e){
	e.printStackTrace();
} catch(Exception e) {
	e.printStackTrace();
}




%>