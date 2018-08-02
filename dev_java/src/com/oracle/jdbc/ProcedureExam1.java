package com.oracle.jdbc;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import javax.swing.JOptionPane;
public class ProcedureExam1 {
	//�����
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
	public ProcedureExam1() {
		int uinput=userInput();//empno <<
		String msg = salaryUpdate(uinput);// empno<<
		System.out.println("[[ó�� ���]]"+msg+uinput);
		
		}
	//����� ���� �޼ҵ�
	//����ڷκ��� �����ȣ�� �Է¹޴� �޼ҵ带 ����. - userinput
	public int userInput() {
		int empno = 0;
		String u_empno = jop.showInputDialog("��������� �Է��� �ּ���.");
		empno = Integer.parseInt(u_empno);
		return empno;
	}
	
	//�Է¹��� �����ȣ�� �޿��� �λ�ó���ϴ� �޼ҵ�.
	public String salaryUpdate(int empno) {
		String msg = null;
		//empno=userInput();
		
		try {		
		con = dbCon.getConnetion();
		cstmt = con.prepareCall("{call proc_emp_sal_update(?,?)}");
		cstmt.setInt(1, empno);
		cstmt.registerOutParameter(2, java.sql.Types.VARCHAR);
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
		new ProcedureExam1();
		
		

	}

}
