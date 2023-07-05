import java.util.*;

public class StraightLineTester {

	public static void main(String[] args) {
		Random rng = new Random();
		StraightLine L1 = new StraightLine(rng.nextDouble()*2, rng.nextDouble()*10);
		StraightLine L2 = new StraightLine(rng.nextDouble()*2, rng.nextDouble()*10);
		
		System.out.println("Slope of L1 = " + L1.getSlope() );
		System.out.println("Intercept of L1 = " + L1.getIntercept());
		System.out.println();
		System.out.println("Slope of L2 = " + L2.getSlope() );
		System.out.println("Intercept of L2 = " + L2.getIntercept());
		
		if (L1.getSlope() == L2.getSlope()) {
			System.out.println("The lines are parallel ");
		}
		else {
			L1.getSolution(L2);
			System.out.println();
			L2.getSolution(L1);
		}
	}

}
