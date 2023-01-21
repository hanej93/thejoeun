<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>scope</title>
</head>
<body>
	<h1>scope</h1>
	<dl>
		<dt>page scope</dt>
		<dd>
			pageContext객체<br>
			페이지에 대한 정보를 갖고 있음<br>
			하나의 jsp페이지 안에서만 영향을 미침<br>
			request객체와 response객체도 가져올 수 있음<br>
			예) request.jsp 페이지와 form01.jsp 페이지 안에 있는 pageContext객체는 다른 객체이다<br>
			<%
				JspWriter jspOut = pageContext.getOut(); // Out객체와 같은 아이
				HttpServletRequest req = (HttpServletRequest)pageContext.getRequest();
				HttpServletResponse resp = (HttpServletResponse)pageContext.getResponse();
			%>
			
			<hr>
			번외) page객체가 따로 있는데 요것은 this와 같음
		</dd>
		<dt>request scope</dt>
		<dd>
			Request객체<br>
			요청 단위의 범위를 갖는다<br>
			하나의 요청에 하나의 객체가 생성된다<br>
			요청내용(파라미터, 클라이언트 정보 등등을 담고 있다.)<br>
		</dd>
		<dt>session scope</dt>
		<dd>
			session객체<br>
			브라우저 단위의 범위를 갖는다<br>
			브라우저가 종료되거나 일정 시간이 종료되면 사라짐<br>
		</dd>
		<dt>application scope</dt>
		<dd>
			application객체<br>
			어플리케이션 단위의 범위를 갖음<br>
			서버가 실행되는 내내 사용되는 객체
		</dd>
	</dl>
	<%
		// 위의 4개는 데이터를 저장할 수 있음
		// attribute라는 것으로 저장함
		// setAttribute("이름", 데이터);   데이터: 객체
		// getAttribute("이름");
		pageContext.setAttribute("일번", "1번값");
		request.setAttribute("일번", 100);
		session.setAttribute("일번", 10.10);
		application.setAttribute("일번", true);
		
	%>
</body>
</html>