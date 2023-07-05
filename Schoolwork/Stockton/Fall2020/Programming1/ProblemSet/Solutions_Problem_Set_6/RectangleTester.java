/****************************************************************************************/   
/* The RectangleTester class is for creating objects of type Rectangle and testing various
methods defined in the class Rectangle on the created objects. */
/****************************************************************************************/

public class RectangleTester {
	
	
  	
  	public static void main(String[] args) {
  	
			//Creates two objects of type Rectangle
			Rectangle R1 = new Rectangle(4, 5);
			Rectangle R2 = new Rectangle(10, 6);
			
			System.out.println("\nDetails of R1:");
			System.out.println("--------------");
			
			//Invokes the methods on Rectangle object R1	
			System.out.println("Height of R1           = " + R1.getHeight());
			System.out.println("Width  of R1           = " + R1.getWidth());
			System.out.println("Area  of R1            = " + R1.calcArea());			
			System.out.println("Perimeter of R1        = " + R1.calcPerim());			
			System.out.println("Sum of diagonals of R1 = " + R1.sumOfDiagonals());						
			
			System.out.println("\nDetails of R2:");
			System.out.println("--------------");
			
			//Invokes the methods on Rectangle object R2
			System.out.println("Height of R2           = " + R2.getHeight());
			System.out.println("Width  of R2           = " + R2.getWidth());
			System.out.println("Area  of R2            = " + R2.calcArea());			
			System.out.println("Perimeter of R2        = " + R2.calcPerim());
			System.out.println("Sum of diagonals of R2 = " + R2.sumOfDiagonals());						
						
  			System.out.println();
  	}
  	

}