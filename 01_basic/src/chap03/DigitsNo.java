package chap03;

import java.util.Scanner;


/**
 * 123를 입력하면 '그 수는 3자리입니다.'라고 출력, 1314를 입력하면 '그 수는 4자리입니다.'라고 출력
 * @author choseongil
 *
 */
public class DigitsNo {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		
		System.out.print("양의 정수값의 자릿수를 구합니다.");
		
		int n;
		do {
			System.out.print("정수값：");
			n = stdIn.nextInt();
		} while (n <= 0);

		int no = 0; 			// 자릿수
		while (n > 0) {
			n /= 10; 			// n을 10으로 나눔
			no++;
		} // while

		System.out.println("그 수는 " + no + "자리입니다.");
	} // main
	
} // end class