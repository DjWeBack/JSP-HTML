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
			pMap.put("option", req.getParameter("option"));//��� ���� ��� (��� �߰�, ����, ����, ��ȸ)
			pMap.put("gubun", req.getParameter("gubun")); //����� ���� ����� ���� 
			try {
				pojoctrl.execute(req, res, pMap);	
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.toString());
			}
		}
		else if("/pojo/cstom.back".equals(command)) {
			pMap.put("option", req.getParameter("option"));//���� ���� ��� (��� �߰�, ����, ����, ��ȸ)
			pMap.put("gubun", req.getParameter("gubun")); //���翡 ���� ����� ���� 
			try {
				pojoctrl.execute(req, res, pMap);	//���翡 ���� ����� ����
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.toString());
			}
		}
		else if("/pojo/sal.back".equals(command)) {
			pMap.put("option", req.getParameter("option"));//�޿� ���� ��� (�޿���ȸ, �޿� �λ�, )
			pMap.put("gubun", req.getParameter("gubun")); //�޿��� ���� ����� ���� 
			try {
				pojoctrl.execute(req, res, pMap);	//�޿��� ���� ����� ����
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.toString());
			}
			
		}
		/*
		 * �������� : ���� Ŭ���� ������ ����� �߰��ɶ� ���� Controller ��� �����ϴ� ������ ����.
		 * (PojoController�� ������ �ƴϴ� - ����������Ŭ ������ ������ �ؾߵȴ�.)
		 * ���a)�������� �Ķ���ͷ� ������
		 * ���b)execute�޼ҵ带 �����ε��Ͽ� �Ű�����(�Ķ����)�� ������.
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
