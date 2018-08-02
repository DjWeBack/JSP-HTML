package com.ch13.bakery;

import java.util.Vector;

public class BakerStack {
	private Vector<String> vec = new Vector<String>(10);
	
	public synchronized String pop(String cbread) {
		String bread = null;
		//���� ������
		if(vec.size()>0) {
			vec.remove(bread);
		}
		//���� ������ - ��ٸ� wait,sleep
		else if(vec.size()==0) {
			try {
				System.out.println("��ٷ� ����");
				this.wait();
				//����� ���¸� �����ϴ� �ڵ� - ����ȭ �ڵ忡��
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return bread;
	}
	//���� �����ϴ� �޼ҵ� �ʿ�
	public void push(String bread) {
		//Vec�� ���� �߰��ؾߵ�.(add)
		vec.add(bread);
		//���ڴ� ������ ����� - interrupt(),notify(),notifyAll()
		this.notify();
	}
}
