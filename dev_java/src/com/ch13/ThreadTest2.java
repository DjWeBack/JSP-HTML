package com.ch13;
import java.util.*;
public class ThreadTest2 extends Thread{
	public String getFood() {
		String food = null;
		switch((int)(Math.random()*3)) {
		case 0:
				food = "����";
				break;
		case 1:
			food = "���Ϳ���";
			break;
		case 2:
			food = "��ȸ";
			break;
		}
		return food;
	}
	ThreadTest2(){
		this.start();
		this.start();

		
	}
	@Override
	public void run() {
		String food = null;
		System.out.println("runȣ��");
		for(int i =0;i<5;i++) {
			food=getFood();
			System.out.println("Chef: "+Thread.currentThread().getName()+food);
			try {
				this.sleep(2000);
			} catch (InterruptedException ie) {
				// TODO: handle exception
				System.out.println("�ʻ��� ����?");
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadTest2();
//		ThreadTest2 tt2 = new ThreadTest2();
//		ThreadTest2 tt2_1 = new ThreadTest2();
//		ThreadTest2 tt2_2 = new ThreadTest2();
//		tt2.start();
//		tt2_1.start();
//		tt2_2.start();
		
	}

}
