<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import="java.util.Map, java.util.HashMap" %>    
<%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	String mem_id = request.getParameter("mem_id");//forward 에서 선언한 mem_id를 겟 파라미터로 가져옴.
	Object mem_pw = request.getAttribute("mem_pw");
	out.print(mem_id);
	out.print("<br>");
	out.print(mem_pw.toString());
%>
</body>
</html>