package Example6;

import java.util.Scanner;

public class BodyIndex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("L: ");
		double b = scan.nextDouble();
		System.out.println("K: ");
		double k = scan.nextDouble();
		double total=k/(b*b);
		System.out.println("Body Mass ındex: "+total);

	}

}
