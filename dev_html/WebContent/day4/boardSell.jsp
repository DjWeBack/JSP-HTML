<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�ǸŰ���</title>
<link rel="stylesheet" type="text/css" href="../css/boards.css">
<script type="text/javascript" src="../js/jquery-1.12.0.js"></script>
<script type="text/javascript">
	function account() {
		//���� �Ǹŷ� �о����
		//���� �Ǹŷ� �����͸� ���ΰ� �ִ� span�±� ���� ���
		var el_boardsold = document.getElementByid("board_sold");
		//�Һ��ڰ� �����͸� ���ΰ� �ִ� span�±� ���� ���
		var el_price = document.getElementById("price");
		//���Ű� �����͸� ���ΰ� �ִ� span�±� ���� ���
		var el_cost = document.getElementById("cost");
		var boardsold = getText(e1_boardsold);
		var price = getText(e1_price);
		var cost = getText(e1_cost);
		//���� �Ѱ��� �����ݾ��� ���
		var cashPerBoard = price - cost;
		//alert("���� �Ǹŷ�:" + boardsold + ", �Һ��ڰ�:" + price + ",���Ű�:" + cost);
		//���� ���� ���� �Ǹŷ�
		replaceText(el_boardsold,15);
		var tot = boardsold*cashPerBoard;
		var el_margin = document.getElementById("d_margin");
		replaceText(el_margin,"�Ѹ����ݾ���"+tot+"�Դϴ�.");
		//alert("�Ѹ����ݾ�:"+tot);
	}
	/*******************************************************************************************************
	* �ؽ�Ʈ ����� ���� ����� �Լ� ����
	* �Ķ���� : �ؽ�Ʈ ��带 ���ΰ� �ִ� span�±��� ������Ʈ ����
	* ���ϰ� : �ش����
	* ��뿹 : replaceText(e1,15);������ 12������ 15���� �����.
	********************************************************************************************************/
	function replaceText(el, text) { //el�� �޾ƿ��� �ڵ�� 
		document.getElementById("id");
		if (el != null) {
			//���� ��忡 �� �ִ� ���� �ʱ�ȭ ��Ų��.
			clearText(el);
			var newNode = document.createTextNode(text);
			el.appendChild(newNode);
		} /////////el�� ���� �ƴϸ�
	} /////////////end of replaceText	

	/**********************************************************************
	 * �ؽ�Ʈ ����� ���� ����� �Լ� ����
	      �Ķ���� : �ؽ�Ʈ ��带 ���ΰ� �ִ� span�±��� ������Ʈ����
	      ���ϰ� : �ش����.
	 *********************************************************************/
	function clearText(e1) {
		document.getElementById("id");
		var text = "";
		if (el != null) {
			if (el.childNode) {
				for (var i = 0; i < el.childNodes.length; i++) {
					var childNode = el.childNodes[i];
					el.removeChild(childNode);
				}
			}
		}
	}
	/************************************************************************************
	*�ؽ�Ʈ ����� ���� �о���� �Լ� ����
	�Ķ����: �ؽ�Ʈ ��带 ���ΰ� �ִ� span�±��� ������Ʈ ����
	���ϰ�: �ؽ�Ʈ ����� ��
	**************************************************************************************/

	function getText(el) { //e1�� �޾ƿ��� �ڵ�� 
		document.getElementById("id");
		alter("e1:" + e1); //e1�� element�� ����
		var text = "";
		if (el != null) {
			if (el.childNodes) {
				for (var i = 0; i < el.childNodes.length; i++) {
					var childNode = el.childNodes[i];
					//�� �ؽ�Ʈ ����?
					if (childNode.nodeValue != null) {
						text = text + childNode.nodeValue;
					}
				}
			}
		}

		return text;

	}
</script>
</head>
<body>
	<h2>����ũ ���� �Ǹ���Ȳ</h2>
	<table border="1" width="300px" height="80px">
		<tr>
			<th width="130px">�����Ǹŷ�</th>
			<td width="170px"><span id="board_sold">12</span></td>
		</tr>
		<tr>
			<th width="130px">�Һ��ڰ�</th>
			<td width="170px"><span id="price">3800000</span></td>
		</tr>
		<tr>
			<th width="130px">���Ű�</th>
			<td width="170px"><span id="cost">2500000</span></td>
		</tr>
	</table>
	<br>
	<input type="button" value="������?" onClick="account()" />
	<div id="d_margin">�� �����ݾ��� XXXXXXX�Դϴ�.</div>
</body>
</html>