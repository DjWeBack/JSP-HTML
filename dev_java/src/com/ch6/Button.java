package com.ch6;

import javax.swing.*;

public class Button {

	JButton jbtn[] = new JButton[3];
	JFrame jf_view = new JFrame();
	JButton jbtn_new = new JButton("������");
	JButton jbtn_clear = new JButton("�����");
	JButton jbtn_exit = new JButton("����");
//	JButton jbtn[] = new JButton[3];
	public void Butt () {
		jbtn[0] = jbtn_new;
		jbtn[1] = jbtn_clear;
		jbtn[2] = jbtn_exit;
		
	}
}
