package com.ch7;

public class Tank extends Blood {
	public Tank() {
	this.move(350, 150);
	this.stop();
	this.changeMode();
}
	@Override
	void move(int x, int y) {
		System.out.println("===============��ũ=============");
		x=150;
		y=150;
		System.out.println("����! �������ڸ��� "+x+","+y+"�� �̵���");
	}
	@Override
	void stop() {
		System.out.println(x+","+y+"��ġ�� �̵� �Ϸ� �� ����!!!");
	}
	@Override
	void changeMode() {
		System.out.println("������ ��ȯ!");
	}
}
