package probSet7;

import java.util.Random;
import java.util.Scanner;

public class prob4 {
/* ***************************************************************************************************
 * This program generates a sequence of N random numbers and stores in an Array. It then computes the
 * following:
 * 
 * 				- Standard Deviation
 * 				- Mean Absolute Deviation
 * 				
 * 
 * ***************************************************************************************************/	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rng = new Random();
				
		System.out.println("\nProvide the array size please:");
		
		int N = scan.nextInt();
		
		double[] myArr = new double[N];double sum = 0;
		double[] temp = new double[N];
		
		for(int i = 0; i < myArr.length; i++) {
			
			myArr[i] = rng.nextDouble()*10 + 1;
		}
		
		double Mean = compAM(myArr);
		
		for(int i = 0; i < myArr.length; i++) {
			
			sum += Math.pow( (myArr[i] - Mean), 2);
			
			temp[i] = Math.abs(myArr[i] - Mean);
		}
		
		double sigma = Math.sqrt(sum/myArr.length);
		
		System.out.println("\nThe initialized array -->\n");
		
		System.out.print("[");
		for(int i = 0; i < myArr.length; i++) {
			System.out.print(myArr[i] + " ");
		}	
		System.out.print("]");
		
		System.out.println("\n\nStandard Deviation = " + sigma);
		System.out.println("\n\nMean Absolute Deviation = " + compAM(temp));
				
		scan.close();
		
	}
	
	private static double compAM(double A[]) {
		
		double sum = 0;
		
		for(int i = 0; i < A.length; i++) {
			
			sum = sum + A[i];
		}
		
		return sum/A.length;
	}	

}
