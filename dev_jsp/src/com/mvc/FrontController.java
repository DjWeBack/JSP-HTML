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
 * 프로젝트에서 클래스를 쪼개는 기준은 어떻게?
 * 업무별로 쪼갠다. - 주문관리, 회원관리, 고객관리
 * 어떤 업무를 태워야 할지를 어떻게 구분하지?
 * req.getRequestURI():String ->
 * req.getContextPath():String -> /dev_jsp
 * 업무별로 분기 - IF문
 * XXX.jsp - 모델1 의심 - 표준서블릿 처리
 * xxx.kos - 모델2 - 사용자정의 서블릿 태우기
 * 
 * xxx.kos정보가 필요함.
 * 깐트롤+T 부모자식관계 확인할때 유용함(캐스팅연산자 사용시)
 * 
 * 
 * FrontController의 역활
 * 1)총지배인 - 총괄매니저 - url공격
 * 2)응답페이지에 대한 호출을 여기서 처리 - 판정
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
		logger.info("service호출 성공");
	String requestURI = req.getRequestURI();
	String contextPath = req.getContextPath();
	String command = requestURI.substring(contextPath.length());
	logger.info("command : "+command);
			//kos를 담당하는 업무 서블릿으로 이동.
	ActionForward afor = new ActionForward();
	
	if("/pojo/getPojolist.kos".equals(command)) {
		//업무 담당하는 서블릿으로 이동
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
	//페이지 처리에대한 판정 sendRedirect | forward
	if(afor.isRedirect()==true) {
		//트루면 센드 리다이렉트
		//펄스면 포워드
		res.sendRedirect(afor.getPath());
			}
	else {
		RequestDispatcher view = req.getRequestDispatcher(afor.getPath());
		view.forward(req, res);
		
	}
	
	}

}
