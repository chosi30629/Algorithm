package chap02;

import java.util.Scanner;

/**
 * �� ���� �߾Ӱ�
 * @author choseongil
 *
 */
public class Median {
	
	static int med3(int a, int b, int c) {
		if (a >= b) {
			if (b >= c) {
				return b;
			} else if (a <= c) {
				return a;
			} else {
				return c;
			} // inner else-if
		} else if (a > c) {
			return a;
		} else if (b > c) {
			return c;
		} else {
			return b;
		} // outer else-if
	} // med3
		
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		
		System.out.println("�� ������ �߾Ӱ��� ���մϴ�.");
		
		System.out.print("a�� �� : ");
		int a = stdIn.nextInt();
		
		System.out.print("b�� �� : ");
		int b = stdIn.nextInt();
		
		System.out.print("c�� �� : ");
		int c = stdIn.nextInt();
		
		System.out.println("�߾Ӱ��� " + med3(a, b, c) + "�Դϴ�.");
	} // main
	
} // end class
