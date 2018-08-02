package com.ch17;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/*************************************
 * ������ �Խ��� ������ ���� ������ ���� Ŭ������ �Ϻ��̴�.
 * ������ �� Ŭ�������� ��ȸ, �Է�, ����, ���� ����� ó���Ǳ⸦ ���Ѵ�
 * �� ������ �����̿��� �����ϱ�� �Ͽ���.
 * �����̴� �� 4���� ����ó���� ���� �޼ҵ带 ��� ������ �����ؾ� �ұ�?
 * 
 *
 *************************************/

public class BoardServlet extends HttpServlet{
	Logger logger = Logger.getLogger(BoardServlet.class);
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//http://127.0.0.1:8080/dev_jsp/ch17/crud.do?command=select or insert or update or delete
		logger.info("doGet ȣ�� ����");
		String command = req.getParameter("command");
		BoardDAO dao = new BoardDAO();
		//�Խñ� ��� ��ȸ�ϱ�
		if("select".equals(command)) {logger.info("select ȣ�� ����");}
		//�� ����ϱ�
		else if("insert".equals(command)) {logger.info("insert ȣ�� ����");}
		//�� �����ϱ�
		else if("update".equals(command)) {logger.info("update ȣ�� ����");}
		//�� �����ϱ�
		else if("delete".equals(command)) {logger.info("delete ȣ�� ����");}
		}
		
	}

