package Example29;

import java.util.Iterator;
import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
	for (int i = 2; i <=100; i++) {
		int count=0;
		for (int k = 1; k <=i; k++) {
			if (i%k==0) {
				count++;
	  }
		}
		    if (count<=2) {
		System.out.print(i+" ");
		}		
	  }
	}
 }
