package com.Project;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.oracle.jdbc.DBConnection;

public class MemberStart {
	final String _URL = "jdbc:oracle:thin:@192.168.0.218:1521:orcl11";
	final String _USER = "scott";
	final String _PW = "tiger";
	Connection 	con 		= 	null;
	CallableStatement cstmt = null;
	PreparedStatement pstmt = null;
	//	Statement cstmt = null;
	ResultSet rs = null;
	DBConnection dbCon = new DBConnection();
	public Connection getConnetion() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//Ŭ������ �޸𸮿� �ε� Ŭ���� �̸��� ��ã���� �����?
			con = DriverManager.getConnection(_URL, _USER, _PW);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		
		return con;
	}
}
