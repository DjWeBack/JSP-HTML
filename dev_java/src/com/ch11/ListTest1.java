package com.ch11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class ListTest1 {
/*
 * ������� Ÿ�԰� �������� Ÿ���� �ٸ� �� �ִ�. - �������� ��������
 * �ٸ� ��� �����ο� ���� Ŭ���� Ÿ������ ��ü ������ �Ͼ.
 * ����ο� �� ����Ŭ������ �������̽��� ���� �����ο� �پ��� Ŭ������ �ν��Ͻ�ȭ �� �� �־ ����.
 * ��) �ڵ带 �� �����ϰ� �䱸������ ������ų�� �ִ�.
 */
	ListTest1(){
		setNameList();
		setAniList();
		printNameList();
		printAniNameList();
	}
	List nameList2 = new Vector(); 
	List nameList = new ArrayList();
	ArrayList aniList = new ArrayList();
	public List setNameList() {
		nameList.add("���缮");
		nameList.add(1,"������");
		nameList.add(2,"����");
		return nameList;
	}
	public Vector setNameList2() {
		nameList2.add("���缮");
		nameList2.add(1,"������");
		nameList2.add(2,"����");
		return (Vector) nameList2;
	}
	public ArrayList setAniList() {
		aniList.add("cat");
		aniList.add(1,"dog");
		aniList.add(2,"pig");
		return aniList;
	}
	public void printNameList() {
		for(int i=0;i<nameList.size();i++) {
			System.out.println(nameList.get(i));
		}
		System.out.println("=====[[���� for��]]======");
		for(Object obj:nameList) {
			//�÷��������ӿ�ũ Ŭ������ ��� ObjectŸ���� ��´�.
			//���׸��� ������� �ʴ� ��� Ÿ���� ���� ���� �־�� �Ѵ�.
			System.out.println(obj);
		}
		System.out.println("========================");
		System.out.println("���缮 �ִ�?"+nameList.contains("���缮"));
		
	}
	public void printAniNameList() {
		for(int i=0;i<aniList.size();i++) {
			System.out.println(aniList.get(i));
		}
		System.out.println("=====[[���� for��]]======");
		for(Object obj:aniList) {
			System.out.println(obj);
		}
		System.out.println("========================");

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListTest1();
	}

}
