<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>listview.jsp</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/write" method="post">
	<fieldset>
		<legend>방명록</legend>
		<input type="text" name="guestName" placeholder="이름">
		<input type="submit" value="메시지 남기기"><br>
		<textarea rows="5" cols="20" placeholder="내용" name="message"></textarea>
	</fieldset>
</form>

<c:if test="${viewData.messageTotalCount == 0 }">
	<h1>등록된 메시지가 없습니다.</h1>
</c:if>
<c:if test="${viewData.messageTotalCount > 0 }">
	<section>
		<c:forEach var="message" items="${viewData.messageList}">
			<article>
				메시지 ID: ${message.messageId}<a href="${pageContext.request.contextPath}/update?message_id=${message.messageId}">수정</a>
				<a href="${pageContext.request.contextPath}/delete?message_id=${message.messageId}">삭제</a><br>
				작성자: ${message.guestName }<br>
				작성일: ${message.writeDate }<br>
				내용:
				<div>
					${message.message }
				</div>
			</article>
		</c:forEach>
		
	</section>
	<section>
	<%-- 페이징 --%>
		<c:forEach var="pageNum" begin="1" end="${viewData.pageTotalCount}">
			<a href="list?page=${pageNum}">[${pageNum}]</a>
			
		</c:forEach>
	
	</section>
	
</c:if>
	
</body>
</html>