<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request.jsp</title>
</head>
<body>
	<h1>request</h1>
	<dl>
		<dt>요청객체</dt>
		<dd>
			<ul>
				<%-- 인스턴스 : ~~의 인스턴스라는 식으로 표현을 많이함 --%>
				<li>HttpServletRequest의 인스턴스</li>
				<li>요청 정보를 갖고있는 아이
					<ul>
						<li>클라이언트와 관련된 정보</li>
						<li>요청 파라미터 정보</li>
						<li>쿠키 정보</li>
					</ul>
				</li>
				<li>
					<ul>
						<li>클라이언트 IP = <%=request.getRemoteAddr()%></li>
						<li>요청 인코딩 = <%=request.getCharacterEncoding()%></li>
						<li>요청 파라미터 =
							<ul>
								<%
									Enumeration<String> em = request.getParameterNames();
									while (em.hasMoreElements()) {
										out.write("<li>" + em.nextElement() + "</li>");
									}
								%>
							</ul>
						</li>
						<li>서버 이름 = <%=request.getServerName()%></li>
						<li>서버 포트 = <%=request.getServerPort()%></li>
						<li>메서드 종류 = <%=request.getMethod()%></li>
						<!-- 겟방식, 포스트 방식...반환  -->
						<li>콘텍스트 경로 = <%=request.getContextPath()%></li>
						<li>쿠키들 = <%=request.getCookies()%></li>
						<li>요청 헤더들 =
							<ul>
								<%
									Enumeration<String> em1 = request.getHeaderNames();
									while (em1.hasMoreElements()) {
										out.write("<li>" + em1.nextElement() + "</li>");
									}
								%>
							</ul>
						</li>
					</ul>
				</li>
			</ul>
		</dd>
	</dl>
</body>
</html>