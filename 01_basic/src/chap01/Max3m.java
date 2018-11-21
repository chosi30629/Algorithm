package chap01;

import java.util.Scanner;


/**
 * 세 값의 최댓값
 * @author choseongil
 *
 */
public class Max3m {
	
	static int max3(int a, int b, int c) {
		int max = a;
		
		
		if (b > max) {
			max = b;
		} // if
		
		if (c > max) {
			max = c;
		} // if
		
		return max;
	} // max3

	public static void main(String[] args) {
		System.out.println("max3(3, 2, 1) = " + max3(3, 2, 1));
		System.out.println("max3(3, 2, 2) = " + max3(3, 2, 2));
		System.out.println("max3(3, 1, 2) = " + max3(3, 1, 2));
		System.out.println("max3(3, 2, 3) = " + max3(3, 2, 3));
		System.out.println("max3(2, 1, 3) = " + max3(2, 1, 3));
		System.out.println("max3(3, 3, 2) = " + max3(3, 3, 2));
		System.out.println("max3(3, 3, 3) = " + max3(3, 3, 3));
		System.out.println("max3(2, 2, 3) = " + max3(2, 2, 3));
		System.out.println("max3(2, 3, 1) = " + max3(2, 3, 1));
		System.out.println("max3(2, 3, 2) = " + max3(2, 3, 2));
		System.out.println("max3(1, 3, 2) = " + max3(1, 3, 2));
		System.out.println("max3(2, 3, 3) = " + max3(2, 3, 3));
		System.out.println("max3(1, 2, 3) = " + max3(1, 2, 3));
	} // main
	
} // end class