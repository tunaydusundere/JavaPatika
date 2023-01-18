package Example8;

import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
    int n1,n2,select; 
    
    Scanner scan=new Scanner(System.in);
     System.out.println("First Number: ");
    n1=scan.nextInt();
     System.out.println("Second Number: ");
    n2=scan.nextInt();
     System.out.println("1-)Sum\n2-)Substract\n3-)Multiple\n4-)Divide");
    select=scan.nextInt();
  
    switch (select) {
	case 1: {	
     System.out.println("Result: "+(n1+n2));	
	     break;
	    }
	case 2: {	
	     System.out.println("Result: "+(n1-n2));	
	     break;
		}
	case 3: {	
	     System.out.println("Result: "+(n1*n2));	
         break;  		
	    }
	case 4: {	
	     System.out.println("Result: "+(n1/n2));	
		break;
	    }
	default:
		System.out.println("Error!");
	}
	
	
	
	}	
}
