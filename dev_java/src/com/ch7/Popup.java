package com.ch7;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Popup extends JFrame implements ActionListener{
	JButton jbtn_id = new JButton("ID�ߺ� üũ");
	JButton jbtn_zipcode = new JButton("�����ȣ �˻�");
	JPanel jp = new JPanel();
	// �θ�â�� ���� ȭ��ó�� �޼ҵ带 ����Ʈ �����ڿ��� ȣ���ϰ� �־��
	// ��Ӱ��迡 �ִ� Ŭ������ �ִ� ��� �ڽ�Ŭ���� ������ ȣ������ ���� �θ� �����ڰ� ���� ȣ�� ��.
	// �ֳ��ϸ�.. �׷��� �ڽ�Ŭ������ �޼ҵ尡 �������̵� �������� �ľ��ؾߵ�
	// �Ʒ��ڵ�[�̺�Ʈ ó��]���� �ν��Ͻ�ȭ�� �ι� �Ͼ.
	// �̰� �θ�â�� ���� ����Ʈ �����ڰ� �ι� ȣ���� �Ǵ� ����.
	// ���θ޼ҵ忡�� �ѹ� â�� ������ �̺�Ʈ�� �Ͼ�� �θ�â�� �ι� ������ �� �̰Ͷ�����.
	// �׷� �� ������ �ذ��� ������.  - �����ڸ� �̿��ؼ� �ذ��� ����.
	public Popup() {
//		initDisplay();
	}
	public Popup(String str) {
		System.out.println("Popup(String str) ȣ��Ϸ�");
		initDisplay();
		}
	

		public void dialogView(String title, int width, int heigth) {
			System.out.println("dialogViewȣ��Ϸ�");
		}
		public void initDisplay() {
			jbtn_id.addActionListener(this);
			jbtn_zipcode.addActionListener(this);
			this.setSize(500,400);
			this.setVisible(true);
			this.add("North",jbtn_id);
			this.add("South",jbtn_zipcode);
			
			
		}
	public static void main(String[] args) {
		new Popup("");

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// �ڹٴ� ����ο� �����ο� ���� Ŭ������ �ٸ� �� �ִ�.
		// �ڹٴ� �����ο� ����� Ŭ������ ���� �޸𸮿� �ε��� ��.
		// �׷��ٸ� ����ο� ���� ���� Ÿ�԰� ������ Ÿ���� ���� �޼ҵ��̸��� ȣ�� �Ǿ�����
		// ���� ȣ��Ǵ°���??
		String label = e.getActionCommand();
		Popup pop = null;
//		if(label.equals("ID�ߺ� üũ")) {}
		if("ID�ߺ� üũ".equals(label)) {
			IDCheck			idc = new IDCheck();
//			pop			 		= new IDCheck();
			idc.dialogView("ID�ߺ�üũ", 200, 100);
//			pop.dialogView("ID�ߺ�üũ2",300, 200);
		}
		else if("�����ȣ �˻�".equals(label)) {
			ZipCodeSearch 	zip = new ZipCodeSearch();
			pop					= new ZipCodeSearch();
		}
		
	}

}
