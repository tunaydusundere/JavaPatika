package Example17;

import java.util.Scanner;

public class LoopEven {

	public static void main(String[] args) {
		int sum = 0;
		int counter = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Max Number : ");
		int num = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			if ((i % 3 == 0) && (i % 4 == 0)) {
				sum += i;
				counter++;
			}
		}
		System.out.println(sum / counter);
	}

}
