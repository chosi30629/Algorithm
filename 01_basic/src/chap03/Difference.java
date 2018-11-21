package chap03;

import java.util.Scanner;


/**
 * 두 변수 a, b에 정수를 입력하고 b - a를 출력(단, 변수 b에 입력한 값이 a 이하면 변수 b의 값을 다시 입력) 
 * @author choseongil
 *
 */
public class Difference {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		
		System.out.print("a의 값 : ");
		int a = stdIn.nextInt();
		int b = 0;
		
		while(true) {
			System.out.print("b의 값 : ");
			b = stdIn.nextInt();
			
			if(b > a) {
				break;
			} // if
			
			System.out.println("a보다 큰 값을 입력하세요!");
		} // while

		System.out.println("b - a는 " + (b - a) + "입니다");
	} // main
	
} // end class