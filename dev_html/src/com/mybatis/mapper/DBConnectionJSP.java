package com.mybatis.mapper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * ��Ŭ������ ���������� �ʿ��� �ڵ带 ���ϴ� Ŭ���� ��.
 * �ܵ����� ����Ǵ� Ŭ������ �ƴ�.
 * main�޼ҵ�� ����.
 */
public class DBConnectionJSP {

	final String _URL = "jdbc:oracle:thin:@192.168.0.231:1521:orcl11";
	final String _USER = "jsp";
	final String _PW = "123";
	Connection 	con 		= 	null;
	public static void main(String[] args) {
			}
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
