package chap01;

import java.util.Scanner;


/**
 * �� ���� �ּڰ�
 * @author choseongil
 *
 */
public class Min4 {
	
	static int min4(int a, int b, int c, int d) {
		int min = a;
		
		
		if (b < min) {
			min = b;
		} // if
		
		if (c < min) {
			min = c;
		} // if
		
		if (d < min) {
			min = d;
		} // if
		
		return min;
	} // min4

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a, b, c, d;

		
		System.out.println("�� ������ �ּڰ��� ���մϴ�.");
		
		System.out.print("a�� ����");  
		a = stdIn.nextInt();
		
		System.out.print("b�� ����");  
		b = stdIn.nextInt();
		
		System.out.print("c�� ����");  
		c = stdIn.nextInt();
		
		System.out.print("d�� ����");  
		d = stdIn.nextInt();

		int min = min4(a, b, c, d);   

		System.out.println("�ּڰ��� " + min + "�Դϴ�.");
	} // main
   
} // end class