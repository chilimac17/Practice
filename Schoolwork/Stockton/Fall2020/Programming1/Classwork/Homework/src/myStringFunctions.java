import java.util.Scanner;
public class myStringFunctions {
 //String methods
	//
	//this will count the lower case letters in the string provided 
	public static int countLowerCase(String str) {
		int count = 0;
		
		for(int i = 0; i < str.length(); i ++) {
			char ch = str.charAt(i);
			if(Character.isLowerCase(ch)) {
				count++;
			}
		}
		return count;
	}
	
	//this will reverse any string provided by the user 
	public static String reverse(String st) {
		String result = "";
		
		for(int i = 0; i < st.length(); i++) {
			result = st.charAt(i) + result; 
		}
		return result;
	}
	
	//this method will check if the string is Palindrone
	public static boolean isPalindrone(String p) {
		for(int i = 0; i < p.length() / 2; i++) {
			if(p.charAt(i) != p.charAt(p.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
	
	//this will find and print the index where the character a is appear
	public static void findA(String a) {
		for(int i = 0; i < a.length(); i++ ) {
			if(a.charAt(i) == 'a') System.out.println(a.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please provide any word and then pressenter ");
		String word = scan.nextLine();
		System.out.println("The length of the word you provided is " + word.length() + " characters");
		
		System.out.println("This is the word you providedd but in reverse " + reverse(word));
		System.out.println("Is the word you provided a Palindrome " + isPalindrone(word));
		System.out.println("Your word has " + countLowerCase(word) + " lowercase letters");
		scan.close();
	}

}
