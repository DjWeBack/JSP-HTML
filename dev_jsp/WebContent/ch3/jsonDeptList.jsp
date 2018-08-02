<%@ page language="java" contentType="text/html; charset=EUC-KR"	pageEncoding="EUC-KR"%>
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
out.print(deptlist); 

%>
