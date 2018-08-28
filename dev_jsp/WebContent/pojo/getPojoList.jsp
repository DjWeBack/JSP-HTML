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
	out.print("조회결과가 있을때 : "+pojoList.size());
	
}
else{
	out.print("조회결과가 없을때 : "+pojoList.size());
	
}
%>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>목록(select)</title>
</head>
<body>

</body>
</html>