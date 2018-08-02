<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="com.util.HangulConversion"%>
<%
	String n_title = request.getParameter("n_title");
	String n_content = request.getParameter("n_content");
	out.print("파라미터로 넘어온 제목:" + n_title + ", 내용:" + n_content);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>뉴스 목록 - Ajax기술 적용해 보기[댓글처리관련]</title>
<!-- $ is defined  -->
<script type="text/javascript" src="../../js/jquery-1.12.0.js"></script>
<script type="text/javascript">
	function newsInsert() {
		alert("newsInsert호출 성공");
		$("#f_newsIns").attr("method", "get");
		$("#f_newsIns").attr("action", "newsInsAction.jsp");
		$("#f_newsIns").submit();
	}
	var watch;
   	var isStart = false;
   	
	   var i=0;
	    function autoReload(){
	        $("#d_news").text("뉴스내용...."+i)
	        i=i+1;
	        if(i==1500){
	        	stop();
	        }
	    }
		
		
	    function start(){
	    	isStart = true;
	    	$("input[value='중지']").focus();
	        watch=setInterval(autoReload,1);
	        //$("#d_news2").hide(100);
	     
	        
	    }
	    function stop(){
	    	isStart = false;
	        setTimeout(function(){
	            clearInterval(watch);
	            i = 0;
	        });
	    }
	    
	 
</script>
</head>
<body>
	<script type="text/javascript">
		$(document).ready(function() {
			$("input[value='중지']").hover(function(event) {
				if(isStart==true)
					$("#d_news2").hide();
			}, function(event) {
				if(isStart==true)
					$("#d_news2").show();	
			});
			
			
			$("#btn_reple").click(function() {
				//insert here - ajax코드 추가하기
				$.ajax({
					//newsAction.jsp의 역할은 머지? - 
					//답 ==> d_reple안에 들어갈 화면이 있어야 함.	- html태그야 아니면 자바코드야
					url : "./newsAction.jsp"//"처리페이지 url-XXX.jsp or /hello.dk"
					,
					method : "GET",
					success : function(data) {//여기서 data의 역할은 머니?
						//$("#d_reple").html("<b>댓글쓰기 화면</b>");
						$("#d_btnreple").hide();
						$("#d_reple").html(data);
					},
					error : function(xhrObject) {
						alert("error : " + xhrObject.responseText);
					}
				});
			});
			
		});
		function login() {
			var id = $("#mem_id").val();
			var pw = $("#mem_pw").val();
			var param = "mem_id=" + id + "&mem_pw" + pw;
			$.ajax({
				method : "POST",
				url : "로그인페이지",
				data : param,
				success : function(result) {

				},
				error : function(xhrObject) {
					alert("error:" + xhrObject.responseText);
				}

			});

		}
	</script>
	<table width="800px" height="600px">
		<!-- top 영역 시작 -->
		<tr>
			<td width="100%" height="80px">
				<table border="1" borderColor="orange" width="100%" height="100%">
					<tr>
						<td align="center">
						 <div id="d_news"> 
						  연합뉴스 : <br><input type="button" value="시작" onclick="start()">
            </div>
            <div id="d_news2">
            <br><input type="button" value="중지" onclick="stop()">
            </div>
						</td>
					</tr>
				</table>
			</td>
		</tr>
		<!-- top 영역  끝   -->
		<!-- 뉴스 영역 시작 -->
		<tr>
			<td width="100%" height="480px">
				<table border="1" borderColor="green" width="100%" height="100%">
					<tr>
					<td>
						<!-- 로그인창 생성 테이블 -->
						<table border="1" bordercolor="blue" width="100%">
							<tr>
								<td><input type="text" id="mim_id" value="아이디" size="10"
									onclick="javascript:document">
								<td rowspan="2"><input type="button" value="확인"
									onclick="login()"></td>
							</tr>
							<td><input type="text" id="mim_pw" value="패스워드" size="10"
								onclick="javascript:document"></td>
								
						</table>
						</td>
						
						<td align="center"><h1>‘몬스터헌터 월드’ PC판 출시 일정 공개 스팀에서 8월 10일…사양은?</h1>
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

							<!-- 작성된 댓글 내용이 요기에 출력되게 하고 싶어요..... --> <%
 	//댓글내용이 있나요? - 있을 때 처리해 봐요
 	if ((n_title != null) && (n_content != null)) {
 		out.print("댓글 제목:" + n_title);
 		out.print("<br>");
 		out.print("댓글 내용:" + n_content + "<br>");
 	}
 %>
							<div id="d_btnreple">
								<input id="btn_reple" type="button" value="댓글쓰기">
							</div>
							<div id="d_reple">요기에 댓글쓰기화면(jsp내용)</div>

						</td>
					</tr>
				</table>
			</td>
		</tr>
		<!-- 뉴스 영역  끝   -->
		<!-- bottom 영역 시작 -->
		<tr>
			<td width="100%" height="40px">
				<table border="1" borderColor="brown" width="100%" height="100%">
					<tr>
						<td align="center">회사소개 | 인사말 | 정보책임자(변화없이 고정-ajax미적용부분)</td>
					</tr>
				</table>
			</td>
		</tr>
		<!-- bottom 영역  끝   -->
	</table>
</body>
</html>