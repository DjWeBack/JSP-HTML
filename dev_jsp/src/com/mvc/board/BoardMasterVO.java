package com.mvc.board;

public class BoardMasterVO {
	private int B_NO;
	private String B_TITLE; 
	private String B_NAME;
	private String B_CONTENT;
	private String B_DATE;
	private int B_HIT;
	private int B_GROUP;
	private int B_POS;
	private int B_STEP;
	private String B_PWD;
	private BoardSubVO bSubVO = null;
	
	public int getB_NO() {
		return B_NO;
	}
	public void setB_NO(int b_NO) {
		B_NO = b_NO;
	}
	public String getB_TITLE() {
		return B_TITLE;
	}
	public void setB_TITLE(String b_TITLE) {
		B_TITLE = b_TITLE;
	}
	public String getB_NAME() {
		return B_NAME;
	}
	public void setB_NAME(String b_NAME) {
		B_NAME = b_NAME;
	}
	public String getB_CONTENT() {
		return B_CONTENT;
	}
	public void setB_CONTENT(String b_CONTENT) {
		B_CONTENT = b_CONTENT;
	}
	public String getB_DATE() {
		return B_DATE;
	}
	public void setB_DATE(String b_DATE) {
		B_DATE = b_DATE;
	}
	public int getB_HIT() {
		return B_HIT;
	}
	public void setB_HIT(int b_HIT) {
		B_HIT = b_HIT;
	}
	public int getB_GROUP() {
		return B_GROUP;
	}
	public void setB_GROUP(int b_GROUP) {
		B_GROUP = b_GROUP;
	}
	public int getB_POS() {
		return B_POS;
	}
	public void setB_POS(int b_POS) {
		B_POS = b_POS;
	}
	public int getB_STEP() {
		return B_STEP;
	}
	public void setB_STEP(int b_STEP) {
		B_STEP = b_STEP;
	}
	public BoardSubVO getbSubVO() {
		return bSubVO;
	}
	public void setbSubVO(BoardSubVO bSubVO) {
		this.bSubVO = bSubVO;
	}
	public String getB_PWD() {
		return B_PWD;
	}
	public void setB_PWD(String b_PWD) {
		B_PWD = b_PWD;
	}
	
}
