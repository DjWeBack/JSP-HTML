package com.ch7;

public class NoteBook extends Object{
	public boolean isTypeCheck(NoteBook nb) {
		boolean isOk = false;
		//instanceof ���ֻ���.
		if(nb instanceof NoteBook) {
			isOk = true;
		}
//		else if(nb instanceof Sonata) {
//			
//		}
		return isOk;
	}
	//�̶� �ƺ��� ������ �޼ҵ� toString�� ������ �޼ҵ�����.
	@Override
	public String toString() {
		return "���� �Ｚ ��Ʈ���Դϴ�.";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoteBook nb = new NoteBook();
		System.out.println(nb.toString());
	}

}
