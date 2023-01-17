package Example2;

import java.util.Scanner;

public class KDVCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount: ");
		double amount =scan.nextDouble();
		if (amount<=1000 & amount >=0) {
			double kdv=0.18;
			double result=(amount*kdv)+amount;
			System.out.println("Total: "+result);
			System.out.println("Total KDV: "+amount*kdv);
			System.out.println("KDV: "+kdv);
		}
		else {
			double kdv=0.08;
			double result=(amount*kdv)+amount;
			System.out.println("Total: "+result);
			System.out.println("Total KDV: "+amount*kdv);
			System.out.println("KDV: "+kdv);
		}
	}

}
