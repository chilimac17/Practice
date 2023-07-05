import java.util.ArrayList;
import java.util.*;

public class Integers {
	ArrayList<Integer> intList = new ArrayList<Integer>();
	
	public double getMean() {
		int sum = 0;
		int count = 0;
		for(int i =0; i < intList.size(); i++) {
			sum = sum + intList.get(i);
			count++;
		}
		sum = sum / count;
		System.out.println("The mean of your list is " + sum);
		return sum;
	}
	
	public void printArrayList() {
		for(int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
	}
	
	public void addInt() {
		Scanner scan = new Scanner(System.in);
		int m = 1;
		while(m != 0) {
			System.out.print("Enter as many numbers into the Arraylist enter zero to end it and get the mean of everything in the Arraylist"); 
			m = scan.nextInt();
			 if(m == 0) break;
		intList.add(m);
			
		}
	}
	
	public static void main(String[] args) {
		Integers i1 = new Integers();
		
		i1.addInt();
		i1.printArrayList();
		i1.getMean();
		
		
		
		
		
	}

}
