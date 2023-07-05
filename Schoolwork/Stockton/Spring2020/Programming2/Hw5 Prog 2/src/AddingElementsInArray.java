import java.util.Random;
import java.util.Scanner;

public class AddingElementsInArray {
	//this method will print the array
	public void printArray(int[] inputArray) {
		System.out.println("This is your array with the size you proveded\n Also all the random integeters that filled it");
		for(int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i]);
			}
		}
	//this is the recursion method that passes an array 
	static int findSum(int A[], int b) 
    { 
        if (b <= 0) 
            return 0; 
        return (findSum(A, b - 1) + A[b - 1]); 
    } 
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rng = new Random();
		AddingElementsInArray add = new AddingElementsInArray();
 		
		System.out.println("Please provide the size of the array:");
		int size = scan.nextInt();
		int[] array = new int[size];	
		
		for(int i = 0; i < array.length; i++) {
			array[i] = rng.nextInt(100) + 1;
			}
		add.printArray(array);
		
		System.out.println("The sum of the array using recursion is " + findSum(array,array.length));
		
	}
	
}
