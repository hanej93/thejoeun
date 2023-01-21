<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int num1 = 0;
	int num2 = 0;
	int result = 0;
	String oper = "x";
	
	if(!request.getParameter("num1").equals("")){
		num1 = Integer.parseInt(request.getParameter("num1"));	
	}
	if(!request.getParameter("num2").equals("")){
		num2 = Integer.parseInt(request.getParameter("num2"));
	}
	if(request.getParameter("oper") != null){
		oper = request.getParameter("oper");
		if(oper.equals("+")){
			result = num1 + num2;
		} else if (oper.equals("-")){
			result = num1 - num2;
		} else if (oper.equals("*")){
			result = num1 * num2;
		} else if (oper.equals("/")){
			result = num1 / num2;
		} else if (oper.equals("%")){
			result = num1 % num2;
		}
	}
	
	
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>연산 결과 : <%=num1 %> <%=oper %> <%=num2 %> = <%=result %></h1>
</body>
</html>