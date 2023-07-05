package probSet7;

import java.util.*;

public class prob2 {
/* ***************************************************************************************************
 * This program initializes an array of size N with random numbers from 0  to 1. It then computes the
 * sum of the maximum and minimum value in the Array.
 * ***************************************************************************************************/	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Random rng   = new Random();
		
		System.out.println("\nEnter the size of the array:");
		int N		 = scan.nextInt();
		
		double[] A   = new double[N];
		
		for(int i = 0; i < A.length; i++) {
			
			A[i] = rng.nextDouble();
		}
		System.out.println("\nThe initialized array -->\n");
		
		System.out.print("[");
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}	
		System.out.print("]");
		double sum = max(A) + min(A);
		
		System.out.println("\n\n\nSum of maximum and minimum numbers in the array = " + sum);
		
		scan.close();
		
	}
	
	private static double max(double Arr[]) {
		
		double Max = Arr[0];
		
		for(int i = 1; i < Arr.length; i++) {
			
			if(Arr[i] > Max) {
				
				Max = Arr[i];
			}
		}
		
		return Max;
	}
	
	private static double min(double Arr[]) {
		
		double Min = Arr[0];
		
		for(int i = 1; i < Arr.length; i++) {
			
			if(Arr[i] < Min) {
				
				Min = Arr[i];
			}
		}
		
		return Min;
	}

}
