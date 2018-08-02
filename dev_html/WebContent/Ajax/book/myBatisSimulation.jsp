<%@page import="com.util.deptDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.Map, java.util.HashMap" %>    
<%@ page import="java.util.List" %>      
<jsp:useBean id="deptDao" scope="request" class="com.mybatis.maps.DeptDao"/>    
<%
	Map<String, Object> pMap = new HashMap<String, Object>();
	String msg = deptDao.proc_emp_sal_update(pMap);
	if(msg!=null){
		out.print("msg : "+msg);		
	}
%>