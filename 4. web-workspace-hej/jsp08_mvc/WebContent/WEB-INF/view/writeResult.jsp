<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과 화면</title>
<script>
	if(${wr}){
		alert("성공하였습니다.");		
	} else {
		alert("실패하였습니다.");		
	}
	location.href="${pageContext.request.contextPath}/list";
</script>

</head>
<body>

</body>
</html>