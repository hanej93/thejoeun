<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계산기</title>
</head>
<body>
	<%!public int sum(int n1, int n2){
		
		return n1+n2;
	}
	public int sub(int n1, int n2){
		
		return n1-n2;
	}
	public void mul(int n1, int n2){
		
		System.out.println(n1*n2);
	}
	public void div(int n1, int n2){
		
		System.out.println(n1/n2);
	}
	%>
	<table>
		<%
			int i = 20;
			int j = 4;
		%>
		<tr>
			<th>식</th><th>결과</th>
		</tr>
		<tr>
			<td><%=i %>+<%=j %>=</td><td><%=sum(i,j) %></td>
		</tr>
		<tr>
			<td><%=i %>-<%=j %>=</td><td><%=sub(i,j) %></td>
		</tr>
			<td><%=i %>*<%=j %>=</td><td><%mul(i,j); %>콘솔에 출력</td>
		<tr>
			<td><%=i %>/<%=j %>=</td><td><%div(i,j); %>콘솔에 출력</td>
		</tr>
	</table>
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
</body>
</html>