<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
	List<Map<String, Object>> boardList = (List<Map<String, Object>>)request.getAttribute("boardList");
%>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr><th>�۹�ȣ</th><th>������</th></tr>
<%
if(boardList!=null){
for(int i=0;i<boardList.size();i++){
	Map<String, Object> rMap = boardList.get(i);
%>
<tr><th><%=rMap.get("b_no") %></th><th><%=rMap.get("b_title") %></th></tr>
<%
}
%>

<%
}

%>

<tr><th colspan="2">��ȸ�� ����� �����ϴ�.</th></tr>
</table>

</body>
</html>