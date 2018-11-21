package chap03;

import java.util.Scanner;


/**
 * n이 7이면 '1 + 2 + 3 + 4 + 5 + 6 + 7 = 28'로 출력
 * @author choseongil
 *
 */
public class SumForEx {
	
	public static void main(String[] args) {
		Scanner stdId = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값을 입력하세요. : ");
		int n = stdId.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;

			if(i == n) {
				sb.append(i + " = " + sum);
				break;
			} // if

			sb.append(i + " + ");
		} // for
		
		System.out.println(sb.toString());
	} // main
	
} // end class