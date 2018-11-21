package chap02;

import java.util.Scanner;


/**
 * 세 값의 중앙값
 * @author choseongil
 *
 */
public class Med3 {
	
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
	
	/*
	위의 med3 과 밑의 med3 의 효율성 비교
		- 가장 처음의 if문의 판단
			if ((b >= a && c<= a) || (b <= a && c >= a)) 에 주목한다. 
			여기서 b >= a 및 b <= a의 판단을 뒤집은 판단(실질적으로 같은 판단)을 이어지는 else 이후의 else if ((a > b && c < b) || (b <= a && c > b))으로 수행한다. 
			결국 가장 처음의 if가 성립한 경우 2 번째의 if에서도 (실질적으로)같은 판단을 수행하므로 효율이 나빠진다.
		
	static int med3 (int a, int b, int c) {
		if ((b >= a && c <= a) || (b <= a && c >= a)) {
			return a;
		} else if ((a > b && c < b) || (a < b && c > b)) {
			return b;
		} // if-else 

		return c;
	} // med3
	*/
	
	public static void main(String[] args) {
		System.out.println("med3(3, 2, 1) = " + med3(3, 2, 1));
		System.out.println("med3(3, 2, 2) = " + med3(3, 2, 2));
		System.out.println("med3(3, 1, 2) = " + med3(3, 1, 2));
		System.out.println("med3(3, 2, 3) = " + med3(3, 2, 3));
		System.out.println("med3(2, 1, 3) = " + med3(2, 1, 3));
		System.out.println("med3(3, 3, 2) = " + med3(3, 3, 2));
		System.out.println("med3(3, 3, 3) = " + med3(3, 3, 3));
		System.out.println("med3(2, 2, 3) = " + med3(2, 2, 3));
		System.out.println("med3(2, 3, 1) = " + med3(2, 3, 1));
		System.out.println("med3(2, 3, 2) = " + med3(2, 3, 2));
		System.out.println("med3(1, 3, 2) = " + med3(1, 3, 2));
		System.out.println("med3(2, 3, 3) = " + med3(2, 3, 3));
		System.out.println("med3(1, 2, 3) = " + med3(1, 2, 3));
	} // main
	
} // end class