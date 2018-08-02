<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery-1.12.0.js"></script>
<script>
$(document).ready(function(){
    $("#btn_send").click(function(){
        $("#f_start").attr("method","post");
        $("#f_start").attr("action","/dev_jsp/hello.weback")
        $("#f_start").submit();
    });
});

</script>
</head>
<body>
    <form id="f_start">
<input class="easyui-textbox" id="tb_name" name="tb_name">

<input type="button" id="btn_send" value="Hello">
</form>
</body>
</html>