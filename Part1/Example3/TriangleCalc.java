package Example3;

import java.util.Scanner;

public class TriangleCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = 0;
		while (q != 2) {
			System.out.println("1-Hypotenuse Calculator");
			System.out.println("2-Perimeter and Area Calculator");
			q=scan.nextInt();
			if (q==1) {
				System.out.println("A: ");
				int a = scan.nextInt();
				System.out.println("B: ");
				int b = scan.nextInt();
				System.out.println("C: ");
				int c = scan.nextInt();
				int u = (a+b+c)/2;
				int total = 2*u;
				System.out.println("Perimeter of Triangle: "+total);
				double area =Math.sqrt(u*((u-a)*(u-b)*(u-c)));
                System.out.println("Area of Triangle: "+area);			
			}
			else if (q==2) {
				System.out.println("A: ");
				int x=scan.nextInt();
				System.out.println("B: ");
				int y=scan.nextInt();
				double z =Math.sqrt((x*x)+(y*y));
				System.out.println("Hypotenuse");
			}
		
		}
		
		}
	}



