<%@ page language="java" contentType="text/xml; charset=EUC-KR"	pageEncoding="EUC-KR"%>
<%@ page import="java.util.List, java.util.Map, java.util.ArrayList"%>
<%@ page import="java.util.HashMap"%>
<%@ page trimDirectiveWhitespaces="true"%><%-- json�����̳� xml�������� �������� --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	List<Map<String, Object>> deptlist = new ArrayList<Map<String, Object>>();

	Map<String, Object> rmap = new HashMap<String, Object>();
	rmap.put("deptno", 10);
	rmap.put("dname", "����");
	rmap.put("loc", "����");
	deptlist.add(rmap);
	rmap = new HashMap<String, Object>();
	rmap.put("deptno", 20);
	rmap.put("dname", "�ѹ�");
	rmap.put("loc", "��õ");
	deptlist.add(rmap);
	rmap = new HashMap<String, Object>();
	rmap.put("deptno", 30);
	rmap.put("dname", "�λ�");
	rmap.put("loc", "����");
	deptlist.add(rmap);
	/* 	out.print(deptlist); */

	out.println("<dept>");
	/***********
	 *XML��ȯ
	 *mimdŸ���� �ݵ�� xml�� ��ȯ�ؾߵ�.
	 ***********/
	for (int i = 0; i < deptlist.size(); i++) {
		out.println("<deptlist>");
		out.println("<deptno>" + deptlist.get(i).get("deptno") + "</deptno>");
		out.println("<dname>" + deptlist.get(i).get("dname") + "</dname>");
		out.println("<loc>" + deptlist.get(i).get("loc") + "</loc>");
		out.println("</deptlist>");
	}
	out.println("</dept>");
%>
