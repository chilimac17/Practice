package probSet7;

import java.util.*;

public class prob5 {
/* *****************************************************************************************************
 * This program populates N random numbers from 1 to 100 in an Array. It then searches for a number that 
 * is provided by the user, in the array. 
 * *****************************************************************************************************/	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Random rng = new Random();
		
		boolean flag = true;
		
		System.out.println("\nPlase provide the size of the array:");
		
		int N = scan.nextInt();
		
		int[] A = new int[N];
		
		for(int i = 0; i < A.length; i++) {
			
			A[i] = rng.nextInt(100) + 1;
		}
		
		System.out.println("Please provide a number to search:");
		
		int num = scan.nextInt();
		
		System.out.println("Below are the elements in the array -->");
		
		for(int i = 0; i < A.length; i++) {
			
			System.out.print(A[i] + " ");
		}
		
		System.out.println("\n\nSearching for the element -->\n");
		
		for(int i = 0; i < A.length; i++) {
			
			if(A[i] == num) {
				
				if(flag) {
					
					flag = false;
				}	
				System.out.println(i + 1);
			}
		}
		
		if(flag) {
			
			System.out.println("The element " + num + " was not found in the array.");
		}
		
		
		scan.close();
		
		
	}

}
