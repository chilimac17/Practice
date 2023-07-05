import java.util.*;
//
public class ArrayCircle {
	public static final double PI =3.14;
	
	public int cPerimeter(int r) {
		int diameter = 2 * r;
		int perimeter = (int)PI * diameter;
		return perimeter;
	}
	
	public int cArea(int r) {
		int area = (int)((int)PI * Math.pow(r,2));
		return area;
	}

	public static void main(String[] args) {
		Random rng = new Random();
		int radius =  rng.nextInt(10) + 1;
		int radius2 = rng.nextInt(10) + 1;
		ArrayCircle c1 = new ArrayCircle();
		ArrayCircle c2 = new ArrayCircle();
		
		System.out.println("Circle 1 radius = " + radius);
		System.out.println("Circle 2 radius = " + radius2);
		
		System.out.println("\nCircle 1 perimeter = " + c1.cPerimeter(radius));
		System.out.println("Circle 2 perimeter = " + c2.cPerimeter(radius2));
		
		System.out.println("\nCircle 1 area = " + c1.cArea(radius));
		System.out.println("Circle 2 area = " + c2.cArea(radius2));
		
		
	}

}
