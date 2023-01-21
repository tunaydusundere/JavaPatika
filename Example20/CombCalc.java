package Example20;

import java.util.Scanner;

public class CombCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, numr, numb, tt = 1, ttr = 1, ttc = 1, result;
		System.out.println("Number-1: ");
		num = scan.nextInt();
		System.out.println("Number-2: ");
		numr = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			tt *= i;
		}
		for (int x = 1; x <= numr; x++) {
			ttr *= x;
		}
		numb = num - numr;

		for (int y = 1; y <= numb; y++) {
			ttc *= y;
		}
		result = (tt / (ttr * ttc));
		System.out.println("Combination: "+result);
	}

}
