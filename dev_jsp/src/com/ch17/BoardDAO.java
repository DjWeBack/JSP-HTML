package com.ch17;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;


public class BoardDAO {
	Logger logger = Logger.getLogger(BoardDAO.class);
	/**************************************************************
	 * @sql : select * from board
	 * @param pMap
	 * @return
	 **************************************************************/
	public List<Map<String, Object>> getBoardList(Map<String, Object> pMap){
		List<Map<String, Object>> board = new ArrayList<Map<String, Object>>();
		logger.info("getBoardList ȣ�� ����");
		return board;

	}
	public int boardInsert(Map<String, Object> pMap){
		logger.info("boardInsert ȣ�� ����");
		int result = 0;

		return result;

	}
	public int boardUpdate(Map<String, Object> pMap){

		logger.info("boardUpdate ȣ�� ����");
		int result = 0;

		return result;

	}	public int boardDelete(Map<String, Object> pMap){
		logger.info("boardDelete ȣ�� ����");
		int result = 0;

		return result;

	}
}
