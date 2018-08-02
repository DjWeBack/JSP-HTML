package com.util;

import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.vo.EmpVO;

public class GameDAO {
	DBConnectionMgr 	dbMgr = DBConnectionMgr.getInstance();
	Connection 			con   = null;
	PreparedStatement 	pstmt = null;
	ResultSet			rs	  = null;
	//��ȸó�� - �޼ҵ� ���� - getEmpList(?):?
	public List<GameVO> getGameList(String word){
		List<GameVO> gameList = new ArrayList<GameVO>();
		StringBuilder sql = new StringBuilder();//StringBuffer
		sql.append("select g_no, g_name, g_img, g_com from gamelist WHERE g_name like "+"'"+word+"'"+"||'%'");
		System.out.println("select g_no, g_name, g_img, g_com from gamelist WHERE g_name like "+"'"+word+"'"+"||'%'");
		//DB������ ����Ŭ ������ �����ϴ� ���̹Ƿ� ����ó�� �ʼ���.
		try {
			//�ڹٿ��� �����ϴ� �������̽��� �� �޼ҵ� ȣ���� ���� ��ü���ԵǴ� ��쵵 ����.
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			//Ŀ���� �� �տ� �ִ�
			//System.out.println(rs.isFirst());
			//Ŀ���� �� �ڿ� �ִ�.
			//System.out.println(rs.isLast());
			GameVO gvo = null;
			while(rs.next()) {
			//while(rs.previous()) {	
		    //while(rs.absolute(4)) {
				gvo = new GameVO();
				gvo.setG_NO(rs.getInt("g_no"));
				gvo.setG_NAME(rs.getString("g_name"));
				gvo.setG_COM(rs.getString("g_com"));
				gvo.setG_IMG(rs.getString("g_img"));
				gameList.add(gvo);
			}
		} catch (SQLException se) {
			System.out.println("[[query]]"+sql.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return gameList;
	}
	
}


