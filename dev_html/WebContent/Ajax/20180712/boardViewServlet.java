package com.ch17;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;
import javax.xml.ws.WebEndpoint;
@WebServlet(urlPatterns="/a1233")

public class boardViewServlet extends HttpServlet {
	
	@Override
 public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
//	 System.out.println("doGetȣ�� ����");
//	  PrintWriter out = res.getWriter();
	  RequestDispatcher rd = req.getRequestDispatcher("/Ajax/20180712/boardViewAjax.jsp");
	  rd.forward(req, res);
//	  out.println("<b>���� <font color='blue' size='20'>html</font>����</b>");
 }

}


