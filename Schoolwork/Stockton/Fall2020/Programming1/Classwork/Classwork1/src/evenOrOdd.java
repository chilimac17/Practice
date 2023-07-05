import java.util.Scanner;

public class evenOrOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type a number and then press enter");
		int n = scan.nextInt();
		
		if(n % 2 == 0) {
			System.out.println(n + "Your number is Even");
	}
		else {
			System.out.println(n + "Your number is Odd");
		}
	}
}
