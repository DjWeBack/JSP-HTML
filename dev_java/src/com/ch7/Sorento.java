package com.ch7;

public class Sorento extends Suv{
	String carColor = "Black";
	public void SpeedUp() {
		System.out.println("Sorento SpeedUpȣ�� ����");
	}
	public void SpeedDown() {
		System.out.println("Sorento SpeedDownȣ�� ����");
	}
	
	public static void main(String args[]) {
		Suv sv = new Sorento();
		sv.speed = 10;
		sv.wheelnum = 4;
		sv.SpeedUp();//���� ���̵� �����̹Ƿ� Sorento�� speedup�޼ҵ尡 ȣ���.
		sv.SpeedDown();//���� ���̵� �����̹Ƿ� Sorento�� speeddown�޼ҵ尡 ȣ���.
		Suv sv2 = new Suv();
		sv2.speed = 10;
		sv2.wheelnum = 4;
		sv2.SpeedUp();//�ܼ��� �θ� Ŭ����(Suv)�� �ν��Ͻ�ȭ �߱⶧���� SuvŬ���� �ȿ� �ִ� speedup�޼ҵ尡 ȣ���
		sv2.SpeedDown();//�ܼ��� �θ� Ŭ����(Suv)�� �ν��Ͻ�ȭ �߱⶧���� SuvŬ���� �ȿ� �ִ� speeddown�޼ҵ尡 ȣ���
	}
	
}