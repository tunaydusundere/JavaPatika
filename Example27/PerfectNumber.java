package Example27;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		int total = 0;
		do {
		System.out.println("Number :");
	    num = scan.nextInt();
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
	        total+=i;
			}
		}	
		if (total==num) {
			System.out.println(num+" is a perfect number!");	
		}else {
			System.out.println(num+" is not a perfect number!");
		}
		}while(!(num==0));		
	}
}