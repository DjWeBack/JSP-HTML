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
		BoardLogic bLogic = new BoardLogic();//스프링에서는 이렇게 직접 인스턴스화 하지 않습니다.
		//조회 요청이 기능이 달라서 응답페이지가 다를 경우에는 분기한다.		
		if("getBoardList".equals(gubun)) {
			logger.info("글목록 조회 호출 성공");
			System.out.print("글목록 호출 성공");
			String cb_type = req.getParameter("cb_type");
			String sb_keyword = req.getParameter("sb_keyword");
			//조건검색에 필요한 값 - 제목|작성자|내용
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
			logger.info("글쓰기 호출 성공");
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
			af.setRedirect(false); //값을 유지한채 페이지를 보낼필요가 없으므로 샌드리다이렉트로 페이지 출력
		}
		
	

	return af;
}

}
