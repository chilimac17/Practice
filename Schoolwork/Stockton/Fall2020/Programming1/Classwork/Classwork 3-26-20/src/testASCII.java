import java.util.Scanner;
public class testASCII {
	//each character has a corresponding ASCII value 
	
	//this method prints out the ASCII starts at 65 prints out A-->Z upper case 
	public static void aSCII() {
		for(int i = 65; i <= 90; i++  ) {
			System.out.println((char)i);
		}
	}
	//this method prints out the ASCII starts at 97 prints out a-->z lower case 
	public static void aSCIILow() {
		for(int i = 97; i <= 122; i++  ) {
			System.out.println((char)i);
		}
	}
	//this prints out all the numbers from 65 --> 90
	public static void aSCIINum() {
		for(char ch = 'A' ; ch <= 'Z' ; ch++  ) {
			System.out.println((int)ch);
		}
	}
	//prints whatever character you pass through in lower case 
	private static char toLower(char ch) {
		if(ch >= 'A' && ch <= 'Z' ) {
			return ((char) ( (ch - 'A') + 'a'));
		}
		return ch;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//this will take a user input of whatever word and print out the character at position 0
		System.out.println("Please enter some text");
		char ch = scan.next().charAt(0);
		System.out.println(ch);
		scan.close();
		
		
		
	}
}
