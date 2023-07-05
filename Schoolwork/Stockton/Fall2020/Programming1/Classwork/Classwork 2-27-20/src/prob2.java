import java.util.Scanner;
public class prob2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please provide a number");
		int num = scan.nextInt();
		
		if(isOdd(num)) {
			System.out.println("An odd number ");
		}
		else {
			System.out.println("an even number");
		}
		scan.close();
	}

	public static boolean isOdd(int x) {
		return (x % 2 == 1);
	}
}
