<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="../../js/jquery-1.12.0.js"></script>
<script type="text/javascript">
    var watch;
    
   var i=0;
    function autoReload(){
        $("#d_news").text("뉴스내용...."+i)
        i=i+1;
      
    }

    function start(){
        watch=setInterval(autoReload,1);
        $("#d_news2").hide(500);
        
    }
    function stop(){
        setTimeout(function(){
            clearInterval(watch);
            i = 0;
        });
    }

</script>
</head>
<body>
    <script type="text/javascript"></script>
    연합뉴스 : 
      
            <input type="button" value="시작" onclick="start()">
            
            <div id="d_news"></div>
            <div id="d_news2">
            <input type="button" value="중지" onclick="stop()">
            </div>
            
            


</body>
</html>