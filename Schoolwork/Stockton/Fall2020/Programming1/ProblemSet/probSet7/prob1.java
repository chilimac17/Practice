package probSet7;

import java.util.*;

public class prob1 {
/* ***************************************************************************************************
 * This program reads a sequence of N numbers from the user and stores in an Array. It computes the
 * following:
 * 
 * 				- Arithmetic Mean (AM)
 * 				- Geometric Mean  (GM)
 * 				- Harmonic Mean   (HM)
 * 
 * ***************************************************************************************************/	
			
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nEnter the size of the array:");
		int N = scan.nextInt();
		
		double[] Arr = new double[N];
		
		System.out.println("Enter " + N + " values:");
		
		
		for(int i = 0; i < Arr.length; i++) {
			
			Arr[i] = scan.nextDouble();			
			
		}
		
		System.out.println("Arithmetic mean = " + compAM(Arr));
		System.out.println("Geometric  mean = " + compGM(Arr));
		System.out.println("Hamonic    mean = " + compHM(Arr));
		
		scan.close();
		
	}
	
	private static double compAM(double A[]) {
		
		double sum = 0;
		
		for(int i = 0; i < A.length; i++) {
			
			sum = sum + A[i];
		}
		
		return sum/A.length;
	}
	
	private static double compGM(double A[]) {
		
		double prod = 1;
		
		for(int i = 0; i < A.length; i++) {
			
			prod *= A[i];
		}
		
		return Math.pow(prod, 1.0/A.length);
	}
	
	private static double compHM(double A[]) {
		
		double sum = 0;
		
		for(int i = 0; i < A.length; i++) {
			
			sum += 1/A[i];
		}
		
		return (A.length/sum);
	}

}
