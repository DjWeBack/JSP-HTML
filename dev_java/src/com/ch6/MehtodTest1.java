package com.ch6;

public class MehtodTest1 {
	MehtodTest1 mt2 = new MehtodTest1();
	public static void mehtodA() {}
	public final void mehtodB() {}
	public void mehtodC() {}
	public static int mehtod1() {return 0;}
	public final String mehtodB1() {return "�ȳ�";}
	public double mehtodC1() {double d=0.5; return d;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mehtodA();
		MehtodTest1 mt1 = new MehtodTest1();
		mt1.mehtodB();
		mt1.mehtodC();
		mt2.mehtodA();
		//�������� mt2�� main�޼ҵ忡�� ������ �� ����.
		//mt2�� non-staticŸ���̱⶧���� �Ұ���
		//Ŭ���� �տ� static�� ���̸� ��밡��
		//������ ����ƽ�� ���̰ԵǸ� ������ �ǹǷ� ����������̾ƴ� ������ �����ϰԵ�,
		mt1.mt2.toString();
		//mt2������ non-static���� �����ؼ� ���� �ϰ�ʹٸ�. �ּҹ����� �ι�����ϸ� ȣ�� ����.
		//mt1�� ���������� �޸𸮿� �ε��� �����༭ Ŭ������ �����ϰԵ�.
		//������ mt1Ŭ���� �ȿ� �ִ� mt2�� ����Ҽ� ����.
		mt1.mt2.mehtodA();
		mt1.mehtodC();
		

	}

}
