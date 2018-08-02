<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery-1.12.0.js"></script>
<script type="text/javascript">
function moveTo(){
location.href ="p72Form.jsp";

}
function ajaxTo(){
$.ajax({
    url:"p72Form.jsp"
    ,method:"POST"
    ,success:function(result){
        $("#d_ajax").html(result);
    }

});

}
</script>
</head>
<body>
<!-- 자바스크립트 페이지 이동 -->
<input type="button" value="moveTo" onclick="moveTo()">
<br>
<input type="button" value="ajax이동" onclick="ajaxTo()">
<!-- ajax 페이지 이동 -->
<div id="d_ajax"></div>
<%-- jsp or servlet 이동 jsp주석 --%>
<%
 /* response.sendRedirect("/dev_jsp/Login.do"); */
%>

</body>
</html>