package chap01;

import java.util.Scanner;


/**
 * �� ���� �ִ�
 * @author choseongil
 * �˰��� : ������ �ذ��ϱ� ���� ������, ��Ȯ�ϰ� ���ǵǰ� ������ �ִ� ���� ���� ��Ģ���� �̷���� ����
 *
 */
public class Max3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		
		System.out.println("�� ������ �ִ��� ���մϴ�.");
		
		System.out.print("a�� �� : ");
		int a = stdIn.nextInt();
		
		System.out.print("b�� �� : ");
		int b = stdIn.nextInt();
		
		System.out.print("c�� �� : ");
		int c = stdIn.nextInt();
		
		int max = a;
		
		if (b > max) {
			max = b;
		} // if
		
		if (c > max) {
			max = c;
		} // if
		
		System.out.println("�ִ��� " + max + "�Դϴ�.");
	} // main
	
} // end class
