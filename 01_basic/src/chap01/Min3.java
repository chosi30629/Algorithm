package chap01;

import java.util.Scanner;


/**
 * �� ���� �ּڰ�
 * @author choseongil
 *
 */
public class Min3 {
	
	static int min3(int a, int b, int c) {
		int min = a;
		
		
		if (b < min) {
			min = b;
		} // if
		
		if (c < min) {
			min = c;
		} // if
		
		return min;
	} // min3

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	    int a, b, c;
	
	    
	    System.out.println("�� ������ �ּڰ��� ���մϴ�.");
	    
	    System.out.print("a�� ����");  
	    a = stdIn.nextInt();
	    
	    System.out.print("b�� ����");  
	    b = stdIn.nextInt();
	    
	    System.out.print("c�� ����");  
	    c = stdIn.nextInt();
	
	    int min = min3(a, b, c);  
	
	    System.out.println("�ּڰ��� " + min + "�Դϴ�.");
   } // main
	   
} // end class

