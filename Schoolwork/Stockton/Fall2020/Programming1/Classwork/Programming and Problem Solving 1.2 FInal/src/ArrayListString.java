import java.util.*;
public class ArrayListString {
	
	
	public void storeStringLength(ArrayList<String> ar, int[] s) {
		for(int i = 0; i < ar.size(); i++) {
			int stringSize = ((String) ar.get(i)).length();
			s[i] = stringSize;
		}
	}
	
	public void printArrayList(ArrayList<String> arrayList) {
		for(int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}	
	}
	
	private void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public void addString(ArrayList<String> arrayList) {
		Scanner scan = new Scanner(System.in);
		String s = "hi";
		while(s != " ") {
			System.out.print("Enter as many words into the Arraylist. \n When finished press enter "); 
			s = scan.nextLine();
			 if(s.length() == 0) break;
			 arrayList.add(s);
		}
	}
	public void displaySmallestString(int[] array, ArrayList<String> arrayList) {
		int numString = array[0];
		ArrayList<Integer> smallList = new ArrayList<Integer>();
		
		for(int i = 0; i < array.length; i++) {
			if(numString > array[i]) {
				numString = array[i];
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			if(numString == array[i]) {
				smallList.add(i);
			}
		}
		for(int i = 0; i < smallList.size(); i++) {
			System.out.println("The smallest string " + arrayList.get(smallList.get(i)) + " at position " + smallList.get(i));
		}
		
	}
	public static void main(String[] args) {
		ArrayListString s1 = new ArrayListString();
		ArrayList<String> stringList = new ArrayList<String>();
		
		s1.addString(stringList);
		System.out.println("These are all the strings in the arraylist");
		s1.printArrayList(stringList);
		System.out.println(" ");
		int[] sLength = new int[stringList.size()];
		s1.storeStringLength(stringList, sLength);
		System.out.println("These are the length of the strings in the arraylist");
		//s1.printArray(sLength);
		System.out.println(" ");
		s1.displaySmallestString(sLength, stringList);
		
		s1.printArray(sLength);
		
		
		
	}
}
