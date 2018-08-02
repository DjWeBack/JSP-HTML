package com.semi.baseballgame3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BaseBallGameEvent implements ActionListener{
	int cnt=0;
	BaseBallGameLogic bbgl = new BaseBallGameLogic();
	BaseBallGameView bbgv = null;
	public BaseBallGameEvent(BaseBallGameView bbgv) {
		this.bbgv=bbgv;//�ʱ�ȭ
	}
	
	
	
	public void actionPerformed(ActionEvent e) {              
		Object obj = e.getSource();//�̺�Ʈ�� �߻��� Ŭ������ �ּҹ���.
		String label = e.getActionCommand();//��ư�� ��-������,����,�����,����
		System.out.println(obj);
		System.out.println(label);
		if(obj==bbgv.jtf_input) {
			//jta_display.append(jtf_input.getText()+"\n");
			//����ڰ� 3�ڸ� ���ڸ� �Է��ϰ� enter���� �� �Ʒ� ó�� ������ּ���. ��Ź�ؿ�^^
			//1ȸ 257 : 0�� 1��
			//2ȸ 526 : 1�� 0��
			bbgv.jta_display.append((++cnt)+"ȸ."+bbgl.result(bbgv.jtf_input.getText())+"\n");
			bbgv.jtf_input.setText("");
		}
		//�� ������ ��ư Ŭ���Ѱž�?
		//else if(obj==jbtn_new) {//�ּҹ����� ����?
		else if("������".equals(label)) {//�ʰ� Ŭ���� ��ư�� ���ڿ��� �������̾�? �ּҹ���(jbtn_new)�� ���� ���ڿ���
			bbgl.ranCom();
		}
		//�� ����� ��ư �����ž�?
		else if("�����".equals(label)) {
			bbgv.jta_display.setText("");
		}
		//�� �����ư ������?
		else if("����".equals(label)) {
			System.exit(0);
		}
	}
}
