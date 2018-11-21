package chap01;

import java.util.Scanner;


/**
 * 세 값의 최솟값
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
	
	    
	    System.out.println("세 정수의 최솟값을 구합니다.");
	    
	    System.out.print("a의 값：");  
	    a = stdIn.nextInt();
	    
	    System.out.print("b의 값：");  
	    b = stdIn.nextInt();
	    
	    System.out.print("c의 값：");  
	    c = stdIn.nextInt();
	
	    int min = min3(a, b, c);  
	
	    System.out.println("최솟값은 " + min + "입니다.");
   } // main
	   
} // end class