package chap04;


/**
 * 곱셈표
 * @author choseongil
 *
 */
public class Multi99TableEx {
	
	public static void main(String[] args) {
		/*
		for (int i = 1; i <= 9; i++) {
			if (i == 1) {
				System.out.print("   |");
				
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%3d", i * j);
				} // inner-for
				
				System.out.println();
				System.out.println("---+---------------------------");
			} // if
			
			for (int j = 1; j <= 9; j++) {
				if (i == (i * j)) {
					System.out.printf("%2d", i);
					System.out.print(" |");
				} // if
				
				System.out.printf("%3d", i * j);
			} // inner-for
			System.out.println();
		} // outer-for
		*/
		
		System.out.print("   |");
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%3d", i);
		} // for
		
		System.out.println("\n---+---------------------------");
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%2d |", i);
			
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i * j);
			} // inner-for
			
			System.out.println();
		} // outer-for
	} // main
	
} // end class