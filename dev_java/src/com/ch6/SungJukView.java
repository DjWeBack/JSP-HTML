package com.ch6;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class SungJukView {
	//�����
	//JF_sungjuk - �ν��Ͻ�����
	//��Ȱ - �޼ҵ� �� ������ ����Ҷ�
	JFrame jf_sungjuk = new JFrame();
	String header[] = {"��ȣ","�̸�","JAVA","ORACLE","HTML","����","���","����"};
	String datas[][] = new String[5][8];
	DefaultTableModel dtm_sunjuk = new DefaultTableModel(datas, header);
	JTable jtb_sungjuk = new JTable(dtm_sunjuk);
	//�޼ҵ� �����ϱ�
	//ȭ��ó����
	public void initDisplay() {
		jf_sungjuk.add("Center", jtb_sungjuk);
		jf_sungjuk.setVisible(true);
		jf_sungjuk.setSize(600, 400);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SungJukView sjView = new SungJukView();
		sjView.initDisplay();
	}

}
