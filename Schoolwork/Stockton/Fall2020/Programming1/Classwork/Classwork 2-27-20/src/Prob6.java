import java.util.Scanner;
public class Prob6 {
	//could be public 
	private static final double PI = 3.1419;
	
	private static double circleArea(double R) {
		return PI * R * R;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		double r = scan.nextDouble();
		
		System.out.println("Area of the circle with radius" + r + "is = " + circleArea(r));
	
		//this will close the scanner to fox light bulb problem
		scan.close();
	}

}
