import java.util.Scanner;
public class prob3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please provide a number");
		
		int n = scan.nextInt();
		if(checkPrime(n) ) {
			System.out.println(n + " " +"is prime");
		}
		else {
			System.out.println(n + " " + "not prime ");
		}
		scan.close();
	}

	public static boolean checkPrime(int x) {
		boolean isPrime = true; 
		for(int i = 2; i <= x/2; i++) {
			if(x % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
