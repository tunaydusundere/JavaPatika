package Example12;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
	int x,y,z;
	int small,middle,large;
	Scanner scan = new Scanner(System.in);
	System.out.println("First Number: ");
	x=scan.nextInt();
	System.out.println("Second Number: ");
	y=scan.nextInt();
	System.out.println("Third Number: ");
	z=scan.nextInt();
	if( x < y )
	{
	    if( z < x )
	    {
	        small = z;
	        middle = x;
	        large = y;
	    }
	    else
	    {
	        small = x;
	        if( y < z )
	        {
	            middle = y;
	            large = z;
	        }
	        else
	        {
	            middle = z;
	            large = y;
	        }
	    }
	}
	else
	{
	    if( z < y )
	    {
	        small = z;
	        middle = y;
	        large = x;
	    }
	    else
	    {
	        small = y;
	        if( x < z )
	        {
	            middle = x;
	            large = z;
	        }
	        else
	        {
	            middle = z;
	            large = x;
	        }
	    }
	}
System.out.println(small+">"+middle+">"+large);
	}
	}
