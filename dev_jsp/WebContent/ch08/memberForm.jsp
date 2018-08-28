<%@page import="com.ch08.JobDao"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="jobdao" class="com.ch08.JobDao"/>
<html>
<head>
<link rel="stylesheet" href="../Semantic-UI-CSS-master/Semantic-UI-CSS-master/semantic.css" />
<script src="../js/jquery-1.12.0.js"></script>
<script src="../Semantic-UI-CSS-master/Semantic-UI-CSS-master/semantic.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>회원가입</title>

</head>
<body>
<script type="text/javascript">
$(document).ready(function() {
	$('.ui.dropdown')
	  .dropdown();
});
</script>
<%
	List<Map<String, Object>> joblist = jobdao.getJobList("1");
out.print(joblist.size()+"<BR>");
for(int i=0;i<joblist.size();i++){
}
%>
<table>
	<tr>
		<td>아이디 : <br></td>
	</tr>
	<tr>
		<td>이름 : <br></td>
	</tr>
	<tr>
		<td>패스워드 : <br></td>
	</tr>
	<tr>
		<td>직업 : <br></td>
	</tr>
<div class="ui dropdown">
  <input name="gender" type="hidden">
  <i class="dropdown icon"></i>
  <div class="default text">Gender</div>
  <div class="menu">
  <%for(int i=0;i<joblist.size();i++){
   %>
    <div class="item" data-value="<%=joblist.get(i)%>"><%=joblist.get(i).get("J_NAME") %></div>
    <%} %>
  </div>
</div>
</table>



</body>
</html>