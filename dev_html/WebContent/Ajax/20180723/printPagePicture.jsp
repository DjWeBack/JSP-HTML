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
		// alert("���콺����"+imgObj);
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

		// 	$("#d_detail").html("<table border='1' borderColor='red'><tr> <td>�������� ���� �׸�����</td> </tr> </table>");
		// }
		// else if(imgObj[0].id=="p2"){
		// 	$("#d_detail").html("<table border='1' borderColor='red'><tr> <td>����������(Talesweaver)�� �ؽ��� ����Ʈ�ƽ��� �Ҽ� ���� ���̵��� �������� ���������� ������������(MMORPG)��. 2003�� 6������ ���� ���񽺸� ������ ���� ������ ����ް� �ִ�</td> </tr> </table>");
		// }
		// else if(imgObj[0].id=="p3"){
		// 	$("#d_detail").html("<table border='1' borderColor='red'><tr> <td>ö���̿� </td> </tr> </table>");
		// }
		// else if(imgObj[0].id=="p4"){
		// 	$("#d_detail").html("<table border='1' borderColor='red'><tr> <td>4��</td> </tr> </table>");
		// }

		/* $("#p1") != document.getElementB....
		$("#p1")[0] 
		var name = $("#p1").attr("id");
		 */

	}

	function clearMethod(imgObj) {
		// alert("���콺�ƿ�");
		$("#d_detail").css("left", imgObj.offset().left + 220 + "px");
		$("#d_detail").css("top", imgObj.offset().top + "px");
		$("#d_detail").html(
				"<table border='1'><tr> <td>������</td> </tr> </table>");
		/*  $("#d_detail").text("������"); */
	}
</script>
</head>
<body>
	<div id="d_detail">��ȭ��</div>
	<!-- �׵θ� -->
	<table border="1" borderColor="blue">
		<tr>
			<td>
				<!-- īŸ�α� -->
				<table border="1" borderColor="orange" width="100%" height="100%">
					<tr>
						<td align="center">īŸ�α�</td>
					</tr>
					<!-- īŸ�α� �� -->
				</table> <!-- �������� ���̺� -->
				<table border="1" width="450px" height="80px">
					<div id="d_pname">
						<tr>
							<th width="500px">�������� : ����</th>
							<td width="170px"><img id="p1"
								src="../picture/monsterhunter.jpg" height="100px" width="210px"
								onmouseover="startMethod($('#p1'),'monsterhunter.jpg')"
								onmouseout="clearMethod($('#p1'))"></td>
						</tr>
						<tr>
							<th width="130px">������ ����</th>
							<td width="170px"><img id="p2" src="../picture/tales.png"
								height="100px" width="210px"
								onmouseover="startMethod($('#p2'),'tales.png')"
								onmouseout="clearMethod($('#p2'))"></td>
						</tr>
						<tr>
							<th width="130px">ö��7</th>
							<td width="170px"><img id="p3" src="../picture/tekken7.jpg"
								height="100px" width="210px"
								onmouseover="startMethod($('#p3'),'tekken7.jpg')"
								onmouseout="clearMethod($('#p3'))"></td>
						</tr>
						<tr>
							<th width="130px">������� ��ũ����Ʈ : ������ �����ν�</th>
							<td width="170px"><img id="p4" src="../picture/wow.jpg"
								height="100px" width="210px"
								onmouseover="startMethod($('#p4'),'wow.jpg')"
								onmouseout="clearMethod($('#p4'))"></td>
						</tr>
						<!-- �������̺� �� -->
					</div>
				</table>
			</td>
		</tr>
		<!-- �׵θ� ���̺� �� -->
	</table>
</body>
</html>