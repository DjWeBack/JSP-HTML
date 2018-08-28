package com.mvc.board;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

public class BoardLogic {
	Logger logger = Logger.getLogger(BoardLogic.class);
	SqlBoardDao bDao = new SqlBoardDao();
	public List<Map<String, Object>> getBoardList(Map<String, Object> pMap){
		logger.info("getBoardList호출 성공");
		List<Map<String, Object>> getBoardList = null;
		getBoardList=bDao.getBoardList(pMap);
		return getBoardList;
	}
	public int BoardInsert(Map<String, Object> pMap){
		int sresult = 0;
		int mresult = 0;
		int result = 0;//2면 두테이블에 모두 삽입. 1이면 마스터에만 삽입

		logger.info("boardInsert호출 성공");
		List<Map<String, Object>> getBoardList = null;
		mresult = bDao.boardMInsert(pMap);
		if(pMap.containsKey("b_no")) {
			bDao.stepUpdate(pMap);
			pMap.put("b_pos", String.valueOf(Integer.parseInt(pMap.get("b_pos").toString())+1));
			pMap.put("b_step", String.valueOf(Integer.parseInt(pMap.get("b_step").toString())+1));
		}
		//새글일땐 b_pos와 b_step는 0
		else if(!pMap.containsKey("b_no")) {
			int b_group = bDao.getGroup();
			pMap.put("b_group", b_group);
			pMap.put("b_step", 0);
			pMap.put("b_pos", 0);
		}
		if(pMap.get("b_file")!=null) {
		sresult = bDao.boardSInsert(pMap);
		}
		result = mresult+sresult;
		return result;
	}
	
}
