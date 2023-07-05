import java.util.Scanner;
public class prob4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please provide a number");
		double x = scan.nextDouble();
		System.out.println("Please provide another number");
		double y = scan.nextDouble();
		System.out.println("Please provide one last number");
		double z = scan.nextDouble();
		
		System.out.println("sum of" + x + " " + y + " " + z + "=" + calSum(x,y,z));
		scan.close();
	}

	public static double calSum(double a, double b, double c) {
		double sum = a + b + c;
		return sum;
	}
}
