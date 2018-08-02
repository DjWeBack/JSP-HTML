package com.google;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public class StoreDAO {
	final String _URL = "jdbc:oracle:thin:@192.168.0.221:1521:orcl11";
	final String _USER = "king";
	final String _PW = "1111";
	Connection 	con 		= 	null;
	public Connection getConnetion() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//클래스를 메모리에 로딩 클래스 이름을 못찾으면 어떡하지?
			con = DriverManager.getConnection(_URL, _USER, _PW);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		
		return con;
	}
	public List<FSMenuVO> getfoodInfoList(FSMenuVO fsvo){
		List<FSMenuVO> fslist = null;
		StringBuilder sql = new StringBuilder();
		sql.append("Select fstore.fs_name," + 
				"fstore.fs_latitude," + 
				"fstore.fs_longitude," + 
				"fstore.fs_size," + 
				"fstore.fs_opentime," + 
				"fstore.fs_closetime," + 
				"fstore.fs_picture," + 
				"fstore.fs_juso," + 
				"fmenu.fsm_name," + 
				"fmenu.fsm_price" + 
				"from fs_menu fmenu, food_store fstore where fmenu.fs_code = fstore.fs_code");
		return fslist;
	}
}
