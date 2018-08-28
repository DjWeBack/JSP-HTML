package com.mvc.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.pojo.Action;
import com.pojo.ActionForward;
import com.util.HashMapBinder;

public class BoardController implements Action {
	Logger logger = Logger.getLogger(BoardController.class);
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ActionForward af = new ActionForward();
		String path = null;
		String gubun = req.getParameter("gubun");// URL- mvcBoard.bd?gubun=getBoardList
		BoardLogic bLogic = new BoardLogic();//������������ �̷��� ���� �ν��Ͻ�ȭ ���� �ʽ��ϴ�.
		//��ȸ ��û�� ����� �޶� ������������ �ٸ� ��쿡�� �б��Ѵ�.		
		if("getBoardList".equals(gubun)) {
			logger.info("�۸�� ��ȸ ȣ�� ����");
			System.out.print("�۸�� ȣ�� ����");
			String cb_type = req.getParameter("cb_type");
			String sb_keyword = req.getParameter("sb_keyword");
			//���ǰ˻��� �ʿ��� �� - ����|�ۼ���|����
			Map<String,Object> pMap = new HashMap<String,Object>();
			pMap.put("cb_type",cb_type);
			pMap.put("sb_keyword",sb_keyword);
			logger.info(cb_type+", "+sb_keyword);
			List<Map<String,Object>> getBoardList = null;
			getBoardList = bLogic.getBoardList(pMap);
			req.setAttribute("getBoardList", getBoardList);
			path = "jsonBoardList.jsp";
			af.setPath(path);
			af.setRedirect(true);
		}

		return af;
	}

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res, Map<String, Object> pMap)
			throws Exception {
		String path = null;
		ActionForward af = new ActionForward();
		// TODO Auto-generated method stub
		String gubun = req.getAttribute("gubun").toString(); //url - /mvcBoard/mvcBoard.bd?gubun=boardInsert
		BoardLogic bLogic = new BoardLogic();
		int result = 0;
		if("BoardInsert".equals(gubun)) {
			logger.info("�۾��� ȣ�� ����");
			pMap = new HashMap<String,Object>();
			String in_name = req.getParameter("in_name");
			String in_title = req.getParameter("in_title");
			String in_content = req.getParameter("in_content");
			String in_pwd = req.getParameter("in_pwd");
			pMap.put("in_name", in_name);
			pMap.put("in_title", in_title);
			pMap.put("in_content", in_content);
			pMap.put("in_pwd", in_pwd);
			logger.info(in_name+", "+in_title);
			
			result = bLogic.BoardInsert(pMap);
			req.setAttribute("BoardInsert", result);
			
			if(result==1) {
				path = "boardSuccess.jsp";
			}
			else {
				path = "boardFail.jsp";
			}
			af.setPath(path);
			af.setRedirect(false); //���� ������ä �������� �����ʿ䰡 �����Ƿ� ���帮���̷�Ʈ�� ������ ���
		}
		
	

	return af;
}

}
