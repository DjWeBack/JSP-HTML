package com.mvc;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doService(req,resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doService(req,resp);
	}
	public void doService(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String reqURI = req.getRequestURI();
		String contextPath = req.getContextPath();
		String command = reqURI.substring(contextPath.length());
		ActionForward forward = new ActionForward();
		pojocontroller pojoctrl = new pojocontroller();
		Map<String, Object> pMap = new HashMap<>();
		if("/pojo/member.back".equals(command)) {
			pMap.put("option", req.getParameter("option"));//멤버 관련 기능 (멤버 추가, 삭제, 수정, 조회)
			pMap.put("gubun", req.getParameter("gubun")); //멤버에 대한 기능을 전송 
			try {
				pojoctrl.execute(req, res, pMap);	
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.toString());
			}
		}
		else if("/pojo/cstom.back".equals(command)) {
			pMap.put("option", req.getParameter("option"));//고객사 관련 기능 (멤버 추가, 삭제, 수정, 조회)
			pMap.put("gubun", req.getParameter("gubun")); //고객사에 대한 기능을 전송 
			try {
				pojoctrl.execute(req, res, pMap);	//고객사에 대한 기능을 전송
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.toString());
			}
		}
		else if("/pojo/sal.back".equals(command)) {
			pMap.put("option", req.getParameter("option"));//급여 관련 기능 (급여조회, 급여 인상, )
			pMap.put("gubun", req.getParameter("gubun")); //급여에 대한 기능을 전송 
			try {
				pojoctrl.execute(req, res, pMap);	//급여에 대한 기능을 전송
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.toString());
			}
			
		}
		/*
		 * 문제제기 : 현재 클래스 구조는 기능이 추가될때 마다 Controller 계속 증가하는 문제가 있음.
		 * (PojoController은 서블릿이 아니다 - 라이프사이클 관리를 개발자 해야된다.)
		 * 방법a)생성자의 파라미터로 보낸다
		 * 방법b)execute메소드를 오버로딩하여 매개변수(파라미터)로 보낸다.
		 * 
		 */
		int result = 0;
		try {
			forward = pojoctrl.execute(req, res,pMap);
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}
}
