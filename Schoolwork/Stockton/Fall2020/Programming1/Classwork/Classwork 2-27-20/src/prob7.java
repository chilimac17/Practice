import java.util.Scanner;
public class prob7 {

	public static double interestRate(double x, double r) {
		return x * (r % 100);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a principal amount");
		double p = scan.nextDouble();
		System.out.println("Enter the rate in percent");
		double r = scan.nextDouble();
		System.out.println("Your principal amount = " + p);
		System.out.println("Your rate = " + r + "%");
		System.out.println("Your interest rate is" + interestRate(p,r));
		scan.close();
	}

}
