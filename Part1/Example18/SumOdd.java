package Example18;

import java.util.Scanner;

public class SumOdd {

	public static void main(String[] args) {
		int n ;
		Scanner scan = new Scanner(System.in);
		int total=0;
		do {
			System.out.println("Number: ");
			n=scan.nextInt();
			if (n%2==1) {
				break;
			}else if((n%2==0)&&(n%4==0)) {
			total+=n;
		}
		} while (n%2==0);
		  System.out.println(total);
          }

}
