package com.ch7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class InterfaceTest {
	public void setSonataList(Vector<String> nameList) {
		nameList.add("NF �ҳ�Ÿ");
		nameList.add("2018���� �ҳ�Ÿ");
		nameList.add("2019���� �ҳ�Ÿ");
	}
	public void setSonataList(ArrayList<String> nameList) {
		nameList.add("�׳��� �ҳ�Ÿ");
		nameList.add("�׳��� �ҳ�Ÿ");
		nameList.add("����� �ҳ�Ÿ");
	}
	public void setSonataList(List<String> nameList) {
		nameList.add("���ڳ�� �ҳ�Ÿ");
		nameList.add("2.4 �ҳ�Ÿ");
		nameList.add("2.0 �ҳ�Ÿ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		InterfaceTest ift = new InterfaceTest();
		Vector<String> nameList = new Vector<>();
		ArrayList<String> nameList2 = new ArrayList<String>();
		ift.setSonataList(nameList);
		for(String carName:nameList) {
			System.out.println("Vector[��Ƽ���������:�ӵ�����] : "+carName);
		}
		ift.setSonataList(nameList2);
		for(String carName:nameList2)
		{
			System.out.println("ArrayList[�̱۾��������:�ӵ�����] : "+carName);
		}
		
		List<String> nameList3 = new ArrayList<>();//List<>�� ���� ū �����̹Ƿ� ArrayList�� Vector������ ��������� Ÿ���� �����ؼ� ����Ҽ� ����.
		//<> �ȿ��� Ÿ�� ������ �ȹ��� ������ Ŭ������ �ü�������.
		
		ift.setSonataList(nameList3);
		for(String carName:nameList3) {
			System.out.println("ArrayList3[�̱۾��������:�ӵ�����] : "+carName);
		}
	}

}
