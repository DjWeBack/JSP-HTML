package com.ChatProject;

public class Ttest extends Thread{
	Ttest(){
		for(int i=0;i<10;i++) {
		System.out.println("�����ڿ��� ����� �ý��� ���"+i);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ttest tt = new Ttest();
		tt.start();
	}
	@Override
	//���θ޼ҵ� ó�� ��밡��....
	public synchronized void run() {
		try {
			for(int i=0;i<10;i++) {
			System.out.println("�����忡�� ����� �ý��� ���."+i);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			for(int i=0;i<10;i++) {
				System.out.println("�����忡�� ����� �ý��� ���2. : "+i);
				}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
