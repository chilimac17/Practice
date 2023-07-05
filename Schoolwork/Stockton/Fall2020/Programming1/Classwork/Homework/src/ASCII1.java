import java.util.Scanner;
//
public class ASCII1 {
	public static int countUpperCase(String str) {
		int count = 0;
		
		for(int i = 0; i < str.length(); i ++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		//this will take a letter inputed by the user and show the numeric value
		System.out.println("Enter a letter and see the numeric value");
		char ch = scan.next().charAt(0);
		System.out.println((int)ch);
		System.out.println();
		
		//this will display the number of upper case letters in the string provided by the user
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a word to display the count of upper case letters");
		String st = scn.nextLine();
		System.out.println(countUpperCase(st));
		
		//this will display if the input the user provided is a letter or not a letter
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a letter or number and the program will tell you if it is a letter or not ");
		char letter = sc.next().charAt(0);
		System.out.println(Character.isLetter(letter));
		
		//this will display if the input the user provided is a digit or not a digit
		Scanner san = new Scanner(System.in);
		System.out.println("Enter a letter or number and the program will tell you if it is a digit or not ");
		char letNum = san.next().charAt(0);
		System.out.println(Character.isDigit(letNum));
		
		scan.close();
		scn.close();
		sc.close();
		san.close();
		
	}
}
