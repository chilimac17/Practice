import java.util.*;
//
public class ArrayNumFinder {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rng = new Random();
		boolean f = true;
		
		System.out.println("Please provide the size of the array:");
		int size = scan.nextInt();
		int[] array = new int[size];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = rng.nextInt(50) + 1;
		}
		
		System.out.println("Please provide a number to search:");
		int num = scan.nextInt();
		System.out.println("Below are the elements in the array");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println("\n\nThe number can be found in elements");
		for(int i = 0; i < array.length; i++) {
			if(array[i] == num) {
				if(f) {
					f = false;
				}	
				System.out.println(i + 1);
			}
		}
		
		if(f) {
			System.out.println("The element " + num + " was not found in the array.");
		}
		scan.close();
	}
}
