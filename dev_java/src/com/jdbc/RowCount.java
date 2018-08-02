package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.util.DBConnectionMgr;

public class RowCount {
	//insert here
	DBConnectionMgr		 dbmger		 = null;
	Connection			 con		 = null;//DB���� �������̽�
	PreparedStatement	 pstmt		 = null;//Ŀ������ �������̽�
	ResultSet			 rs			 = null;//������ ���� �������̽�
	StringBuilder		 sql		 = new StringBuilder();	
		
	// �������� ���� ��ü ����(StringBuffer of StringBuilder)
	// String��� StringBuilder�� ����ϴ� ������ ���� ���غ�����.
	


	public int getRowCount() {
		int result = 0;
		sql.append("select empno from emp");
		dbmger = DBConnectionMgr.getInstance();
		try {
			con = dbmger.getConnection();
			pstmt = con.prepareStatement(sql.toString(),
										 ResultSet.TYPE_SCROLL_SENSITIVE,
										 ResultSet.CONCUR_UPDATABLE);
			/**
			 * TPYE_FORWARK_ONLY - ���������θ� Ŀ���� �̵�
			 * TPYE_SCROLL_INSENSITIVE - ����������� Ŀ���� �̵�(���ü� ���� �ȵ�)
			 * TYPE_SCROLL_SENSITIVE - ���������� Ŀ�� �̵�(���ü� ����)
			 * CONCUR_UPDATABLE
			 * CONCUR_READ_ONLY
			 */
			rs = pstmt.executeQuery();
			rs.last();
			result = rs.getRow();
			rs.beforeFirst();
			
			System.out.println("Total row : " +result);
					}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			dbmger.freeConnection(con, pstmt, rs);
		}
		return result;
	}
	public static void main(String[] args) {
		RowCount rc = new RowCount();
		rc.getRowCount();
	}
}
