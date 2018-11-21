package chap03;

import java.util.Scanner;


/**
 * 1부터 n까지의 정수 합 구하기
 * @author choseongil
 *
 */
public class SumWhile {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while (i <= n) {
			sum += i;
			i++;
		} // while
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		System.out.println("i = " + i);
	} // main
	
} // end class