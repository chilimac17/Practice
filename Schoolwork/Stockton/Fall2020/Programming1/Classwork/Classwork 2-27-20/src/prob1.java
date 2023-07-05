import java.util.Scanner;
public class prob1 {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please provide a number");
		int x = scan.nextInt();
		int fact = factorial(x);
		System.out.println("Factorial" + x + "=" + fact);
		scan.close();
		
		
	}
	public static int factorial(int y) {
		int fact = 1;
		for(int i =1; i <= y; i++) {
			fact = fact * i;
			
		}
		return fact;
	}
}
