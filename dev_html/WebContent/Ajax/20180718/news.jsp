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
        alert("newsInsertȣ�� ����");
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
	<h1>���������� ���塯 PC�� ��� ���� ���� �������� 8�� 10�ϡ������?</h1>
	<br>


	<table border="1" width="300px" height="80px">
		<tr>
			<td width="170px"><span id="cost"><img
					src="L20180710.99099004401i1.jpg"></span></td>
		</tr>
	</table>

	10�� ���� 1��(�ѱ��ð�) ���������� ���塯 ��Ʃ��ä�ο��� PC���� ��ø� �˸��� ����� ���������� ��ũ�� ������ ���� �Բ�
	�Խõƴ�.
	<br> �̹� PC������ �ѱ�ȭ�Ǿ� ��õǸ� �۷ι� ���� �÷��� ������ ���� �Ǹŵȴ�.
	<br> ���� ����Ȩ���������� ���������͡��� �̿��ϱ� ���� PC ���� ���� �ּ� ��絵 �Բ� �����ߴ�.
	<br>
	<table border="1" width="300px" height="80px">
		<tr>
			<td width="170px"><span id="cost"><img
					src="L20180710.99099004401i2.jpg"></span></td>
		</tr>
	</table>
	PS4���� ���������� ���塯�� ���� ������ �������� PC���� ������ ȯȣ�� ���°�, �ѱ������� �ǽð� �˻�� ������ ��
	�α⸦ �����ߴ�.
    <br>
    <%
    if((n_uname!=null)&&(n_usercomt!=null)){
    	out.print("�ۼ��� : "+n_uname);
    	out.print("<br>");
    	out.print("��� ����" + n_usercomt+"<br>");
    }
    %>
      <div id="d_comt">
<input type="button" id="btn_send" value="����ۼ�">         
     </div>
     <div id="d_reply"></div>
</body>
</html>