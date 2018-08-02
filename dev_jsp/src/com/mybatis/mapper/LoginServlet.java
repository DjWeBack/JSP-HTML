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
		String u_id = req.getParameter("mem_id"); //������ ����ڰ� �Է��� ID�� 
		String u_pw = req.getParameter("mem_pw"); //������ ����ڰ� �Է��� PW��
		String command = req.getParameter("command"); //��� ��ư(�α���,ȸ������,���̵�ã��,PWã�� ���.)
		
		/*u_prof.put("mem_id", u_id);
		u_prof.put("mem_pw", u_pw);*/
		
		//�������� ����� ó�� - ��������ڰ� ������ ���� ����
		if("login".equals(command)) {
			logic.logicpross(u_id, u_pw);
			logger.info("�α��� ���� ��û ����");
			//mem_prof = ldao.getMemberList(u_prof); //u_prof�� ������ �Ѱܼ� ó���� ����� mem_prof�� ����.
			//String uname = (String)mem_prof.get(0).get("mem_id"); //mem_prof�� ��� ����(�̸�)�� uname���� ����.
			/*logger.info("�α��� ����!!!! User Name : "+ uname);
			System.out.println(uname);*/
		}
		/*else if() {}
		else if() {}*/
		
	}
}