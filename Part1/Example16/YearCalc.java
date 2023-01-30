package Example16;

import java.util.Scanner;

public class YearCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year;
		System.out.println("Yıl Giriniz : ");
		year = scan.nextInt();
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " bir artık yıldır !");
				} else
					System.out.println(year + " bir artık yıl değildir !");
			}
		}
	}

}
