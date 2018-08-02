package com.ch8;

import java.util.Random;
import java.util.Scanner;

public class Throw {
/******************************************************
 * 2018.06.18
 *  Throw
 *    - ��ġ��? ���๮ ������ (try catch)
 *    - ����? ����ó���� �Ͼ��.... > �����̸�
 *    - why? throw ������ �̸����� ó���� �ڵ尡 ������.
 *   
 *  Throws
 *    - �޼ҵ� �ڿ�
 *    - ����ó���� �̷��
 *    - �� ���ܰ� ����� ���Ƿ� ó���Ҽ� ������.
 * finally (������ ó���� �Ǿ��Ҷ�.)
 ******************************************************/
	public void Throwtest() {
		System.out.println("0���� 9������ ���ڸ� �Է��ϼ���.");
		Scanner scn = new Scanner(System.in);
		String val = scn.nextLine();
		int val2 = 0;
		val2 = Integer.parseInt(val);
		try {
			 
			if(val.length()>1) {
				throw new Exception("���ڸ��� �Է��ϼ���");
			}
			if(val==null||val.equals("")) {
				throw new NumberFormatException();
			}
			System.out.println((int)val.charAt(0));
	
			
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}	
		
		
			// TODO: handle exception
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throw th = new Throw();
		th.Throwtest();
			
	}

}
