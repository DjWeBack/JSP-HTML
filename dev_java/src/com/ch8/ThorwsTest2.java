package com.ch8;

public class ThorwsTest2 {
/*
 * ����ó���� �ݵ�� �ؾ� �Ǵ� ��Ű���� �ִ�.
 * java.net.Socket
 * javaj.io.PrintWriter
 * java.lang.Thread
 * ���� ��� ����ó���� ������ ���� ������ ���� �߻�.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			throw new ClassNotFoundException();
			//thorw�� ȣ���ϸ� ���ܸ� ������ �߻����� �ִµ�
			//���ܸ� ������ �����Ѽ� �ð��� ������� �� ���̿� �ٸ� ó���� �� �� �ִ�.
			//���� ��� ����Ŭ���� Ʈ����� ó���� �� ��.....
		}
		catch (ClassNotFoundException ce) {
			// TODO: handle exception
		System.out.println("Ŭ������ ã�� �� �����ϴ�.");	
		}
		 catch (Exception e) {
			// TODO: handle exception
			 System.out.println("Exception : " +e.getMessage());
		}
	}

}
