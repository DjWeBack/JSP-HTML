package com.ch7;

public class  Marine extends Blood{
	public Marine() {
		this.move(350, 150);
		this.stop();
		this.stimPack();
	}
	@Override
	void move(int x, int y) {
		System.out.println("===============����=============");
		x=500;
		y=150;
		System.out.println("����! �������ڸ��� "+x+","+y+"�� �̵���");
	}
	@Override
	void stop() {
		System.out.println(x+","+y+"��ġ�� �̵� �Ϸ� �� ����!!!");
	}
	@Override
	void stimPack() {
		System.out.println("���� ������ �����Ҷ� ������ ����!");
	}

}
