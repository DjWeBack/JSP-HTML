<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	Cookie cs1 = new Cookie("weback_id","weback");
	response.addCookie(cs1);
	
	Cookie cs2 = new Cookie("weback_pw","w1e1b1a1c1k1");
	response.addCookie(cs2);
	
	Cookie cs3 = new Cookie("weback_name","김위백");
	response.addCookie(cs3);
	
	
%>
</body>
</html>