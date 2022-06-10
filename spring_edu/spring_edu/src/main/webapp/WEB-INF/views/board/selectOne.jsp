<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>게시글 상세 조회 화면</title>
		<style>
			.table_css{
				border: 1px solid #000;
				width: 80%;
				margin: 0 auto;
			}
		</style>
	</head>
	<body>
		<table class="table_css">
			<tr>
				<td>제목</td>
				<td>
					<c:out value="${boardTitle}"></c:out>
				</td>
				<td>내용</td>
				<td>
					<c:out value="${boardContents}"></c:out>
				</td>
			</tr>
		</table>
	</body>
</html>