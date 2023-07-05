import java.util.Random;
public class CircleTester {
//
	public static void main(String[] args) {
		Random rng = new Random();
		int r1 = rng.nextInt(10) + 1;
		int r2 = rng.nextInt(10) + 1;
		
		//creating 2 new circles
		Circle c1 = new Circle(r1);
		Circle c2 = new Circle(r2);
		System.out.println("the perimeter of circle 1 = " + c1.cPerim());
		System.out.println("the perimeter of circle 2 = " + c2.cPerim());
		
		
		System.out.println("the area of circle 1 = " + c1.cArea());
		System.out.println("the area of circle 1 = " + c2.cArea());
	}

}
