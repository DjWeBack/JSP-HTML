<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
	
	<%
	String n_uname = request.getParameter("tb_name");
	String n_usercomt = request.getParameter("tb_comt");
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="../../js/jquery-1.12.0.js"></script>
<script type="text/javascript">
    function newsInsert(){
        alert("newsInsert호출 성공");
        $("#f_newsIns").attr("method","GET");
        $("#f_newsIns").attr("action","newsInsAction.jsp");
        $("#f_newsIns").submit();

    }


</script>
</head>
<body>
<script type="text/javascript">
$(document).ready(function(){

	$("#btn_send").click(function(){ 
		$("#btn_send").hide();
         $.ajax({
             url:"./newsAction.jsp",
             method:"GET",
             success:function(data){
             $("#d_comt").html(data);
             $("#btn_send").click(newsInsert);
             
             
             }
         });
            });
});
</script>
	<h1>‘몬스터헌터 월드’ PC판 출시 일정 공개 스팀에서 8월 10일…사양은?</h1>
	<br>


	<table border="1" width="300px" height="80px">
		<tr>
			<td width="170px"><span id="cost"><img
					src="L20180710.99099004401i1.jpg"></span></td>
		</tr>
	</table>

	10일 새벽 1시(한국시간) ‘몬스터헌터 월드’ 유튜브채널에는 PC버전 출시를 알리는 영상과 공지사항의 링크를 포함한 글이 함께
	게시됐다.
	<br> 이번 PC버전은 한국화되어 출시되며 글로벌 게임 플랫폼 스팀을 통해 판매된다.
	<br> 또한 공식홈페이지에서 ‘몬스터헌터’를 이용하기 위한 PC 권장 사양과 최소 사양도 함께 공개했다.
	<br>
	<table border="1" width="300px" height="80px">
		<tr>
			<td width="170px"><span id="cost"><img
					src="L20180710.99099004401i2.jpg"></span></td>
		</tr>
	</table>
	PS4에서 ‘몬스터헌터 월드’를 즐기던 전세계 유저들은 PC버전 공개에 환호를 보냈고, 한국에서도 실시간 검색어에 오르는 등
	인기를 입증했다.
    <br>
    <%
    if((n_uname!=null)&&(n_usercomt!=null)){
    	out.print("작성자 : "+n_uname);
    	out.print("<br>");
    	out.print("댓글 내용" + n_usercomt+"<br>");
    }
    %>
      <div id="d_comt">
<input type="button" id="btn_send" value="댓글작성">         
     </div>
     <div id="d_reply"></div>
</body>
</html>