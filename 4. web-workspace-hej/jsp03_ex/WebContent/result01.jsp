<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	String address = request.getParameter("address");
	String email = request.getParameter("email");
	String date = request.getParameter("date");
	String gender = request.getParameter("gender");
	String lunch = request.getParameter("lunch");

	String[] hobbies = request.getParameterValues("hobbies");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
table {
	border: 1px solid black;
	border-collapse: collapse;
	text-align: center;
	position: absolute;
	left: 50%;
	transform: translateX(-50%);
}

tr, td {
	border: 1px solid black;
	padding: 5px;
}

td:first-child {
	background-color: #e7ead9;
	font-weight: bold;
}

td:last-child {
	background-color: #dfe3d0;
}
</style>
<body>
	<table>
		<tr>
			<td>이름</td>
			<td><%=name%></td>
		</tr>
		<tr>
			<td>나이</td>
			<td><%=age%></td>
		</tr>
		<tr>
			<td>주소</td>
			<td><%=address%></td>
		</tr>
		<tr>
			<td>생일</td>
			<td><%=date%></td>
		</tr>
		<tr>
			<td>성별</td>
			<td><%=gender%></td>
		</tr>
		<tr>
			<td>점심메뉴</td>
			<td><%=lunch%></td>
		</tr>
		<tr>
			<td>취미</td>
			<td>
				<%
					if (hobbies != null) {
						for (String h : hobbies) {
							out.write(h + "  ");
						}
					}
				%>
			</td>
		</tr>


	</table>
</body>
</html>