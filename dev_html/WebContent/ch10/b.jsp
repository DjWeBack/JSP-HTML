<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>B.jsp</title>
</head>
<body>
<%
	Map<String, Object> sMap = new HashMap<String, Object>();

	sMap = (Map<String, Object>)session.getAttribute("test");
	String sname = (String)session.getAttribute("mem_name");
	out.print("�̸� : "+ sname);
	out.print("<br>");
	out.print("�����ȣ: "+ sMap.get("test_no"));
	out.print("<br>");
	out.print("�������: "+ sMap.get("test_subject"));
%>
</body>
</html>