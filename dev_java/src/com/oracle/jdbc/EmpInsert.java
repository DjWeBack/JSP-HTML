package com.oracle.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class EmpInsert {
	//��忡�� �Ѱ��� �Է� �Ǿ����� ���ϰ��� 1�̾���.
	public int empAdd(int empno,String ename, String job, String hiredate, double sal, double comm, int deptno, int mgr) {
		DBConnection dbcon = new DBConnection();
		Connection con = null;
		Statement stmt = null;
		int result = 0;
		String sql = "";
		sql += "Insert into emp(empno,ename,job,                       ";
		sql += "		mgr,hiredate,sal,                                 ";
		sql += "		comm,deptno) values("+empno+",'"+ename+"','"+job+"',"+mgr;
		sql += "				,'"+hiredate+"',"+sal+","+comm+","+deptno+")";                
		try {
			con = dbcon.getConnetion();
			stmt = con.createStatement();
			result =  stmt.executeUpdate(sql);
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

