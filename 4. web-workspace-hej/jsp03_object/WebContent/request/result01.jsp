<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	// 클라이언트가 요청한 내용을 parameter를 받아보자
	// 파라미터를 받기 위해서 request객체를 이용한다.
	String name = request.getParameter("name"); // name이 name인 아이의 value를 받는다.
	String address = request.getParameter("address");
	String gender = request.getParameter("gender");

	// 체크박스
	String[] hobby = request.getParameterValues("hobby");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result01.jsp</title>
</head>
<body>
	<h1>전달 받은 값</h1>
	<ul>
		<li>이름 : <%=name%></li>
		<li>주소 : <%=address%></li>
		<li>성별 : <%=gender%></li>
		<li>취미 :
			<ul>
				<%
					for (String h : hobby) {
				%>
				<li><%=h%></li>

				<%
					}
				%>
			</ul>
		</li>
	</ul>
</body>
</html>