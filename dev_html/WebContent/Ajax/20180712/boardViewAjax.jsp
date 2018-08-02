<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>판매관리</title>

<script type="text/javascript" src="../../js/jquery-1.12.0.js"></script>
<script type="text/javascript">
	
		function account(){
	$.ajax({
        url:"./boardAction.jsp?"+new Date().getDate(),
        method : "GET",
        success : function(data){
            // alert(data);
			alert("새로 집계된 판매량 : "+data);
        },
        error:function(){
        	
        }
    

	});
    
	}
</script>
</head>
<body>
	<h2>웨이크 보드 판매현황</h2>
	<table border="1" width="300px" height="80px">
		<tr>
			<th width="130px">보드판매량</th>
			<td width="170px"><span id="board_sold">12</span></td>
		</tr>
		<tr>
			<th width="130px">소비자가</th>
			<td width="170px"><span id="price">3800000</span></td>
		</tr>
		<tr>
			<th width="130px">구매가</th>
			<td width="170px"><span id="cost">2500000</span></td>
		</tr>
	</table>
	<br>
	<input type="button" value="마진은?" onclick="account()">
	<div id="d_margin">총 마진금액은 XXXXXXX입니다.</div>
</body>
</html>