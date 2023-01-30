package Example30;


import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	      int n1=0,n2=1,n3,i,n;
	      System.out.print("Number :");
	      n = scan.nextInt();
		  for(i=2;i<n;++i)
		 {  
		  n3=n1+n2;  
		  System.out.print(", "+n3);  
		  n1=n2;  
		  n2=n3;  
		    }
		 }
	}


