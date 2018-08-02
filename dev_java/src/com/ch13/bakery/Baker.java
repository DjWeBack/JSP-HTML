package com.ch13.bakery;

public class Baker extends Thread{
	private BakerStack bs = null;
	public Baker(BakerStack bs) {
		this.bs = bs;
	}
	
	public void run() {
		String bread = null;
		for(int i=0;i<3;i++) {
			bread = getBread();
			bs.push(bread);
			try {
				this.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println("���濹���������� �¾ ���ǵ� �𸣴� ȣ�λ���");
			}
		}
		
	}
	
	public String getBread() {
		String bread = null;
		switch((int)Math.random()*3) {
		case  0:
			bread = "Ƽ��̽�";
			break;
		case  1:
			bread = "ũ��ġ���";
			break;
		case  2:
			bread = "���Ϳ���";
			break;
		}
		return bread;
	}
}
