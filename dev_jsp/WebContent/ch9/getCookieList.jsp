<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="../Semantic-UI-CSS-master/Semantic-UI-CSS-master/semantic.css" />
<script src="../js/jquery-1.12.0.js"></script>
<script src="../Semantic-UI-CSS-master/Semantic-UI-CSS-master/semantic.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
function del() {
	alert("dd")
}
</script>
</head>
<body>
<%
	Cookie[] cs = request.getCookies();
	for(int i = 0;i<cs.length;i++){
		String cName = cs[i].getName();
		out.print("쿠키이름 : "+cName+", 쿠키값 : "+URLDecoder.decode(cs[i].getValue(),"utf-8"));
		out.print("<br>");
	}
%>
<h2>쿠키 목록</h2>
<table border="1">
	<tr>
		<th width="150px">쿠키이름</th>
		<th width="200px">쿠키값</th>
		<th colspan="2">쿠키옵션</th>
	</tr>

	<%
	for(int t = 0;t<cs.length;t++)
	{
	%>
	<tr>
	<td><%=cs[t].getName() %></td>
	<td><%=cs[t].getValue() %></td>
	
	<td>	
			<a href="cookieUpdate.jsp?result=up">쿠키변경</a>
	</td>
		<td>
			<a href="cookieUpdate.jsp?result=del">쿠키삭제</a>
		</td>
	</tr>
	<% } %>
</table>
</body>
</html>