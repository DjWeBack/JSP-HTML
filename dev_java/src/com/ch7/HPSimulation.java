package com.ch7;

public class HPSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �߻�Ŭ������ �ܵ����� �ν��Ͻ�ȭ �� �� ����. - ����ü Ŭ������ �ݵ�� �ʿ���.
		HP hp2 = new IPhone();//����ο� �������� �̸��� �ٸ���. - �������� �����ϴ�.
		// IPhoneŬ������ HPŬ����(�߻�Ŭ����)�� ��ӹ��� Ŭ���� �̹Ƿ� �����θ� IPhone�� ���ְԵǸ� �ν��Ͻ�ȭ ����
		hp2.call(); //�߻�޼ҵ带 IPhoneŬ�������� �����ߴ�.
		hp2.view();//�߻�޼ҵ带 IPhoneŬ�������� �����ߴ�.
		hp2.off();//�Ϲ� �޼ҵ带 �����Ҽ� �ִ�. - �߻�Ŭ������
		
		hp2 = null;
		// �� �κп��� Candidate���·� ����. - IPhone - ��� ������ �Ǵ°� �ƴ�
		// ����..? - garbage collector(System.gc())
//		hp2 = new Galaxy();



	}
}
