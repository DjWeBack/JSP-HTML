<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.util.List, java.util.Map, java.util.ArrayList"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="com.util.*"%>
<%
	List<GameVO> gamelist = (List<GameVO>) request.getAttribute("gamelist");
%>
<table border="10"  borderColor="pink" style="background-color: #FFD1FF;" >
	<%
		for (int i = 0; i < gamelist.size(); i++) {
	%>
	<tr>
		<td><%=gamelist.get(i).getG_NAME()%></td>
<%-- 		<td><img src="<%=gamelist.get(i).getG_IMG()%>" width="250" height="200"></td>
		<td style="width:250px;"><%=gamelist.get(i).getG_COM()%></td> --%>
	</tr>



	<%
		}
	%>



</table>
<%-- <table>
	<table border="1" borderColor="blue">
		<tr>
			<td><img src="<%=gamelist.get(0).getG_IMG()%>" width="350" height="350"></td>
			<!-- <table bbrder="1" BorderColor="red"> -->
				<td style="width:250px;"><%=gamelist.get(0).getG_COM()%></td>
			<!-- </table> -->
		</tr>

	</table> --%>
