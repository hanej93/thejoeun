<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>actiontag.jsp</title>
</head>
<body>
	<h1>액션태그</h1>
	<dl>
		<dt>액션태그란</dt>
		<dd>액션태그는 XML문법 규칙을 따르는 JSP 자체 태그를 말한다</dd>
		<!-- <jsp:태그명>내용</jsp:태그명> -->
		<dd>
		액션 태그
			<ul>
				<li>forward: 페이지를 이동(request,response 객체를 전달함)</li>
				<li>include: 다른 페이지를 현재 페이지로 포함시킴</li>
				<li>useBean: 빈(bean) 객체를 생성 또는 사용</li>
				<li>setProperty: 빈(bean)객체에 속성 넣기</li>
				<li>getProperty: 빈(bean)객체에 속성 가져오기</li>
				<li>param: 파라미터 세팅</li>
			</ul>
		</dd>
	</dl>
</body>
</html>
