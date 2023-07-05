import java.util.Scanner;
import java.util.Random;

public class prob5 { 
/*****************************************************************************************	
/*	This program swaps the content of two variables x and y, provided by the user as
	inputs to the program. */
/****************************************************************************************/	
	
	public static void main(String[] args) { 

		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nEnter the value of x: ");
		int x = scan.nextInt();

		System.out.println("\nEnter the value of y: ");
		int y = scan.nextInt();		
		
		System.out.println("\nBefore swap, x = " + x + ", y = " + y);
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("\nAfter swap, x = " + x + ", y = " + y);

	}	


}

