<%@ page language="java" contentType="text/xml; charset=EUC-KR"	pageEncoding="EUC-KR"%>
<%@ page import="java.util.List, java.util.Map, java.util.ArrayList"%>
<%@ page import="java.util.HashMap"%>
<%@ page trimDirectiveWhitespaces="true"%><%-- json포멧이나 xml포멧으로 내보낼때 --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	List<Map<String, Object>> deptlist = new ArrayList<Map<String, Object>>();

	Map<String, Object> rmap = new HashMap<String, Object>();
	rmap.put("deptno", 10);
	rmap.put("dname", "영업");
	rmap.put("loc", "서울");
	deptlist.add(rmap);
	rmap = new HashMap<String, Object>();
	rmap.put("deptno", 20);
	rmap.put("dname", "총무");
	rmap.put("loc", "인천");
	deptlist.add(rmap);
	rmap = new HashMap<String, Object>();
	rmap.put("deptno", 30);
	rmap.put("dname", "인사");
	rmap.put("loc", "서울");
	deptlist.add(rmap);
	/* 	out.print(deptlist); */

	out.println("<dept>");
	/***********
	 *XML변환
	 *mimd타입을 반드시 xml로 변환해야됨.
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
