package Example21;

import java.util.Scanner;

public class PowerCalc {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		int num,nump,total=1;
		System.out.println("Number : ");
		num=scan.nextInt();
		System.out.println("Power : ");
		nump=scan.nextInt();
		
		for (int x=1; x<=nump; x++ ) {
		total*=num;
		}
		System.out.println("Result: "+total);
	}

}
