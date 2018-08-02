package com.ch17;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.istack.internal.logging.Logger;
import com.util.HangulConversion;
@WebServlet(urlPatterns="/hello.weback")
public class HelloServlet extends HttpServlet{
	Logger logger = Logger.getLogger(HelloServlet.class);
	/******************************************
	 * ȭ��ܿ��� post������� ��û�ϸ� doPost�޼ҵ尡 ȣ���
	 * @req - ��Ĺ������ ������ ���� ��û�� �Ͼ�� ��û��ü�� ��������.
	 * @res - ��Ĺ������ ������ ���� ��û�� �Ͼ�� ���䰴ü�� ��������.
	 * doPost�� �޼ҵ� �������̵��� �޼ҵ� �̹Ƿ� ���� Ÿ���� �ٲ� �� ����.
	 * doPost�� URL��û���δ� ����� ȣ�� �� �� ���� - ����ؿ�
	 * �ذ��� : �ڹٽ�ũ��Ʈ �ڵ忡���� ȣ�� �� �� ����.
	 * �������� �̵��ϴ� �޼ҵ�� �Լ� ������ �� ��.
	 ******************************************/
//	@Override
//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
//		res.sendRedirect("/dev_jsp/ch17/end.jsp");
//	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		String name = HangulConversion.toKor(req.getParameter("tb_name"));
		logger.info("����ڰ� �Է��� �̸� : " + name);
		logger.info("====================================");
		logger.info("doPostȣ�� ����");
//		req.setAttribute("name", name);
//		res.sendRedirect("/dev_jsp/ch17/end.jsp");
		 ServletContext context =getServletContext();
	        RequestDispatcher dispatcher = context.getRequestDispatcher("/ch17/end.jsp"); //�ѱ� ������ �ּ�
	        dispatcher.forward(req, res);




		
	
    




		
	}

}
