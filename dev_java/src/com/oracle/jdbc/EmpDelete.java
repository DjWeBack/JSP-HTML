package com.oracle.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class EmpDelete {
	DBConnection dbcon = new DBConnection();
	Connection con = null;
	Statement stmt = null;
	public int empDelete(int empno)
	{
		int result  = 0;//ó�� ��� ��ȯ�� 1:����, 0:����
		String sql = "";                            
		sql += "delete emp				";
		sql += "where empno="+empno;
		 
		 
		                 
		try {
			con = dbcon.getConnetion();
			stmt = con.createStatement();
			result =  stmt.executeUpdate(sql);
			System.out.println("[[query]]"+sql);
			if(result==1) {
				System.out.println("������ �Է¿� �����߽��ϴ�.");
			}
			else {
				System.out.println("������ �Է¿� �����߽��ϴ�.");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
	}
}

