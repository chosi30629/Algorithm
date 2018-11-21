package chap03;

import java.util.Scanner;


/**
 * 1부터 10까지의 합은 (1 + 10) * 5 와 같은 방법으로 구할 수 있는 가우스의 덧셈
 * @author choseongil
 *
 */
public class SumGauss {
	
	public static void main(String[] args) {
		Scanner stdId = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값：");
		int n = stdId.nextInt();
		
		int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	} // main
	
} // end class