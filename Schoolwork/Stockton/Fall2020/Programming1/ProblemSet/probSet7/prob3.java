package probSet7;
import java.util.*;

public class prob3 {
/* ***************************************************************************************************
 * This program initializes an array of size N with random numbers from 1 to 10. It then computes the
 * alternating sum of elements in the Array.
 * ***************************************************************************************************/	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rng = new Random();
				
		System.out.println("\nProvide the array size please:");
		
		int N = scan.nextInt();
		
		int[] myArr = new int[N];double sum = 0;
		
		for(int i = 0; i < myArr.length; i++) {
			
			myArr[i] = rng.nextInt(10) + 1;
		}
		
		for(int i = 0; i < myArr.length; i++) {
			
			sum += Math.pow(-1, i) * myArr[i];
		}
		
		System.out.println("\nThe initialized array -->\n");
		
		System.out.print("[");
		for(int i = 0; i < myArr.length; i++) {
			System.out.print(myArr[i] + " ");
		}	
		System.out.print("]");
		
		System.out.println("\n\nSum = " + sum);
		
		scan.close();
		
	}

}
