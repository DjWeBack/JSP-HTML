package com.ch7;

import javax.swing.JFrame;

public class JFrameTest extends JFrame {
	//�����
	//������
	public void JFrameTest() {
		initDisPlay();
	}
	//ȭ��ó����
	void initDisPlay() {
		//super - JFrame, 
		this.setSize(500,300);//this - JFrameTest this(); <<������ ȣ��
		setVisible(true);
	}
	//���θ޼ҵ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrameTest jft = new JFrameTest(); //����Ʈ ������ ȣ��


	}

}
