<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
       <%@ page import="java.util.List, java.util.Map, java.util.ArrayList"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="com.util.DBConnectionMgr" %>
<%@ page import="java.util.List" %>
<%@ page import="com.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
GameDAO gdao = new GameDAO();
String word = request.getParameter("word");
System.out.println("word : " + word);
List<GameVO> gnamelist = gdao.getGameList(word);
request.setAttribute("gamelist", gnamelist); 


RequestDispatcher view = request.getRequestDispatcher("searchWordResult.jsp");
view.forward(request, response);


%>