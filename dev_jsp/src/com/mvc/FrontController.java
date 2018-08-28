package com.mvc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.AsyncContext;
import javax.servlet.DispatcherType;
import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpUpgradeHandler;
import javax.servlet.http.Part;

import org.apache.log4j.Logger;
/*
 * ������Ʈ���� Ŭ������ �ɰ��� ������ ���?
 * �������� �ɰ���. - �ֹ�����, ȸ������, ������
 * � ������ �¿��� ������ ��� ��������?
 * req.getRequestURI():String ->
 * req.getContextPath():String -> /dev_jsp
 * �������� �б� - IF��
 * XXX.jsp - ��1 �ǽ� - ǥ�ؼ��� ó��
 * xxx.kos - ��2 - ��������� ���� �¿��
 * 
 * xxx.kos������ �ʿ���.
 * ��Ʈ��+T �θ��ڽİ��� Ȯ���Ҷ� ������(ĳ���ÿ����� ����)
 * 
 * 
 * FrontController�� ��Ȱ
 * 1)�������� - �Ѱ��Ŵ��� - url����
 * 2)������������ ���� ȣ���� ���⼭ ó�� - ����
 * 
 * 
 */
public class FrontController extends HttpServlet {
	Logger logger = Logger.getLogger(FrontController.class);
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doService(req,res);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doService(req,res);
	}
	
	public void doService(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		logger.info("serviceȣ�� ����");
	String requestURI = req.getRequestURI();
	String contextPath = req.getContextPath();
	String command = requestURI.substring(contextPath.length());
	logger.info("command : "+command);
			//kos�� ����ϴ� ���� �������� �̵�.
	ActionForward afor = new ActionForward();
	
	if("/pojo/getPojolist.kos".equals(command)) {
		//���� ����ϴ� �������� �̵�
		afor.setRedirect(true);
		OrderController pojoctrl = new OrderController();
		List<Map<String,Object>> pojolist = null;
		try {
			pojoctrl.execute(req, res);	
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	else if("/pojo/list.kos".equals(command)){
		afor.setRedirect(false);
	}
	//������ ó�������� ���� sendRedirect | forward
	if(afor.isRedirect()==true) {
		//Ʈ��� ���� �����̷�Ʈ
		//�޽��� ������
		res.sendRedirect(afor.getPath());
			}
	else {
		RequestDispatcher view = req.getRequestDispatcher(afor.getPath());
		view.forward(req, res);
		
	}
	
	}

}
