package com.test;

public class ChatClientThread extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep((int)(Math.random() * 1000));
			//�����尡 ���ÿ� ���� �ϴ°��� �ƴ϶� ���������� ó���ϱ⶧���� ���ÿ� ó���ϴ°� ó������ �װ� �α��ϱ� ���Ͽ� �ð��� ��
		} catch (Exception e) {
			// TODO: handle exception\
			  e.printStackTrace();

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
