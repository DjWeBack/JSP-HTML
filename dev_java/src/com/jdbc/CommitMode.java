package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.util.DBConnectionMgr;

public class CommitMode {
	DBConnectionMgr		 dbmger		 = null;
	Connection			 con		 = null;//DB���� �������̽�
	PreparedStatement	 pstmt		 = null;//Ŀ������ �������̽�
	ResultSet			 rs			 = null;//������ ���� �������̽�
	StringBuilder		 sql		 = new StringBuilder();
	public void methodA() {
		sql.append("insert into emp(empno, ename) VALUES(?,?)");
		dbmger = DBConnectionMgr.getInstance();
		int result = 0;
		try {
			con = dbmger.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, 9958);
			pstmt.setString(2, "�̼���");
			result = pstmt.executeUpdate();
			if(result==1) {
				System.out.println("�Է¼���");
			}
			if(result==0) {
				System.out.println("�Է½���");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
