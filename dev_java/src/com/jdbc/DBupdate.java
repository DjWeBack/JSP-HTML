package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.util.DBConnectionMgr;

public class DBupdate {
	DBConnectionMgr		 dbmgr		 = null;
	Connection			 con		 = null;//DB���� �������̽�
	PreparedStatement	 pstmt		 = null;//Ŀ������ �������̽�
	ResultSet			 rs			 = null;//������ ���� �������̽�
	StringBuilder		 sql		 = new StringBuilder();
	public void update() {
		sql.append("select empno, ename, sal from emp");
		dbmgr = DBConnectionMgr.getInstance();
		int result = 0;
		try {
			con = dbmgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("�����ȣ :"+rs.getInt("empno")+", ����� : "+rs.getString("ename")+", �޿� : "+rs.getInt("sal"));
			}
			sql = new StringBuilder();
			sql.append("update emp set sal = sal+500");
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			System.out.println("ó�� �Ǿ����ϴ�.");
			sql = new StringBuilder();
			System.out.println("������Ʈ �� ������ ��ȸ");
			sql.append("select empno, ename, sal from emp");
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();			
			while(rs.next()) {
				System.out.println("�����ȣ :"+rs.getInt("empno")+", ����� : "+rs.getString("ename")+", �޿� : "+rs.getInt("sal"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBupdate dbu = new DBupdate();
		dbu.update();
	}

}
