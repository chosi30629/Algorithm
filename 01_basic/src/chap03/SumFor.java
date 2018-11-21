package chap03;

import java.util.Scanner;


/**
 * 1부터 n까지의 정수 합 구하기
 * @author choseongil
 *
 */
public class SumFor {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		} // for
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	} // main
	
} // end class