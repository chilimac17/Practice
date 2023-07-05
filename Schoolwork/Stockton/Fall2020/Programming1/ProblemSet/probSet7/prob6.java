package probSet7;

import java.util.Random;
import java.util.Scanner;

public class prob6 {
/* **********************************************************************************************************
 * This program creates an array of Rectangle objects and computes the area, perimeter and length of diagonal
 * of each object of type Rectangle in the array. It also indicates if the Rectangle is a square. 
 * *****************************************************************************************************/	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rng = new Random();
				
		System.out.println("\nProvide the array size please:");
		
		int N = scan.nextInt();
		
		Rectangle[] R = new Rectangle[N];
		
		for(int i = 0; i < R.length; i++) {
			
			int h = rng.nextInt(10) + 1;
			int w = rng.nextInt(10) + 1;
			
			R[i] = new Rectangle(h, w);
		}
		
		System.out.println("\n\nBelow are details about the Rectangle objects:");
		
		for(int i = 0; i < R.length; i++) {
			System.out.println();
			System.out.println("Rectangle - " + (i + 1));
			System.out.println("------------");
			
			System.out.println("Height = " + R[i].getHeight());
			System.out.println("Width = " + R[i].getWidth());
			System.out.println("Area = " + R[i].calcArea());
			System.out.println("Perimeter = " + R[i].calcPerim());
			System.out.println("Diagonal = " + R[i].lengthOfDiag());
			System.out.println("Is a square = " + R[i].isASquare());
		}
		
		scan.close();
		
		
	}

}
