package com.ch4;
/*
 * ��������
 * 1���� 100������ ���ڸ� ä���ؼ� 5�� ����̸� 5�� ����Դϴ� ��� ����ϰ�
 * 7�� ���� �������� 0�̸� 7�� ����Դϴ�.��� ����ϰ�
 * 5�� ���� �������� 0�̰� 7�� ���� �������� 0�̸� 5�� 7�� �������� ����ϴ� 
 * ���α׷��� �ۼ��Ͻÿ�.
 * 
 */
public class HakJumSwitch {

	public static void main(String[] args) {
		int jumsu=51;
		char chakjum ='F';
		switch(jumsu/10) {
		case 10: case 9:
			chakjum='A';
			break;
		case 8:
			chakjum='B';
			break;
		case 7:
			chakjum='C';
			break;
		case 6:
			chakjum='D';
			break;
		default:
			chakjum='F';
			break;
		}		
/*		switch(jumsu) {
		case 100: case 99: case 98: case 97: case 96:
		case 95:  case 94: case 93: case 92: case 91:
		case 90:
			chakjum='A';
			break;
		case 89: case 88: case 87: case 86:
		case 85:  case 84: case 83: case 82: case 81:
		case 80:
			chakjum='B';
			break;
		case 3:
			chakjum='C';
			break;
		case 4:
			chakjum='D';
			break;
		default:
			chakjum='F';
			break;
		}*/
		System.out.println("chakjum�� "+chakjum+"�Դϴ�.");

	}

}
