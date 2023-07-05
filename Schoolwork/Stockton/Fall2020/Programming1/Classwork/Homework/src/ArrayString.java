import java.util.*;
//
public class ArrayString {
	public static final int MAXSIZE = 100;
	public static final String SENTINEL = "";
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] str = new String[MAXSIZE];
		int count = 0;
		
		System.out.println("Enter as many words as you want. \nThey will be stored in an array.");
		System.out.print("Enter no text to stop");
		
		while(true) {
			System.out.println("\nType some text:");
			String line = scan.nextLine();
			if(line.equals(SENTINEL)) break;
			str[count++] = line;
			
		}
		System.out.println("\nElements stored in the array:\n");
		for(int i = 0; i < count; i++) {
			System.out.println(str[i]);
		}
		scan.close();
	}
}
