<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>A.jsp</title>
<script type="text/javascript">
	function moveB() {
		//1번, 2번, 4번 모두 다 주소창이 바뀐다.
		location.href="b.jsp";
	}
</script>
</head>
<body>
<%
	String mem_name = "이성계";
	Map<String, Object> pMap = new HashMap<String, Object>();
	pMap.put("test_no", 2018080001);
	pMap.put("test_subject","정보처리기사");
	session.setAttribute("mem_name", mem_name);

	session.setAttribute("test", pMap);
%>
<button onClick="moveB()">이동(b.jsp)</button>
</body>
</html>