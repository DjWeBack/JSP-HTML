package com.ch6;
/*
 * ���� �����ڸ� ������ �� �ִ�.
 * ���� ���� �ʿ��� �����ڸ� ȣ���� �� �ִ�.
 */
public class card {
	int i; 
	card(){
		System.out.println("����Ʈ ������");
	}
	card(double a){
		System.out.println("�Ķ���Ͱ� ������ ������");
		
	}

	card(int i){//�����.
		this.i=i; //this�� �ڱ��ڽ� Ŭ������ ����ų �� ����ϴ� �����
		System.out.println("k:"+i);
		System.out.println("i:"+i);
		System.out.println("�Ķ���Ͱ� ��Ʈ�� ������");
	}
	card(int k,String w){
		System.out.println("�Ķ���Ͱ� ��Ʈ�� ��Ʈ���� ������");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		card c = new card(10);//�ν��Ͻ�ȭ. ȣ���ϱ�.
		new card(10);
		new card(c.i);
		new card(10,"weback"); //������ ȣ��
		new card(8.8);
		System.out.println(c.i);
		 
		
	}

}
