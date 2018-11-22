package chap04;


import java.util.Scanner;

/**
 * 입력한 수를 한 변으로 하는 정사각형을 * 기호로 출력
 * @author choseongil
 *
 */
public class Square {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		
		System.out.println("정사각형 모양으로 나타냅니다.");
		
		do {
			System.out.print("단수는 : ");
			n = stdIn.nextInt();
		} while (n < 0);
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			} // inner-for
			
			System.out.println();
		} // outer-for
	} // main
	
} // end class
