package Example28;

import java.util.Iterator;
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Number of Digits : ");
		int num = scan.nextInt();
		int k;
		for (int i = num; i >= 1; i--) {
			for (int x = 1; x <= (num - i + 1); x++) {

			System.out.print(" ");
			}
			for (k = 1; k <= (2 * i - 1); k++) {
			System.out.print("*");
			
			}
			System.out.println(" "+(k-1));
            
		}
	}

}
