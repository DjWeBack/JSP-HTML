package com.oracle.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import com.util.DBConnectionMgr;

public class proc_test2 {
	//�����
	Connection			 con	 =null;
	DBConnectionMgr		 dbcon	 = null;
	CallableStatement	 cstmt	 = null;
	CallableStatement	 cstmt2	 = null;
	ResultSet			 rs		 = null;//���ν������� ������
	//������
	public proc_test2() {
		int stdno = 0;
		int obj1 = 0;
		int obj2 = 0;
		int obj3 = 0;
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
		String msg = null;
		String out = null;
		System.out.println("�й��� �Է��ϼ��� : ");
		stdno = sc.nextInt();
		System.out.println("ù��° ������ ������ �Է��ϼ��� : ");
		obj1 = sc2.nextInt();
		System.out.println("�ι�° ������ ������ �Է��ϼ��� : ");
		obj2 = sc3.nextInt();
		System.out.println("����° ������ ������ �Է��ϼ��� : ");
		obj3 = sc4.nextInt();
		out = methodA(stdno,obj1,obj2,obj3,msg);
		System.out.println(out);
	}
	public String methodA(int std_no,int objsc1,int objsc2,int objsc3, String rmsg){
		dbcon = new DBConnectionMgr();
		con = dbcon.getConnection();
		try {
			cstmt = con.prepareCall("{call proc_std_ins(?,?,?,?,?)}");
			cstmt.setInt(1, std_no);
			cstmt.setInt(2, objsc1);
			cstmt.setInt(3, objsc2);
			cstmt.setInt(4, objsc3);
			cstmt.registerOutParameter(5, java.sql.Types.VARCHAR);
			cstmt.executeUpdate();
			rmsg = cstmt.getString(5);
			cstmt2 = con.prepareCall("{call proc_std}");
			cstmt2.execute();
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
		new proc_test2();
	}

}
