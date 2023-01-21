<%@page import="jsp08_mvc_marvel.model.MarvelListView"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="marvel_write" method="post">
		<fieldset>
			<legend>마블 영화 등록</legend>
			<input type="text" name="title" placeholder="영화제목(한글)" required>
			<input type="text" name="titleEng" placeholder="영화제목(영어)" required>
			<input type="date" name="releaseDate" required> <input
				type="number" name="worldBoxOffice" required> <input
				type="submit">
		</fieldset>
	</form>

	<c:if test="${viewData.messageTotalCount == 0}">
		<h1>메시지가 없습니다.</h1>
	</c:if>
	<c:if test="${viewData.messageTotalCount > 0 }">

		<c:forEach var="marvel" items="${viewData.marvelList}">
			<table>
				<tr>
					<th colspan="2">${marvel.title }<br>${marvel.titleEng }</th>
				</tr>
				<tr>
					<td>등록번호</td>
					<td>${marvel.marvelId }</td>
				</tr>
				<tr>
					<td>개봉일</td>
					<td>${marvel.releaseDate }</td>
				</tr>
				<tr>
					<td>월드 박스 오피스</td>
					<td>${marvel.worldBoxOffice }</td>
				</tr>
				<tr>
					<td>등록일<br>${marvel.writeDate }</td>
					<td>수정일
					<a href="${pageContext.request.contextPath}/marvel_update?marvel_id=${marvel.marvelId}">[수정]</a>
					<a href="${pageContext.request.contextPath}/marvel_delete?marvel_id=${marvel.marvelId}">[삭제]</a>
					<br>${marvel.updateDate }</td>
				</tr>
			</table>
		</c:forEach>
		
		
		
		
		<c:set var="currentPage" value="${viewData.currentPageNumber }"></c:set>
		<c:set var="startPage" value="${(currentPage) - ((currentPage-1)%3)}"></c:set>
		<div>
			<c:if test="${startPage != 1 }">
				<span><a href="marvel_list?page=${startPage - 1}">이전</a></span>
			</c:if>
			
			<c:if test="${(startPage + 3) <= viewData.pageTotalCount }">
				<c:forEach var="i" begin="0" end="2">
					<span><a href="marvel_list?page=${startPage + i }">[${startPage + i }]</a></span>
				</c:forEach>
				<span><a href="marvel_list?page=${startPage + 3 }">이후</a></span>
			</c:if>
			
			
			<!-- 
				<<페이지의 끝인 경우>>
				- "이후" 버튼 제거
				- 끝 페이지까지만 출력하도록 반복문 설정
			-->
			<c:if test="${(startPage + 3) > viewData.pageTotalCount }">
				<c:forEach var="i" begin="${startPage}" end="${viewData.pageTotalCount}">
						<span><a href="marvel_list?page=${i }">[${i}]</a></span>
				</c:forEach>
			</c:if>
		</div>
		
		
		
	</c:if>
</body>
</html>