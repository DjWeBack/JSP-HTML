<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.util.List, java.util.Map, java.util.ArrayList"%>
<%@ page import="java.util.HashMap"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String imgName = request.getParameter("picture");
	String picDetail = null;
	
	List<Map<String, Object>> piclist = new ArrayList<Map<String, Object>>();
	Map<String, Object> detailMap = new HashMap<String, Object>();
	detailMap.put("monsterhunter.jpg", "����");
	detailMap.put("tales.png", "����������");
	detailMap.put("tekken7.jpg","ö��");
	detailMap.put("wow.jpg", "��������ũ����Ʈ");
	piclist.add(detailMap);
	/* Iterator<Map<String, Object>> it = piclist.iterator();//���ͷ����� ��� */
	Object keys[] = piclist.get(0).keySet().toArray();
		for (int i = 0; i < keys.length; i++) {
		String val = (String)keys[i];
		if (val.equals(imgName)) {
			picDetail = (String) piclist.get(0).get(keys[i]);
		}

	}
	out.print("picDetail"+picDetail);
%>
<table width="350px" height="300px" border="1" bordercolor="red">
	<tr>
		<td height="240px"><img src="../picture/<%=imgName%>"
			width="300px" height="240px"></td>
	</tr>
	<tr>
		<td height="60px"><%=picDetail%></td>
</table>
