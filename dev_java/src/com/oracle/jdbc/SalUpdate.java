package com.oracle.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class SalUpdate {
	Scanner sc = new Scanner(System.in);
	JOptionPane jop = new JOptionPane();
	final String _URL = "jdbc:oracle:thin:@192.168.0.218:1521:orcl11";
	final String _USER = "scott";
	final String _PW = "tiger";
	Connection 	con 		= 	null;
	CallableStatement cstmt = null;
	//	Statement cstmt = null;
	ResultSet rs = null;
	DBConnection dbCon = new DBConnection();
	
	
	//������
	public SalUpdate() {
		int uinput=userInput();//empno <<
		String msg = salaryUpdate(uinput);// empno<<
		System.out.println("[[ó�� ���]]"+msg+uinput);
		
		}
	//����� ���� �޼ҵ�
	//����ڷκ��� �����ȣ�� �Է¹޴� �޼ҵ带 ����. - userinput
	public int userInput() {
		int deptno = 0;
		String u_deptno = jop.showInputDialog("�μ������� �Է��� �ּ���.");
		deptno = Integer.parseInt(u_deptno);
		return deptno;
	}
	
	//�Է¹��� �����ȣ�� �޿��� �λ�ó���ϴ� �޼ҵ�.
	public String salaryUpdate(int deptno) {
		String msg = null;
		//empno=userInput();
		
		try {		
		
		con = dbCon.getConnetion();
		cstmt = con.prepareCall("{call proc_emp_update_salary(?,?)}");
		cstmt.setInt(1,deptno);				
		cstmt.registerOutParameter(2, java.sql.Types.VARCHAR);
		con.setAutoCommit(false);
		int result = cstmt.executeUpdate();
		msg = cstmt.getString(2);
		
		} catch (Exception e) {
			System.out.println(e.toString());
			// TODO: handle exception
			return msg;
			
		}
		
		
		
//		pempno = userInput();
//		System.out.println("xx����� �����ȣ�� : "+pempno+"�Դϴ�.");
		return msg;
	}
	//���θ޼ҵ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SalUpdate();
		
		

	}
}