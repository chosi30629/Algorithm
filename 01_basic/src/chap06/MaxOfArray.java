package chap06;


import java.util.Scanner;

/**
 * 배열 요소의 최댓값 구하는 메소드
 * @author choseongil
 *
 */
public class MaxOfArray {

	static int maxOf(int[] a) {
		int max = a[0];
		
		for (int i = 1; i < a.length; i ++) {
			if (a[i] > max) {
				max = a[i];
			} // if
		} // for
		
		return max;
	} // maxOf
	
	public static void main(String[] args) {
		Scanner stdId = new Scanner(System.in);
		
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		
		int num = stdId.nextInt();
		
		int[] height = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("height[" + i + "] : ");
			height[i] = stdId.nextInt();
		} // for
		
		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
	} // main
	
} // end class