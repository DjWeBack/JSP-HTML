package com.ch4;
/* �ڵ� ����
 * 1.WhileTest.java �߰��Ѵ�.
 * 2.ForTest.java���� main�޼ҵ� �ȿ� �ڵ带 �Ծ��Ѵ�.
 * 3.for������ ó���� �κ��� while������ �ٲپ� ����.
 * 4.for�������� ���� ����� �ʱ�ȭ, ���ǽ�, ���������ڸ� ����������
 *   while�������� ���ǽĸ� �����ǹǷ� �������� �� �ʱ�ȭ, ���������ڸ� ����
 *   ���־�� �Ѵ�.
 */
public class WhileTest {

	public static void main(String[] args) {
		int i = 1;
		int hap = 0;
		while(i<=100) {
			if(i%2==0) {
				//hap = hap + i;
				hap+=i;
				System.out.println("hap:"+hap);
			}
			//while�������� ���������ڸ� ó���ϴ� �κ��� ���� �����Ƿ� �ݵ�� �߰��ؾ� ��
			//���� �� �ڵ带 �����ϰ� �Ǹ� ���ѷ����� ����.
			//������ while���� Ż���� �� ���� ��
			//�޸𸮰� �� ���ԵǸ� PC�� �ٿ�� �� ����.
			//Ȥ�� �޸� ������ �߻�(blue screen)�ϰų� memory overflow�� �߻���.
			i = i + 1;
		}
		System.out.println("1���� 100������ ¦���� ����? "+hap);
	}
/* FizzBuzzGame ������ ����(���ڰ���)
 * 1 2 3 4 fizz 6 buzz 8 9 fizz 11 12 13 buzz fizz 16 17 18 19 fizz buzz,.....34 fizzbuzz 36 37
 * FizzBuzzGame.java	
 */

}







