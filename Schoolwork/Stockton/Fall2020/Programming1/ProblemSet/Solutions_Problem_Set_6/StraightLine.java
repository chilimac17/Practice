/****************************************************************************************/   
/* The StraightLine class defines the properties of objects of type StraightLine. Every 
straight line has a given slope (or gradient) and an intercept, which are the two instance
variables of the class. We set the visibility of instance variables to private. The class
has the following methods:

		-	getSlope()     				 : Returns the slope of the straight line
		-	getIntercept() 				 : Returns the intercept of the straight line
		-	getSolution(StraightLine L)  : Finds the point of intersection of the straight		
									       line with a given straight line L.  		

*/
/****************************************************************************************/
public class StraightLine { 

//Instance variables of the class	
	private double Slope;
	private double Intercept;
	
//Constructor	
	public StraightLine(double m, double c) { 
	
		Slope = m; Intercept = c;
	}

//Methods	
	public double getSlope() { 
//Returns the slope of the straight line. It is an accessor method.	
		return Slope;
	}
	
	public double getIntercept() { 
//Returns the intercept of the straight line. It is an accessor method.	
		return Intercept;
	}
	
	public void getSolution(StraightLine l) {
	
		double m1 = Slope;		double c1 = Intercept;	
		double m2 = l.Slope;	double c2 = l.Intercept;		
		
		if(m1 == m2)
			System.out.println("The straight lines do not intersect");

		else
		{	
			double X = (c2 - c1)/(m1 - m2);
			double Y = (m1*c2 - m2*c1)/(m1 - m2);
			System.out.println("Point of intersection:");
			System.out.print("\n");
			System.out.println("X = " + X);
			System.out.println("Y = " + Y);
			System.out.print("\n");
		}	
	}
}		
		