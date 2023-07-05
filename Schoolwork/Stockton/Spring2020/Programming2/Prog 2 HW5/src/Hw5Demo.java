import java.util.Random;
import java.util.Scanner;

public class Hw5Demo {

	public static void main(String[] args) {
		ArraySum a1 = new ArraySum();
		Scanner scan = new Scanner(System.in);
		Random rng = new Random();
 		
		System.out.println("Please provide the size of the array:");
		int size = scan.nextInt();
		int[] array = new int[size];	
		
			for(int i = 0; i < array.length; i++) {
			array[i] = rng.nextInt(100) + 1;
			}
		
		a1.printArray(array);
		a1.arraySum(array);
		scan.close();
	}
}
