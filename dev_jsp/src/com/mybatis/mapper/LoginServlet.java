package com.mybatis.mapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import sun.security.krb5.internal.PAData.SaltAndParams;
@WebServlet(urlPatterns="/login6.do")
public class LoginServlet extends HttpServlet{
	Logger logger = Logger.getLogger(LoginServlet.class); 
	LoginDAO ldao = new LoginDAO();
	LoginLogic logic = new LoginLogic();
	List<Map<String, Object>> mem_prof = null;
	Map<String,Object> u_prof = new HashMap<String,Object>();
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doService(req, res);

	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doService(req, res);
	}
	public void doService(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String u_id = req.getParameter("mem_id"); //웹에서 사용자가 입력한 ID값 
		String u_pw = req.getParameter("mem_pw"); //웹에서 사용자가 입력한 PW값
		String u_name= req.getParameter("a_mem_name");
		String u_aid = req.getParameter("a_mem_id"); 
		String u_apw = req.getParameter("a_mem_pw");
		String command = req.getParameter("command"); //기능 버튼(로그인,회원가입,아이디찾기,PW찾기 등등.)
	
		
		/*u_prof.put("mem_id", u_id);
		u_prof.put("mem_pw", u_pw);*/
		
		//업무별로 나누어서 처리 - 업무담당자가 업무에 대한 선택
		if("login".equals(command)) {
			logic.logicpross(u_id, u_pw);
			logger.info("로그인 업무 요청 성공");
			//mem_prof = ldao.getMemberList(u_prof); //u_prof의 정보를 넘겨서 처리된 결과를 mem_prof에 담음.
			//String uname = (String)mem_prof.get(0).get("mem_id"); //mem_prof에 담긴 정보(이름)을 uname으로 보냄.
			/*logger.info("로그인 성공!!!! User Name : "+ uname);
			System.out.println(uname);*/
		}
		else if("ok".equals(command)) {
			logger.info("정보넘어옴 확인.");
			logic.insertpross(u_aid, u_apw, u_name);
			System.out.println("정보 넘어옴");
			System.out.println("입력 ID : "+u_aid);
			System.out.println("입력 PW : "+u_apw);
			System.out.println("입력 name : "+u_name);
		
		req.getRequestDispatcher("/ch6/LoginForm.jsp").forward(req, res);
		

		}
		//else if() {}*/
		
	}
}
