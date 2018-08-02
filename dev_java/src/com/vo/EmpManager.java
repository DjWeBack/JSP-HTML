package com.vo;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EmpManager extends JFrame implements ActionListener {
	EmpController empCtrl = new EmpController();
	String[][] data = new String[0][8];
	String[] cols = {"�����ȣ","�����","�׷��ڵ�","JOB","�Ի�����","�޿�","�μ�Ƽ��","�μ���ȣ"};
	DefaultTableModel dtm = new DefaultTableModel(data, cols);
	JTable jtb = new JTable(dtm);
	JScrollPane jsp = new JScrollPane(jtb);
	JButton jbtn_ins = new JButton("�Է�");
	JButton jbtn_del = new JButton("����");
	JButton jbtn_upd = new JButton("����");
	JButton jbtn_sel = new JButton("��ȸ");
	JPanel jp_view = new JPanel();
	JPanel jp_btns = new JPanel();
	public void initDisplay() {
		this.setTitle("���̺���ȸ");
		this.setSize(550, 470);
		this.setVisible(true);
		//		this.setLayout(new BorderLayout());
		this.add("Center",jp_view);
		this.add("East",jp_btns);
		jp_view.add(jsp);
		jp_btns.setLayout(new GridLayout(4,1,1,1));
		jp_btns.add(jbtn_ins);
		jp_btns.add(jbtn_del);
		jp_btns.add(jbtn_upd);
		jp_btns.add(jbtn_sel);
	}
	public EmpManager() {
		initDisplay();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = new Object();
		if(jbtn_sel==obj) {
			List<EmpVO> empList = empCtrl.getEmpList(null);
			Iterator iter = empList.iterator();
			for(int i=0;iter.hasNext();i++) {
				Vector<Object> v = new Vector<Object>();
				v.add(empList.get(i).getEMPNO());
				dtm.addRow(v);//�Ѱ� �ο쾿 ȭ�鿡 �߰���.
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EmpManager();
		EmpController empc = new EmpController();
		List<EmpVO> empList = empc.getEmpList(null);
		System.out.println(empList.size());
	}

}
