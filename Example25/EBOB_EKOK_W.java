package Example25;

import java.util.Scanner;

public class EBOB_EKOK_W {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("First Number : ");
		int n1 = scan.nextInt();
		System.out.println("Second Number : ");
		int n2 = scan.nextInt();
		int i = 1;
		int ebob=1;
		while(i <= n1) {
			i++;
			if (n1%i==0 && n2%i==0) {
				ebob=i;
			}
		}
		System.out.println("EBOB : "+ebob);
		System.out.println("EKOK : "+(n1*n2)/ebob);
	}

}
