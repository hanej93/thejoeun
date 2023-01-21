<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>b.jsp</title>
</head>
<body>
	<%
	
		// 객체에서 attribute 받기
		//String pageData = (String)pageContext.getAttribute("일번");
		//int requestData = (Integer)request.getAttribute("일번");
		//double sessionData = (Double)session.getAttribute("일번");
		//boolean applicationData = (Boolean)application.getAttribute("일번");
	%>
	pageDate: <%=pageContext.getAttribute("일번") %><br>
	requestData: <%=request.getAttribute("일번") %><br>
	sessionData: <%=session.getAttribute("일번") %><br>
	applicationData: <%=application.getAttribute("일번") %><br>
</body>
</html>