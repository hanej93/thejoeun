<%@page import="java.util.ListIterator"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
		table {
	border: 1px solid black;
	border-collapse: collapse;
	text-align: center;
	background-color: lime;
}

td, tr {
	border: 1px solid black;
	padding: 5px;
}
	</style>
</head>
<body>
	<h1>테스트</h1>
	<%! ArrayList<String> foods;
		public void setFood(){
			foods = new ArrayList<String>();
			foods.add("돼지국밥");
			foods.add("순대국밥");
			foods.add("콩나물국밥");
		}
	%>
	<table>
	<%
		setFood();
		for(int i = foods.size() - 1; i >= 0 ; i--){ 
			String food = foods.get(i-1);
			out.write("<tr><td>"+ (3 - i + 1) +"</td><td>" + food + "</td></tr>");
		}
	%>
	</table>

</body>
</html>