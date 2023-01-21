<%@page import="java.util.Iterator"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>today.jsp</title>
</head>
<body>
	<h1>오늘 날짜를 출력해주세요</h1>
	<%-- 오늘은: 0000년, 00월, 00일    00시:00분:00초 --%>
	<%
		LocalDateTime now = LocalDateTime.now();
		int year = now.getYear();
		int month = now.getMonthValue();
		int day = now.getDayOfMonth();
		int hour = now.getHour();
		int minute = now.getMinute();
		int second = now.getSecond();
		String seconds = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ss"));
		out.write("<h1>오늘은: " + year + "년 " + month + "월 " + day + "일" + " &nbsp;&nbsp;&nbsp;");
		out.write(hour + "시:" + minute + "분:" + seconds + "초");
	%>
	<br> 오늘은:
	<%=now.getYear()%>년,
	<%=now.getMonthValue()%>월,
	<%=now.getDayOfMonth()%>일
	<%=now.getHour()%>시
	<%=now.getMinute()%>분
	<%=now.getSecond()%>초

	<hr>
	<%-- 1~10까지 수를 출력해보자 --%>
	<ul>
		<%
			for (int i = 1; i <= 10; i++) {
		%>
		<li><%=i%></li>
		<%
			}
		%>
	</ul>
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
	<%-- 구구단 테이블로 만들어보세요! --%>
	<table>
		<%
			for (int i = 1; i <= 9; i++) {
		%>
		<tr>
			<%
				for (int j = 2; j <= 9; j++) {
			%>
			<td><%=j%>*<%=i%>=<%=i * j%></td>
			<%
				}
			%>
		</tr>
		<%
			}
		%>
	</table>



	<%--
		Set을 이용한 메서드
		getLottoNums()를 만들고
		호출하여 로또 번호를 li태그 안쪽에 넣어 출력하세요
		
	 --%>
	<%!public HashSet<Integer> getLottoNums() {
		HashSet<Integer> lottoNums = new HashSet<Integer>();

		for (int i = 0; i < 6; i++) {
			int rand = ((int) (Math.random() * 45) + 1);
			if (lottoNums.contains(rand)) {
				i--;
				continue;
			}
			System.out.println("i: " + i + "///////////" + rand);
			lottoNums.add(rand);
		}
		/* while(lottoNums.size() < 6){
			int num = (int)(Math.random() * 45) + 1;
			lottoNums.add(num);
		} */

		return lottoNums;
	}%>

	<ol>
		<%
			HashSet<Integer> lottoNums = getLottoNums();

			for (int num : lottoNums) {
		%>
		<li><%=num%></li>
		<%
			}
		%>
	</ol>

</body>
</html>