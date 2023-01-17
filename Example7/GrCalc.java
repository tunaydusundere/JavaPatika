package Example7;

import java.util.Scanner;

public class GrCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a=2.14;
		double e=3.67;
		double d=1.11;
		double m=0.95;
		double p=5;
		double total;
	   System.out.println("Armut Kaç Kilo ? :");
	   double pr =scan.nextDouble();
	   System.out.println("Elma Kaç Kilo ? :");
	   double ap =scan.nextDouble();
	   System.out.println("Domates Kaç Kilo ? :");
	   double to =scan.nextDouble();
	   System.out.println("Muz Kaç Kilo ? :");
	   double ba =scan.nextDouble();
	   System.out.println("Patlıcan Kaç Kilo ? :");
	   double eg =scan.nextDouble();
	   total=(pr*a)+(ap*e)+(to*d)*(ba*m)+(eg*p);
	   System.out.println("Total : "+total+" TL");
		
		

	}

}
