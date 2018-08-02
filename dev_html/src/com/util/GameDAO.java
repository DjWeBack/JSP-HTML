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
	//조회처리 - 메소드 선언 - getEmpList(?):?
	public List<GameVO> getGameList(String word){
		List<GameVO> gameList = new ArrayList<GameVO>();
		StringBuilder sql = new StringBuilder();//StringBuffer
		sql.append("select g_no, g_name, g_img, g_com from gamelist WHERE g_name like "+"'"+word+"'"+"||'%'");
		System.out.println("select g_no, g_name, g_img, g_com from gamelist WHERE g_name like "+"'"+word+"'"+"||'%'");
		//DB연동은 오라클 서버에 접속하는 것이므로 예외처리 필수임.
		try {
			//자바에서 제공하는 인터페이스들 중 메소드 호출을 통해 객체주입되는 경우도 많음.
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			//커서가 맨 앞에 있다
			//System.out.println(rs.isFirst());
			//커서가 맨 뒤에 있다.
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


