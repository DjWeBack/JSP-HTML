package com.ch7;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class RoomInlist {
	public RoomInlist() {
		nameListPrint();
	}
 public List<String> getRoomInList(){
//	 nameList�� ListŸ���Դϴ�.
//	 nameList�� ����ü Ŭ������ ArrayList�� ���õǾ���.
//	 �Ʒ��� ���� �ν��Ͻ�ȭ�� ���� �Ͽ��� ������ ������ �߻����� �ʾҴٴ°� �չ����� ����.
//	 �׷��ٸ� List�� �߻�żҵ��� add(E e):boolean�� add(int index, E e):void
//	 �� ArrayListŬ������ �����ߴٴ� ����.
	 List<String> nameList = new ArrayList<String>();
//	 nameList = new Vector<String>();
	boolean isOK = nameList.add("�����");
	nameList.add(1,"����");
//  ��ȭ�� ����� if���� �߰��Ͽ� �ε��� ���� i++���� �����ڸ� ��� �ؼ� ��̸���Ʈ�� ���������� �װ� ��ȭ��ȿ� �ο� ���.
//	��Ʈ�� �ȿ� ���� �̸��� ��ȭ�� �Ǵ� �̸����� �����Ͽ� sql�� �� ���� �̸��� �����ָ� ��.
	isOK = nameList.add("������");
		 return nameList;
 }
 public void nameListPrint() {
	System.out.println(getRoomInList().get(0)); 
	System.out.println(getRoomInList().get(1));
	System.out.println(getRoomInList().get(2));
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RoomInlist();
	}

}
