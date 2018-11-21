package chap03;

import java.util.Scanner;


/**
 * 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환
 * @author choseongil
 *
 */
public class SumOf {
	
	static int sumof(int a, int b) {
		int sum = 0;
		
		for (int i = a; i <= b; i++) {
			sum += i;
		} // for
		
		return sum;
	} // sumof
	
	public static void main(String[] args) {
		Scanner stdId = new Scanner(System.in);
		
		
		System.out.print("a의 값을 입력하세요. : ");
		int a = stdId.nextInt();

		System.out.print("b의 값을 입력하세요. : ");
		int b = stdId.nextInt();
		System.out.println("sum = " + sumof(a, b));
	} // main
	
} // end class