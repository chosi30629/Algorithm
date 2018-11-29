package chap06;

import java.util.Random;
import java.util.Scanner;


/**
 * 난수 사용
 * @author choseongil
 *
 */
public class MaxOfArrayRand2 {

		static int maxOf(int[] a) {
			int max = a[0];
			
			
			for (int i = 1; i < a.length; i++) {
				if (a[i] > max) {
					max = a[i];
				} // if
			} // for
			
			return max;
		} // maxOf
	
		public static void main(String[] args) {
			Random rand = new Random();
			
			
			System.out.println("키의 최댓값을 구합니다.");
			int num = rand.nextInt(10) + 1;
			
			int[] height = new int[num];
			
			System.out.println("사람수는 " + num + "명입니다.");
			System.out.println("키 값은 아래와 같습니다.");
			
			for (int i = 0; i < num; i++) {
				height[i] = 100 + rand.nextInt(90);
				System.out.println("height[" + i + "] : " + height[i]);
			} // for
			
			System.out.println("최댓값은 " + maxOf(height) + "입니다.");
		} // main
	
} // end class