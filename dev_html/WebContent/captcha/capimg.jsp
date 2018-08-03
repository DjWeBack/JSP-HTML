<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.Map, java.util.HashMap" %>    
<%@ page import="java.util.List" %>
<%@ page import="com.naver.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
APIExamCaptchaImage apinimg = new APIExamCaptchaImage();
Map<String, Object> map = apinimg.start();
//객채주입을 안했음...

%>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/dev_html/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="/dev_html/themes/icon.css">
	<script type="text/javascript" src="/dev_html/js/jquery-1.12.0.js"></script>
	<script type="text/javascript" src="/dev_html/js/jquery.easyui.min.js"></script> 

<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">

function capacc(){
	var param = $("#f_cap_id").serialize();
//alert(param);
     $.ajax({
         method : "post"
         ,url :"/dev_html/cap.dop"
         ,data : param
         ,success:function(result){
             $("#d_su").html(result);

         }
     })
}
	
</script>
</head>
<body>
<div id="d_chare">
<img src="<%=map.get("url")%>"><br>
</div>
<form id="f_cap_id">
<input type="hidden" id="cap_key" name="cap_key" value="<%=map.get("key")%>">
<input id="cap_id" name="cap_id" type="text" style="width:150px" class="easyui-textbox" data-options="iconAlign:'left'">
<a id="ok_btn"href="javascript:capacc()" class="easyui-linkbutton" data-options="iconCls:'icon-ok'">확인</a>
<a id="re_btn"href="javascript:capre()" class="easyui-linkbutton" data-options="iconCls:'icon-ok'">새로고침</a>
</form>
<div id="d_su"></div>
</body>
</html>