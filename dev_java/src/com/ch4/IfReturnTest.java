package com.ch4;

public class IfReturnTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// �ٸ�Ŭ������ ������ �޼ҵ带 ȣ���� �� - �ν��Ͻ�ȭ!
		// �ٸ������ �ִ�. static
		// �޼ҵ� �տ� static�� ������ �ν��Ͻ�ȭ ���̵� ����.
		args = new String[1];
		args[0] = "1";
		//int user = Integer.parseInt(args[0]);
		//������ ������ �ִ�.
		//StringŸ���� ����Ʈ���� null�̹Ƿ� �Ľ���Ʈ�� ���� ����ȯ�� �̷������ ����.
		//�׷��Ƿ� ������ �߻�.
		if(args==null) {
			return;//main�޼ҵ带 Ż����.
		}
		// ���ڸ� �Է��ѰŴ�?
		int user = 0;
		if(args[0].length()==1) {
			char ch2 = args[0].charAt(0);
			if(ch2>=0&&ch2<9) {
				user = Integer.parseInt(args[0]);
			}
			else
			{
				System.out.println("���ڸ� ���ڸ� �Է��ϼ���.");
				return;
			}
		}
		System.out.println(args[0]);
		System.out.println((user+3));
		char ch = 1;
		System.out.println(ch>=0);
		System.out.println('C'>'B');
		System.out.println(Integer.parseInt("10"));
		//System.out.println(Integer.parseInt("true"));
		//System.out.println(Integer.parseInt("ȸ��"));
		//System.out.println(Integer.parseInt(null));
	}

}
