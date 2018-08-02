<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="../../js/jquery-1.12.0.js"></script>
<style type="text/css">
div#d_detail {
	position: absolute;
}
</style>
<script type="text/javascript">
	function startMethod(imgObj, picture) {
		// alert("마우스오버"+imgObj);
		var param = "picture=" + picture;
		$.ajax({
			method : "POST",
			data : param,
			url : './partPageDetail.jsp'
			,
			success : function(data) {
				$("#d_detail").css("left", imgObj.offset().left + 220 + "px");
				$("#d_detail").css("top", imgObj.offset().top + "px");
				$("#d_detail").html(data);
			},
			error : function(data) {
				$("#d_detail").html("");
			}
		});
		//  /* $("#d_detail").text("onmouseover"); */
		// $("#d_detail").html("<table border='1'><tr> <td>onmouseover</td> </tr> </table>");
		// if(imgObj[0].id=="p1"){

		// 	$("#d_detail").html("<table border='1' borderColor='red'><tr> <td>몬스터헌터 월드 그림설명</td> </tr> </table>");
		// }
		// else if(imgObj[0].id=="p2"){
		// 	$("#d_detail").html("<table border='1' borderColor='red'><tr> <td>테일즈위버(Talesweaver)는 넥슨과 소프트맥스가 소설 룬의 아이들을 원작으로 공동개발한 엠엠오알피지(MMORPG)다. 2003년 6월부터 정식 서비스를 개시한 이후 꾸준히 사랑받고 있다</td> </tr> </table>");
		// }
		// else if(imgObj[0].id=="p3"){
		// 	$("#d_detail").html("<table border='1' borderColor='red'><tr> <td>철권이요 </td> </tr> </table>");
		// }
		// else if(imgObj[0].id=="p4"){
		// 	$("#d_detail").html("<table border='1' borderColor='red'><tr> <td>4번</td> </tr> </table>");
		// }

		/* $("#p1") != document.getElementB....
		$("#p1")[0] 
		var name = $("#p1").attr("id");
		 */

	}

	function clearMethod(imgObj) {
		// alert("마우스아웃");
		$("#d_detail").css("left", imgObj.offset().left + 220 + "px");
		$("#d_detail").css("top", imgObj.offset().top + "px");
		$("#d_detail").html(
				"<table border='1'><tr> <td>지워짐</td> </tr> </table>");
		/*  $("#d_detail").text("지워짐"); */
	}
</script>
</head>
<body>
	<div id="d_detail">상세화면</div>
	<!-- 테두리 -->
	<table border="1" borderColor="blue">
		<tr>
			<td>
				<!-- 카타로그 -->
				<table border="1" borderColor="orange" width="100%" height="100%">
					<tr>
						<td align="center">카타로그</td>
					</tr>
					<!-- 카타로그 끝 -->
				</table> <!-- 사진설명 테이블 -->
				<table border="1" width="450px" height="80px">
					<div id="d_pname">
						<tr>
							<th width="500px">몬스터헌터 : 월드</th>
							<td width="170px"><img id="p1"
								src="../picture/monsterhunter.jpg" height="100px" width="210px"
								onmouseover="startMethod($('#p1'),'monsterhunter.jpg')"
								onmouseout="clearMethod($('#p1'))"></td>
						</tr>
						<tr>
							<th width="130px">테일즈 위버</th>
							<td width="170px"><img id="p2" src="../picture/tales.png"
								height="100px" width="210px"
								onmouseover="startMethod($('#p2'),'tales.png')"
								onmouseout="clearMethod($('#p2'))"></td>
						</tr>
						<tr>
							<th width="130px">철권7</th>
							<td width="170px"><img id="p3" src="../picture/tekken7.jpg"
								height="100px" width="210px"
								onmouseover="startMethod($('#p3'),'tekken7.jpg')"
								onmouseout="clearMethod($('#p3'))"></td>
						</tr>
						<tr>
							<th width="130px">월드오브 워크래프트 : 격전의 아제로스</th>
							<td width="170px"><img id="p4" src="../picture/wow.jpg"
								height="100px" width="210px"
								onmouseover="startMethod($('#p4'),'wow.jpg')"
								onmouseout="clearMethod($('#p4'))"></td>
						</tr>
						<!-- 사진테이블 끝 -->
					</div>
				</table>
			</td>
		</tr>
		<!-- 테두리 테이블 끝 -->
	</table>
</body>
</html>