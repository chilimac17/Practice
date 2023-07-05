import java.util.Random;
/****************************************************************************************/   
/* The class StraightLineTester tests the methods defined in the class StraightLine.
*/
/****************************************************************************************/   
public class StraightLineTester { 

	public static void main(String[] args) {
	
	//Creates a pair of StraightLine objects
		Random rng = new Random();

		StraightLine L1 = new StraightLine(rng.nextDouble()*2, rng.nextDouble()*10);
		StraightLine L2 = new StraightLine(rng.nextDouble()*2, rng.nextDouble()*10);
		
		System.out.println("\n");
		System.out.println("Slope of L1 = " + L1.getSlope());
		System.out.println("Intercept of L1 = " + L1.getIntercept());
		System.out.println();
		System.out.println("Slope of L2 = " + L2.getSlope());
		System.out.println("Intercept of L2 = " + L2.getIntercept());	
		System.out.println("\n");
	
	//Finds the point of intersection of the two straight lines	

		L1.getSolution(L2);
		System.out.println();
		L2.getSolution(L1);
	}
}		
	
		