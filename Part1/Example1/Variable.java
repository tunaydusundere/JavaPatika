package Example1;

import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		int m,f,k,t,tt,mz;
		Scanner scan = new Scanner(System.in);
		System.out.println("Math Result: ");
		m=scan.nextInt();
		System.out.println("Physic Result: ");
		f=scan.nextInt();
		System.out.println("Chemistry Result: ");
		k=scan.nextInt();
		System.out.println("Turkish Result: ");
		t=scan.nextInt();
		System.out.println("History Result: ");
		tt=scan.nextInt();
		System.out.println("Music Result: ");
		mz=scan.nextInt();
		
		int avg=(m+f+k+t+tt+mz)/6;
		System.out.println(avg>=60? "Passed!":"Failed!");
			
				
	}

}
