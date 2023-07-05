import java.util.*;
public class ProbabilityBirthday {
	Random rng = new Random();
	int[] lineOfPeople = new int[20];
	private int days = 365;
	private int placeHolder;
	private int counter;
	
	//this method will generate birthdays for all the people in the line 
	public void generateBirthdays(int[] array) {
		for(int i = 0; i < array.length; i++) {
			placeHolder = 0;
			placeHolder = rng.nextInt(days) + 1;
			array[i] = placeHolder;
		}
	}
	//this method will compare birthdays of everyone in the line
	public int compareBdays(int[] lineArray){
		placeHolder = 0;
		counter = 0;
		for (int i = 0; i < lineArray.length; i++) {
		    for (int k = i + 1; k < lineArray.length; k++) {
		        if (lineArray[i] == lineArray[k]) {
		            counter++;
		        }
		    }
		}
		//System.out.println("\ncounter = " + counter);
		return counter;
	}
	//this will do the actual probability test 1000 times and get results 
	public double probabilityTest(int[] array1) {
		int counter1 = 0;	
		for(int i = 0; i < 1000; i++) {
			generateBirthdays(array1);	
			compareBdays(array1);
				counter1 += compareBdays(array1);
			}	
		double average = (counter1/(double)1000) * 100;	
		System.out.print("Your average after running 1000 times is " + average + "%");
			return average;
	}
	//this method will print all the elements in the array
		public void printArray(int[] inputArray) {
				
				for(int i = 0; i < inputArray.length; i++) {
					System.out.print(inputArray[i] + ",");
				}
			}
	
}
