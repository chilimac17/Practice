import java.util.Scanner;
import java.util.Random;
public class RectangleTester {
//
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		//user input first rectangle 
		System.out.println("Please enter the height of your rectangle");
		double h = scan.nextDouble();
		System.out.println("Please enter the width of your rectangle");
		double w = scan.nextDouble();
		Rectangle R1 = new Rectangle(h,w);
		
		//second rectangle has a random height and width from 1-10
		System.out.println("The next rectangle will be random");
		int randomHeight = rnd.nextInt(10) + 1;
		int randomWidth = rnd.nextInt(10) + 1;
		Rectangle R2 = new Rectangle(randomHeight, randomWidth);
		
		//printing out the values 
		System.out.println("the area of rectangle 1 = "  + R1.calcArea());
		System.out.println("the area of rectangle 2 = "  + R2.calcArea());
		System.out.println("the perimeter of rectangle 1 = "  + R1.calcPerim());
		System.out.println("the perimeter of rectangle 2 = "  + R2.calcPerim());
		System.out.println("is rectangle 1 a square = "  + R1.isASquare());
		System.out.println("is rectangle 2 a square = "  + R2.isASquare());
	}

}
