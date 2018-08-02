package com.oracle.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import com.util.DBConnectionMgr;

public class Proc_weback {
	//�����
	Connection			 con	 =null;
	DBConnectionMgr		 dbcon	 = null;
	CallableStatement	 cstmt	 = null;
	ResultSet			 rs		 = null;//���ν������� ������
	//������
	public String methodA(int pempno, String rmsg){
		dbcon = new DBConnectionMgr();
		con = dbcon.getConnection();
		try {
			cstmt = con.prepareCall("call proc_weback_1(?,?)");
			cstmt.setInt(1, pempno);
			cstmt.registerOutParameter(2, java.sql.Types.VARCHAR);
			cstmt.executeUpdate();
			rmsg = cstmt.getString(2);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return rmsg;
		
	}
	//���θ޼ҵ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empno = 0;
		String msg = null;
		String out = null;
		Proc_weback pw = new Proc_weback();
		System.out.println("�����ȣ�� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		empno = sc.nextInt();
		out = pw.methodA(empno, msg);
		System.out.println(out);//�̰� ������ �ڵ� why? ���θ޼ҵ�ϱ�~^^
		//�ھƼ��� �� �� �ƴ� ��� ? ���ϴ»��.
	}

}
