<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>게시글 등록 화면</title>
		<style>
			.table_css{
				border: 1px solid #000;
				width: 80%;
				margin: 0 auto;
			}
		</style>
	</head>
	<body>
		<form action="/board/insert" method="post">
			<table class="table_css">
				<tr>
					<td>제목</td>
					<td>
						<input type="text" id="board_title" name="boardTitle">
					</td>
					<td>내용</td>
					<td>
						<input type="text" id="board_contents" name="boardContents">
					</td>
				</tr>
			</table>
			<button type="submit">등록</button>
		</form>
		
		<script>
			
		</script>
	</body>
</html>