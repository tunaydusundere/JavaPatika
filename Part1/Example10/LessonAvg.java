package Example10;

import java.util.Scanner;

public class LessonAvg {

	public static void main(String[] args) {
		int m, p, t, c, mm;
		Scanner scan = new Scanner(System.in);
		System.out.println("Math: ");
		m = scan.nextInt();
		System.out.println("Physic: ");
		p = scan.nextInt();
		System.out.println("Turkish: ");
		t = scan.nextInt();
		System.out.println("Chemistry: ");
		c = scan.nextInt();
		System.out.println("Music: ");
		mm = scan.nextInt();
		double avg = (m + p + t + c + mm) / 5;
		if ((m < 0 || m > 100) || (p < 0) || (p > 100) || (t < 0 || t > 100) || (c < 0 || c > 100)
				|| (mm < 0 || mm > 100)) {
			System.out.println("Error!");
			return;
		}
		if (avg < 55) {
			System.out.println("Failed!");

		} else {
			System.out.println("Passed!");
		}
	}

}
