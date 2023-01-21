<%@page import="java.util.Arrays"%>
<%@page import="java.util.Map"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// post요청 시  자동 인코딩이 안되기 때문에 인코딩설정을 해줘야함!!
	request.setCharacterEncoding("utf-8");
	Map<String,String[]> paraMap = request.getParameterMap();
	String[] nameArr = paraMap.get("name");
	String[] emailArr = paraMap.get("email");
	String[] birthArr = paraMap.get("birth");
	String[] hobbiesArr = paraMap.get("hobbies");
	
	pageContext.setAttribute("이름", nameArr[0]);
	request.setAttribute("이메일", emailArr[0]);
	
	LocalDate birth = LocalDate.parse(birthArr[0]);
	session.setAttribute("생일", birth);
	
	ArrayList<String> hobbies = new ArrayList<String>(Arrays.asList(hobbiesArr));
	application.setAttribute("취미", hobbies);
	
	/* String name = request.getParameter("name");
	String email = request.getParameter("email");
	LocalDate birth = LocalDate.parse(request.getParameter("birth"));
	ArrayList<String> hobbies = new ArrayList<String>();
	for(String hobby : request.getParameterValues("hobbies")){
		hobbies.add(hobby);
	}
	
	pageContext.setAttribute("이름", name);
	request.setAttribute("이메일", email);
	session.setAttribute("생일", birth);
	application.setAttribute("취미", hobbies); */
	
	response.sendRedirect("show_info.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>