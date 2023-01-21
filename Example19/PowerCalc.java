package Example19;

import java.util.Scanner;

public class PowerCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number,counter=0;
		System.out.println("Max Number : ");
		number=scan.nextInt();
		for (int i = 1; i <=number; i*=4) {
		System.out.println("4 power "+counter+" equal "+i);
		counter++;
		}
		counter=0;
        for (int x = 1; x <=number; x*=5) {	
			System.out.println("5 power "+counter+" equal "+x);
			counter++;
			}
	}

}
