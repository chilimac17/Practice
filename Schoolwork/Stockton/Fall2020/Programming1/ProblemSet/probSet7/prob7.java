package probSet7;

import java.util.*;

public class prob7 {
/* *******************************************************************************************************
 * This program creates an array of String objects of MAXSIZE = 500 and adds Strings provided by the user
 * until the user enters the empty String. It then displays all the Strings stored in the array. 
 * *****************************************************************************************************/	
	private static final String SENTINEL = "";
	private static final int MAXSIZE = 500;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] str = new String[MAXSIZE];
		int count = 0;
		
		while(true) {
			
			System.out.println("Type some text:");
			
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
