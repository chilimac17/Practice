import java.util.Scanner;

public class TriangleTester { 
/****************************************************************************************/   
/* The TriangleTester class is for creating objects of type Triangle and testing various
methods defined in the class on the created objects. */
/****************************************************************************************/
	public static void main(String[] args) {

//Creates an object of the class Triangle taking inputs from the user for the three sides

		Scanner in = new Scanner(System.in);
		
		System.out.println("\nEnter the sides of the triangle -->\n");
		
		System.out.println("Enter first side:");	
		double a = in.nextDouble();
		
		System.out.println("Enter second side:");	
		double b = in.nextDouble();
		
		System.out.println("Enter third side:");	
		double c = in.nextDouble();

		Triangle T = new Triangle(a, b, c);


//Computes the area and perimeter if the Triangle is valid (sum of any two sides should be
//greater than the third side) 	
		if(T.checkValid()) { 
			double A = T.calcArea();
			double P = T.calcPerim();
			
			System.out.println("Area of the triangle = " + A);
			System.out.println("Perimeter of the triangle = " + P);
			
			if(T.isIsosceles()) {
					System.out.println("An isosceles triangle.");
			}
			
			if(T.isEquilateral()) {
					System.out.println("An equilateral triangle.");
			}
		}
		else {
		  System.out.println("The entered sides are not valid.");
		  }			  

	  }
}		  
