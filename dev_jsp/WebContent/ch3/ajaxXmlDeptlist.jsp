<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript"></script>
<script type="text/javascript" src="../js/jquery-1.12.0.js"></script>
</head>
<body>
    <script type="text/javascript">
    $.ajax({
        method:"get"
        ,url:"./deptXML.xml"
        ,dataType:"xml"
        ,success:function(result){
        	
         $.result.find('deptlist').each(function(){
          var $entry = $(this);
            alert($entry.attr('deptno').text()+", "+$entry.attr('dname').text()+", "+$entry.attr('loc').text());
            });
        }
    
  


    });
    </script>
</body>
</html>