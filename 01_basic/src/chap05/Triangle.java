package chap05;

import java.util.Scanner;

/**
 * 직각 이등변 삼각형을 출력
 * @author choseongil
 *
 */
public class Triangle {

	static void triangleLB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			} // inner for
			System.out.println();
		} // outer for
	} // triangleLB
	
	static void triangleLU(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("*");
			} // inner for
			System.out.println();
		} // outer for
	} // triangleLU
	
	static void triangleRU(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			} // inner for
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("*");
			} // inner for
			System.out.println();
		} // outer for
	} // triangleRU
	
	static void triangleRB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			} // inner for
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			} // inner for
			System.out.println();
		} // outer for
	} // triangleRB
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("삼각형 모양으로 나타냅니다.");
		
		do {
			System.out.println("단수는? : ");
			n = stdIn.nextInt();
		} while (n <= 0);

//		System.out.println("왼쪽 아래가 직각인 삼각형");
//		triangleLB(n);
		
//		System.out.println("왼쪽 위가 직각인 삼각형");
//		triangleLU(n); // 왼쪽 위가 직각인 이등변삼각형

//		System.out.println("오른쪽 위가 직각인 삼각형");
//		triangleRU(n); // 오른쪽 위가 직각인 이등변삼각형

		System.out.println("오른쪽 아래가 직각인 삼각형");
		triangleRB(n); // 오른쪽 아래가 직각인 이등변삼각형
	} // main
	
} // end class