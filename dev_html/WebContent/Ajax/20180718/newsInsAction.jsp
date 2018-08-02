<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import="java.util.Map, java.util.HashMap" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String username = request.getParameter("tb_name");
String usercomt = request.getParameter("tb_comt");

Map<String, Object> rMap = new HashMap<String, Object>();
rMap.put("tb_name", username);
rMap.put("tb_comt", usercomt);
response.sendRedirect("news.jsp?tb_name="+username+"");
%>
