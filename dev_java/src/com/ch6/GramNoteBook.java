package com.ch6;
class NoteBook {
	String usb="usb";
	public void usbRead() {
		System.out.println("usbReadȣ�� ����");
	}
	public void usbWrite() {
		System.out.println("usbWriteȣ�� ���� �ƺ�");
	}
}

public class GramNoteBook extends NoteBook{
	@Override
	public void usbRead() {
		System.out.println("usbReadȣ�� ����");
	}
	@Override
	public void usbWrite() {
		System.out.println("usbWriteȣ�� ����");
	}
	/*
	 * �޼ҵ� �������̵�� ������ �ٲ��� �ʴ´�.
	 * ����Ÿ�԰� �Ķ���� �״�� ����ؾߵ�.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������̵�� �޼ҵ� ȣ���� ����.
		GramNoteBook gnb = new GramNoteBook();
		gnb.usbRead();
		gnb.usbWrite();
		NoteBook nb = new NoteBook();
		nb.usbRead();
		nb.usbWrite();
	}

}
