package com.ch13.bakery;

public class Customer  extends Thread{
	private BakerStack bs = null;
	public Customer(BakerStack bs) {
		this.bs = bs;
	}
	public void run() {
		
		String bread = null;
		//�������� ����Ʋ������
		bs.pop("ũ��ġ���");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
			// TODO: handle exception
			System.out.println("��ġ���ϸ� �ҹ�� ���� ���ξ���.");
		}
	}
}
