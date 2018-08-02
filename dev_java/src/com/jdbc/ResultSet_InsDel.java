package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.util.DBConnectionMgr;

public class ResultSet_InsDel {
	//�����
	DBConnectionMgr		 dbmger		 = null;
	Connection			 con		 = null;//DB���� �������̽�
	PreparedStatement	 pstmt1		 = null;//Ŀ������ �������̽�
	PreparedStatement	 pstmt2		 = null;//Ŀ������ �������̽�
	ResultSet			 rs			 = null;//������ ���� �������̽�
	StringBuilder		 sql		 = new StringBuilder();	

	public void methodA() {
		// ������ �߰�
		int result = 0;
		dbmger = DBConnectionMgr.getInstance();
		sql.append("select empno, ename from emp");
		try {
			con = dbmger.getConnection();
			pstmt1 = con.prepareStatement(sql.toString(),
										 ResultSet.TYPE_SCROLL_INSENSITIVE,
										 ResultSet.CONCUR_UPDATABLE);
			rs = pstmt1.executeQuery();
			/*rs.moveToInsertRow();
			rs.updateInt(1, 9950);
			rs.updateString(2, "������");
			rs.insertRow();
			rs.moveToCurrentRow();
			rs.updateInt(1, 9952);
			rs.updateString(2, "������");
			rs.insertRow();
			rs.close();*/
			System.out.println("������ �߰� �� ���̺� ����Ʈ");
			while(rs.next()) {
				System.out.println("�����ȣ : " + rs.getInt("empno")+", ����� : " + rs.getString("ename"));
			}
			if(!rs.isBeforeFirst()) {//Ŀ���� �� �������� ��ġ�ϴ��� üũ
				rs.beforeFirst();//Ŀ���� �� ������ �̵�.
				}
			while(rs.next()) {
				if(rs.getInt("empno")==9950) {
					rs.deleteRow();
				}
				if(rs.getInt("empno")==9952) {
					rs.deleteRow();
				}
			}
			}
		
		catch (SQLException se) {
			System.out.println(se.toString());
		}
		
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			dbmger.freeConnection(con, pstmt1, rs);
			try {
				if(pstmt2!=null) pstmt2.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		// ������ ��ȸ
		
		// ������ ����
		
	}

	//������
	
	//���θ޼ҵ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResultSet_InsDel ri = new ResultSet_InsDel();
		ri.methodA();
	}

}
