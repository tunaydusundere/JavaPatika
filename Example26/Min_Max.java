package Example26;

import java.util.Iterator;
import java.util.Scanner;

public class Min_Max {

	public static void main(String[] args) {
		 int numberNumbers,numbers,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;

	        Scanner scan=new Scanner(System.in);

	        System.out.print("Kaç tane sayı gireceksiniz : ");
	        numberNumbers=scan.nextInt();

	        for (int i=1 ; i<=numberNumbers ; i++){
	            System.out.print(i+". Sayıyı giriniz : ");
	            numbers=scan.nextInt();
	            if(numbers < min){
	                min=numbers;
	            }
	            if(numbers > max){
	                max=numbers;
	            }
	        }

	        System.out.println("En Küçük Sayı : "  +  min);
	        System.out.println("En Büyük Sayı : "  +  max);

	}
     	

}
