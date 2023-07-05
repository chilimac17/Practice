import java.util.*;
public class ExtraCreditProb1 {
	
	private void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	private void printArrayChar(char[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	private void addElements(int[] array) {
		Random rng = new Random();
		for(int i = 0; i < array.length; i++) {
			array[i] = rng.nextInt(25);
		}
	}
	private void convertToChar(int[] array,char[] charArray){
		for(int i = 0; i < array.length; i++) {
			array[i] = array[i] + 65;
			charArray[i] = (char)array[i]; 
		}
	}
	public static void main(String[] args) {
		ExtraCreditProb1 p1 = new ExtraCreditProb1();
		Random rng = new Random();
		int N = rng.nextInt(50) + 1;
		int[] Arr = new int[N];
		char[] chArr = new char[N];
		p1.addElements(Arr);
		System.out.println("Random Array");
		p1.printArray(Arr);
		
		p1.convertToChar(Arr,chArr);
		System.out.println("\nConvert to characters");
		p1.printArrayChar(chArr);
		
		
		
	}

}
