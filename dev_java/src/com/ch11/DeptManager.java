package com.ch11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeptManager {
	//������ ����(����), Ű�� �ߺ��Ұ�, ���� �ߺ�����
	//List���ؼ� Ű������ ���� ����
	//Flex���� UI�ַ�ǿ��� �����ϴ� Ŭ����
	HashMap 	hMap1 = new HashMap();//���Ͻ��������-����ȭó���ȵ�-�ӵ�����
	Hashtable 	hMap2 = new Hashtable();//��Ƽ��������� -����ȭó��
	//����ο� ����Ŭ������ �������̽��� ����ϸ� �����ο� �������� �ٸ� Ŭ������ ������ �� �ִ�.
	Map         hMap3 = hMap1;
	Map         hMap4 = hMap2;
	//�ϰ���
	//key���� String���� �� ������ 
	Map<String,Object> hMap5 = new HashMap<String,Object>();
	//����Ÿ��
	Map<Integer,Object> hMap6 = new HashMap<Integer,Object>();
	//true,false
	Map<Boolean,Object> hMap7 = new HashMap<Boolean,Object>();
	List<Map<String,Object>> deptList =
			new ArrayList<Map<String,Object>>();
	public void setMap() {
		hMap5.put("deptno", 10);
		hMap5.put("dname", "ACCOUNTING");
		hMap5.put("loc", "NEW YORK");
		deptList.add(hMap5);
		hMap5 = new HashMap<String,Object>();
		hMap5.put("deptno", 20);
		hMap5.put("dname", "RESEARCH");
		hMap5.put("loc", "DALLAS");
		deptList.add(hMap5);
		hMap5 = new HashMap<String,Object>();
		hMap5.put("deptno", 30);
		hMap5.put("dname", "SALES");
		hMap5.put("loc", "CHICAGO");
		deptList.add(hMap5);
		System.out.println(hMap5.get("deptno"));
		System.out.println(hMap5.get("dname"));
		//key���� ���� ��ҹ��ڸ� �����ϹǷ� ���� �� ����� Ű���� ����ؾ� �ǿ�.������~~~~
		//myBatis(ORM�ַ��)-30%�پ��.- ��? ��°� �����ص� �Ǵϱ�...
		//�ν��Ͻ�ȭ�� ���� �����Ƿ� �̰��� ArrayList�� ��ƺ���.
		//��? �� ������ �ּҹ����� ����� �ϴϱ�....��������Ʈ�� �Ͼ�� �ʵ��� �ϱ� ���ؼ�...
		//ArrayList�� �ּҹ��� �� ��ü�� ���� �� �ִ� �ڷᱸ�� �̹Ƿ� �����ϰ�����.
		//��� ���� ���� �� �ּҹ����� �� �� �����ؾ� ���� ����� �� ���� �־��.
		//�� ���� ArrayList �ι�°�� Map �ּҹ��� �̷��� �� ���� �����ؾ�
		//�� �ȿ� ��� ���� ���� �� �־��.
		//System.out.println(hMap5.get("loc"));
		for(int i=0;i<deptList.size();i++) {
			System.out.println(deptList.get(i));//Map-> HashMap
			Object[] keys = deptList.get(i).keySet().toArray();
			Set deptSet = deptList.get(i).keySet();
			keys = deptSet.toArray();
			System.out.println("keys["+i+"]="+keys[i]);
		}
	}
	public static void main(String[] args) {
		DeptManager dm = new DeptManager();
		dm.setMap();
		String str = "{"+"deptno="+10+",dname="+"ACCOUNTING"+",loc="+"NEW YORK}";
		System.out.println(str);
	}

}





