package Example5;

import java.util.Scanner;

public class CircleCalc {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		/*System.out.println("Enter the radius: ");
		int r = scan.nextInt();
		double area=pi*r*r;
		double per=(2*pi*r);
		System.out.println("Circle area: "+area+"\nCircle perimeter: "+per);
		*/
		double pi=3.14;
		System.out.println("Enter the radius: ");
		int r = scan.nextInt();
		System.out.println("Enter the angle: ");
		int a = scan.nextInt();
		double area=(pi*r*r);
		double result = (area*a)/360;
		System.out.println("Result: "+result);
		

	}

}
