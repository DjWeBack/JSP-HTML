package com.ChatProject;

import java.sql.Connection;
import java.sql.DriverManager;

public class FriendDB {

	
	final String _URL = "jdbc:oracle:thin:@192.168.0.218:1521:orcl11";
	final String _USER = "scott";
	final String _PW = "tiger";
	Connection 	con 		= 	null;
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
	public static void main(String[] args) {
		FriendDB fdbcon = new FriendDB();
		Connection con = fdbcon.getConnetion();
		System.out.println("con : "+con);
			}
	

}
