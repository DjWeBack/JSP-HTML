package com.oracle.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class EmpUpdate {
	DBConnection dbcon = new DBConnection();
	Connection con = null;
	Statement stmt = null;
	public int empUpd(int empno, String ename, String job, String hiredate)
	{
		int result  = 0;//ó�� ��� ��ȯ�� 1:����, 0:����
		String sql = "";                            
		sql += 		"update emp ";
		sql +=		"set ename = '"+ename+"',";
		sql +=	    "job = '"+job+"',";
		sql +=	    "hiredate='"+hiredate+"' ";
		sql +=	    "where empno="+empno+"";
		 
		 
		                 
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
