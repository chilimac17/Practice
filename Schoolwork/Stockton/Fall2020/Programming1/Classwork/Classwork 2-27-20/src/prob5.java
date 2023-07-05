import java.util.Scanner;
public class prob5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please provide a number");
		double a = scan.nextDouble();
		
		System.out.println("Please provide another number");
		double b = scan.nextDouble();
		
		double m = max(a, b);
		 scan.close();
	}

	private static double max(double x, double y) {
		if(x > y) {
			return  x;
		}
		else {
			return y;
		}
	}
}
