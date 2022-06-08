<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="edu.Lecture1.CalFunction" %>
<%
	int firstValue = Integer.parseInt(request.getParameter("firstValue"));
	int secondValue = Integer.parseInt(request.getParameter("secondValue"));
	String mark = request.getParameter("mark"); 

	CalFunction cf = new CalFunction();
	int result = cf.calFunction(firstValue, secondValue, mark);
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사칙연산 수행</title>
</head>
<body>
	결과 : <%=result %>
</body>
</html>