<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
	List<Map<String, Object>> pojoList = (List<Map<String,Object>>)request.getAttribute("pojoList");
if(pojoList !=null){
	out.print("��ȸ����� ������ : "+pojoList.size());
	
}
else{
	out.print("��ȸ����� ������ : "+pojoList.size());
	
}
%>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>���(select)</title>
</head>
<body>

</body>
</html>