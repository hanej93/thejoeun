<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el.jsp</title>
</head>
<body>
	<h1>표현언어 el-Expression language</h1>
	<dl>
		<dt><h2>EL</h2></dt>
		<dd>
			<ul>
				<li>스크립트 언어</li>
				<li>값을 표현할 때 쓰기 편리한 언어</li>
				<li>자바의 연산 기능도 지원함</li>
				<li>JSP 기본 내장 객체도 사용 가능</li>
				<li>객체의 메서드 호출도 가능</li>
				<li>방법은 ${"내용"}를 이용한다.</li>
			</ul>		
		</dd>
		<dd>
			<ul>
				<li>불린:${true}</li>
				<li>정수:long ${10000000000}</li>
				<li>실수:double ${3.147}</li>
				<li>문자열:String ${"문자열"}</li>
			</ul>
			<ul>
				<li>pageContext: pageScope</li>
				<li>request: requestScope</li>
				<li>session: sessionScope</li>
				<li>application: applicationScope</li>
				<li>parameter Map: param</li>
				<li>parameter values: paramValues</li>
				<li>cookie: cookie</li>
			</ul>
		</dd>
	</dl>
</body>
</html>
