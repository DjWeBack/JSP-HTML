package com.ch7;

public class Dropship extends Blood{
	public Dropship() {
	this.move(350, 150);
	this.stop();
	this.load();
	this.unload();
}
	@Override
	void move(int x, int y) {
		
		x=350;
		y=150;
		System.out.println("===============�����=============");
		System.out.println("����! �������ڸ��� "+x+","+y+"�� �̵���");
	}
	@Override
	void stop() {
		System.out.println(x+","+y+"��ġ�� �̵� �Ϸ� �� ����!!!");
	}
	@Override
	void load() {
		System.out.println("���� �¿��");
		
	}
	@Override
	void unload() {
		System.out.println("����þ߿� ������");
	}
}
