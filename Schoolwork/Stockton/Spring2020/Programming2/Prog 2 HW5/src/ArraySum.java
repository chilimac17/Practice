
public class ArraySum {
	int total = 0;
	
	//this method will add up all the numbers that populate the array
	public int arraySum(int[] arrayAdd) {
		for(int i = 0; i < arrayAdd.length; i++) {
			total = total + arrayAdd[i];
		}
		System.out.println("The sum of all the integers in your array is " + total);
		return total;
	}
	//this method will print all the elements in the array
	public void printArray(int[] inputArray) {
		System.out.println("This is your array with the size you proveded\n Also all the random integeters that filled it");
		for(int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i]);
		}
	}
	
}
