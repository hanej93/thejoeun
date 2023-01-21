<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="student" class="ex01.Student" scope="request"></jsp:useBean>
<!--
	아래 코드와 똑같음
	Student student = new Student();
	request.setAttribute("student", student);
	
	id: 사용할 객체 명(키, 변수명과 같음)
	class: 해당 클래스가 있는 위치(패키지+클래스명)
	scope: 객체의 적용 범위(기본객체의 종류: pageContext,request,session,application)
  -->
<%
	//위에서 만들어두었기에 실행이 가능함
	//student.getAge();
	//request.getAttribute("student");
	
	String name = request.getParameter("name");
%>
<jsp:setProperty property="name" name="student" value="<%=name %>"/>
<jsp:setProperty property="age" name="student" param="age"/>
<jsp:forward page="studentView_useBean.jsp"></jsp:forward>
<!-- 
	주의
	setProperty는 실제로 set메서드를 호출하는 것임

 -->
