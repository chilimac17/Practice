import java.util.Scanner;

public class Homework3 {
	//
	public static int factorial(int y) {
		int fact = 1;
		for(int i =1; i <= y; i++) {
			fact = fact * i;
			
		}
		return fact;
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
	
	public void listPrime(int y) {
		for(int i =0; i <= y; i++ ) {
			if(checkPrime(i) == true) {
				System.out.println(i);
			}
			else {
				
			}
		}		
	}
	
	
	public void min(double a, double b) {
		if(a > b) {
			System.out.println(b + " is smaller than " + a);
		}
		else if(b > a) {
			System.out.println(a + " is smaller than " + b);
		}else {
			
		}
	}
	public static int calcArea(int x,int y) {
		int area = x * y;
		return area;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Homework3 hw = new Homework3();
		
		//problem 1
		System.out.println("Please provide a number");
		int N = scan.nextInt();
		int fact = hw.factorial(N);
		System.out.println("Factorial" + " " + N + "=" + " " + fact);
		
		//problem 2
		System.out.println("Please provide another number to list the prime numbers up to that number ");
		int p = scan.nextInt();
		hw.listPrime(p);
		
		
		//problem 3 
		System.out.println("Please provide a number");
		double n = scan.nextDouble();
		System.out.println("Please provide another number");
		double c = scan.nextDouble();
		
		hw.min(n, c);
		
		//problem 4
		System.out.println("Please enter the height of a rectangle");
		int x = scan.nextInt();
		System.out.println("Please enter the width of a rectangle");
		int y = scan.nextInt();
		hw.calcArea(x, y);
	}

}
