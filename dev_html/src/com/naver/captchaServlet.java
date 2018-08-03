package com.naver;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/cap.dop")
public class captchaServlet extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doService(req, res);
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doService(req, res);
	}
	public void doService(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String cid = req.getParameter("cap_id");
		String ckey= req.getParameter("cap_key");
		APIExamCaptchaNkeyResult nkey = new APIExamCaptchaNkeyResult();
		System.out.println(cid);
		String tnf = nkey.accin(cid,ckey);
		System.out.println(tnf);
		if("true".equals(tnf)) {
			System.out.println("인증 성공");
			req.getRequestDispatcher("/captcha/success.jsp").forward(req, res);
		}
		else {
			System.out.println("실패");
			req.getRequestDispatcher("/captcha/capimg.jsp").forward(req, res);
			
		}
		

		
		
	}
}
