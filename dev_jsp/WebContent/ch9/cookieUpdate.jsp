<%@page import="org.apache.jasper.tagplugins.jstl.core.Remove"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		Cookie[] cs = request.getCookies();

		String result = request.getParameter("result");
		System.out.print(result);
		 if (result.equals("up")) {
			for (int i = 0; i < cs.length; i++) {
				out.print(cs[i].getValue());
				out.print("<br>");
				if (cs[i] != null) {
					cs[i].setValue("weback" + i);
					response.addCookie(cs[i]);
				}
			}
		}
	
			 else {
				 for (int i = 0; i < cs.length; i++){
					if (cs[i] != null) {
						cs[i].setMaxAge(0);
						response.addCookie(cs[i]);
					}
				 }
				}
		 	%>
</body>
</html>