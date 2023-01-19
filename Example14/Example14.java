package Example14;

import java.util.Scanner;

public class Example14 {

	public static void main(String[] args) {
		        int distance,age,type;
		        double perDistanceKm = 0.10, discountAge12 = 0.5, discountAge24 = 0.9, discountAge65 = 0.7, discountType = 0.8, ticketPrice = 0;
		         Scanner scanner = new Scanner(System.in);

		        System.out.print("Mesafeyi km türünden giriniz : ");
		        distance = scanner.nextInt();

		        System.out.print("Yaşınızı giriniz : ");
		        age = scanner.nextInt();

		        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş : ");
		        type = scanner.nextInt();

		 
		        if (distance > 0 && age > 0 && (type == 1 || type == 2)) {

		            ticketPrice = perDistanceKm * distance;

		            if (age <= 24) {
		                if (age < 12) {
		                    ticketPrice *= discountAge12;
		                } else
		                    ticketPrice *= discountAge24;
		            } else if (age > 65) {
		             ticketPrice *= discountAge65;
		            }
		            if (type == 2)
		                ticketPrice = 2 * ticketPrice * type;

		        } else
		            System.err.println("Hata!");
	
		        System.out.println("Toplam Tutar : " + ticketPrice + " TL");


		    }
		}
	

