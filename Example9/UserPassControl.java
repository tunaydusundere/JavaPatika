package Example9;

import java.util.Scanner;

public class UserPassControl {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String user = "admin", pass = "123", username, password, npass = null;
		System.out.println("Username: ");
		username = scan.nextLine();
		System.out.println("Password: ");
		password = scan.nextLine();
		if (username.equals(user) && password.equals(pass)) {
			System.out.println("Welcome: " + username);
		} else {
			System.out.println("Yanlış şifre girdiniz!\nŞifrenizi sıfırlamak ister misiniz ? Y/N: ");
		}
		String ans = scan.nextLine();
		if (ans.equals("Y") || ans.equals("y")) {
			System.out.println("Yeni şifre: ");
			npass = scan.nextLine();
			if (npass.equals(pass)) {
				System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz.");
			} else {
				System.out.println("Şifre oluşturuldu.");
			}
		} else {
			System.out.println("Giriş başarısız!");
		}
	}
}