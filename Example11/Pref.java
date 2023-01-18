package Example11;

import java.util.Scanner;

public class Pref {

	public static void main(String[] args) {
		
		 
		        int pref;

		        Scanner scan=new Scanner(System.in);
		        System.out.print("Sıcaklık durumunu giriniz : ");
		        pref=scan.nextInt();

		        if (pref>25)
		            System.out.println("Yüzme");
		        else if (pref>=15)
		            System.out.println("Piknik");
		        else if (pref>= 5)
		            System.out.println("Sinemaya");
		        else
		            System.out.println("Kayak");

	}
	}
		
