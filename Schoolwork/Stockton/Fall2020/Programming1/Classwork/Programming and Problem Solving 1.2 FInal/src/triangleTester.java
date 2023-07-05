import java.util.*;

public class triangleTester {
	
	Random rng = new Random();
	ArrayList<Triangle> aTri = new ArrayList<Triangle>();
	
	public void addTenTriangles() {
		for(int i = 0; i < 10; i++) {
			Triangle t1 = new Triangle(rng.nextInt(10) + 1,rng.nextInt(10) + 1,rng.nextInt(10) + 1);
			aTri.add(t1);
		}

	}
	public void printTriangle(){
		for(int i = 0; i < aTri.size(); i++) {
			System.out.println("Triangle" + (i + 1)); 
	}
	}	
	
	public void testTriangle() {
		for(int i = 0; i < aTri.size(); i++) {
			if(aTri.get(i).equilateral() == true) {
				System.out.println("Triangle" + (i + 1) + " is an equilateral " + aTri.get(i).equilateral());
			} 
			else if(aTri.get(i).isosceles() == true) {
				System.out.println("Triangle" + (i + 1) + " is an isosceles " + aTri.get(i).isosceles());
			}
			else if(aTri.get(i).isValidTriangle() == false) {
				System.out.println("Triangle" + (i + 1) + " is an invalid triangle " + aTri.get(i).isValidTriangle());

			}
		}
	}
	
	public static void main(String[] args) {
		/*
		Random rng = new Random();
		ArrayList<Triangle> aTri = new ArrayList<Triangle>();
		
		for(int i = 0; i < 10; i++) {
			Triangle t1 = new Triangle(rng.nextInt(10) + 1,rng.nextInt(10) + 1,rng.nextInt(10) + 1);
			aTri.add(t1);
		}
		
		for(int i = 0; i < aTri.size(); i++) {
			System.out.println("Triangle" + (i + 1)); 
	}
	*/
		triangleTester test = new triangleTester();
		test.addTenTriangles();
		//test.printTriangle();
		test.testTriangle();
		
		

	}

}
