package com.ch8;

import com.semi.chat0615.MultiClient;

public class ThrowsTest {
	MultiClient mc = null;
	
	public void ThrowsT() throws NullPointerException {
		try {
			mc.action(null, null);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString()+"���� ����");
		}
		throw new NullPointerException("������Ʈ�ͼ��� ����!");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsTest tt = new ThrowsTest();
		try {
			tt.ThrowsT();
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("�ͼ��� �޼��� 1 : " + e.getMessage());
			System.out.println("�ͼ��� �޼��� 2 : " + e.toString());
		}
		
	}

}
