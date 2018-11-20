package chap02;

import java.util.Scanner;

/**
 * �� ���� �߾Ӱ�
 * @author choseongil
 *
 */
public class Med3 {
	
	static int med3(int a, int b, int c) {
		if (a >= b) {
			if (b >= c) {
				return b;
			} else if (a <= c) {
				return a;
			} else {
				return c;
			} // inner else-if
		} else if (a > c) {
			return a;
		} else if (b > c) {
			return c;
		} else {
			return b;
		} // outer else-if
	} // med3
	
	/*
	���� med3 �� ���� med3 �� ȿ���� ��
		- ���� ó���� if���� �Ǵ�
			if ((b >= a && c<= a) || (b <= a && c >= a)) �� �ָ��Ѵ�. 
			���⼭ b >= a �� b <= a�� �Ǵ��� ������ �Ǵ�(���������� ���� �Ǵ�)�� �̾����� else ������ else if ((a > b && c < b) || (b <= a && c > b))���� �����Ѵ�. 
			�ᱹ ���� ó���� if�� ������ ��� 2 ��°�� if������ (����������)���� �Ǵ��� �����ϹǷ� ȿ���� ��������.
		
	static int med3 (int a, int b, int c) {
		if ((b >= a && c <= a) || (b <= a && c >= a)) {
			return a;
		} else if ((a > b && c < b) || (a < b && c > b)) {
			return b;
		} // if-else 

		return c;
	} // med3
	*/
	
	public static void main(String[] args) {
		System.out.println("med3(3, 2, 1) = " + med3(3, 2, 1));
		System.out.println("med3(3, 2, 2) = " + med3(3, 2, 2));
		System.out.println("med3(3, 1, 2) = " + med3(3, 1, 2));
		System.out.println("med3(3, 2, 3) = " + med3(3, 2, 3));
		System.out.println("med3(2, 1, 3) = " + med3(2, 1, 3));
		System.out.println("med3(3, 3, 2) = " + med3(3, 3, 2));
		System.out.println("med3(3, 3, 3) = " + med3(3, 3, 3));
		System.out.println("med3(2, 2, 3) = " + med3(2, 2, 3));
		System.out.println("med3(2, 3, 1) = " + med3(2, 3, 1));
		System.out.println("med3(2, 3, 2) = " + med3(2, 3, 2));
		System.out.println("med3(1, 3, 2) = " + med3(1, 3, 2));
		System.out.println("med3(2, 3, 3) = " + med3(2, 3, 3));
		System.out.println("med3(1, 2, 3) = " + med3(1, 2, 3));
	} // main
	
} // end class
