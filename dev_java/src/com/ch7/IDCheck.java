package com.ch7;

import javax.swing.JDialog;

public class IDCheck extends Popup{
	JDialog jda = new JDialog();
//	public IDCheck() {
//		// TODO Auto-generated constructor stub
//		
//	}
	

	@Override
	public void dialogView(String title, int width, int heigth) {
		System.out.println("IDCheck dialogViewȣ��Ϸ�");
		jda.setTitle(title);
		jda.setSize(width, heigth);
		jda.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
