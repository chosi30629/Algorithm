package chap01;

import java.util.Scanner;


/**
 * 세 값의 최댓값
 * @author choseongil
 * 알고리즘 : 문제를 해결하기 위한 것으로, 명확하게 정의되고 순서가 있는 유한 개의 규칙으로 이루어진 집합
 *
 */
public class Max3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		
		System.out.println("세 정수의 최댓값을 구합니다.");
		
		System.out.print("a의 값 : ");
		int a = stdIn.nextInt();
		
		System.out.print("b의 값 : ");
		int b = stdIn.nextInt();
		
		System.out.print("c의 값 : ");
		int c = stdIn.nextInt();
		
		int max = a;
		
		if (b > max) {
			max = b;
		} // if
		
		if (c > max) {
			max = c;
		} // if
		
		System.out.println("최댓값은 " + max + "입니다.");
	} // main
	
} // end class