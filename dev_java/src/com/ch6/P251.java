package com.ch6;

public class P251 {
	static int showMenu() {
		int select = 0;
		return select;
	}
	static void inputRecord() {
		System.out.println("��ǲ ȣ�⼺��");
	}
	static void changeRecord() {
		System.out.println("��ü ȣ�⼺��");
	}
	static void deleteRecodrd() {
		System.out.println("���� ȣ�⼺��");
	}
	static void searchRecord() {
		System.out.println("�˻� ȣ�⼺��");
	}
	static void showRecordList() {
		System.out.println("����Ʈ ȣ�⼺��");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[10];

		int initArr = numArr[0];
		int printArr = numArr[1];
		int sortArr = numArr[2];
			
		switch(showMenu()) {
		case 1: inputRecord();
		break;
		case 2: changeRecord();
		break;
		case 3: deleteRecodrd();
		break;
		case 4: searchRecord();
		break;
		default: showRecordList();
		break;
		
		}

}
}