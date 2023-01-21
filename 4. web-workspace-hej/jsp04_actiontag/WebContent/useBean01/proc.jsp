<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="employee" class="ex01.Employee" scope="request">
	<!-- 리퀘스트 파라미터 이름과 클래스필드의 이름이 동일한 것들을 전부 세팅해줌 -->
	<jsp:setProperty property="*" name="employee"/>
</jsp:useBean>
<jsp:setProperty property="birth" name="employee" value='<%=LocalDate.parse(request.getParameter("birthDate")) %>'/>
<jsp:forward page="show.jsp"/>
