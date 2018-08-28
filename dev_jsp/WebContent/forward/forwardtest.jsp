<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
1번 코드 처리
2번 코드 처리
<%
//이 페이지는 화면에서 만날 수가 없어요.
//왜냐하면 이 값들은 넘길값들이기때문에 현재 페이지에서 만날수가 없음.
//forward처리가 일어나게 되므로 버퍼가 비워짐
	String mem_id="test";//이값은 getParameter로 읽고
request.setAttribute("mem_pw", "123");//이 값은 getAttribute로 읽어야됨.
%>
<jsp:include page="a2.jsp">
<jsp:param name="mem_id" value="<%=mem_id %>"/>
</jsp:include>
<!-- jsp:param이 있을경우 그냥 그 줄에서 처리를 해야 에러가 안뜸 뭔;;; -->
3번 코드처리 안됨

</body>
</html>