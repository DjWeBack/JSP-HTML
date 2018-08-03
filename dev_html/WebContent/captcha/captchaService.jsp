<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.Map, java.util.HashMap" %>    
<%@ page import="java.util.List" %>
<%@ page import="com.naver.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet" type="text/css" href="/dev_html/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="/dev_html/themes/icon.css">
	<script type="text/javascript" src="/dev_html/js/jquery-1.12.0.js"></script>
	<script type="text/javascript" src="/dev_html/js/jquery.easyui.min.js"></script> 
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
var param ="comm-test";
function capacc(){
    $("#cap_id").val();
}
function move(){
   alert("테스트")
/*     $("#d_test").attr("method","get");
	$("#d_test").attr("action","/dev_html/cap.do");
	$("#d_test").submit(); */
$.ajax({
        method:"post"
        ,data:param
        ,url:"./capimg.jsp"/* 1단계 : 키발급 2단계 : 캡차이미지 생성*/
        ,success:function(captchaIMG){
            /* var view="<img id='captchaIMG' width='200px' height='90px'>"; */
            /* var img = $("#captchaIMG"); */
                       $("#d_captcha").html(captchaIMG);

        }
	,error:function(test){
        console.log();
    }

    }); 
}

</script>
</head>
<body>

<input id="nkey" type="hidden">
<input type="button" id="btn" value="캡차확인" onclick="move()">
<div id="d_captcha">

</div>



</body>
</html>