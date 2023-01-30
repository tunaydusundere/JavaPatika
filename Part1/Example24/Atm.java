package Example24;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
	       Scanner scan = new Scanner(System.in);
	        String userName = "admin";
	        String pass = "123";
	        int balance = 1500;
	        int select;
	        int control = 0;
	        do {
	            System.out.println("Kullanıcı Adınız :");
	            String user = scan.nextLine();
	            System.out.println("Şifreniz :");
	            String password = scan.nextLine();

	            if (user.equals(userName) && password.equals(pass)) {
	                do {
	                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz :\n"
	                            + "1-Para Yatırma\n"
	                            + "2-Para Çekme\n"
	                            + "3-Bakiye Sorgula\n"
	                            + "4-Çıkış Yap");
	                    select = scan.nextInt();
	                    switch (select) {

	                        case 1:
	                        	System.out.println("Yatırmak istediğiniz miktarı giriniz :");
	                            int amount = scan.nextInt();
	                            balance += amount;
	                            break;
	                        	
	                        case 2:
	                        	 System.out.println("Para Miktarı : ");
		                            int amount2 = scan.nextInt();
		                            if (balance > amount2)
		                                balance -= amount2;
		                            else System.out.println("Yetersiz Bakiye !");
		                            break;
	                        	
	                        case 3:
	                        	System.out.println("Bakiyeniz : " + balance);
	                            break;
	                        case 4:
	                            System.out.println("Tekrar görüşmek üzere !");
	                            break;
	                    }
	                } while (!(select == 4));
	                break;
	            } else {
	                System.out.println("Hatalı kullanıcı adı veya şifre.Tekrar deneyiniz.");
	                control++;
	                if (control == 3) 
	                	System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
	            }
	        } while (!(control == 3));
	    }	
}


