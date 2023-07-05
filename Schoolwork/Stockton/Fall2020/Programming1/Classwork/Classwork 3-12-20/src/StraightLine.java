
public class StraightLine {
	//instance variables
	private double slope;
	private double intercept;
	
	//constructor
	public StraightLine(double m, double c) {
		slope = m;
		intercept = c;
	}
	//methods
	public void getSolution(StraightLine L) {
		double xPrime = (L.intercept - intercept) / (slope - L.slope);
		double yPrime = (slope * L.intercept - L.slope * intercept) / (slope - L.slope);
		System.out.println("The line intersects at; x = " + xPrime + ", y = " + yPrime);
	}
	
	
	
	public double getSlope() {
		return slope;
	}
	
	public double getIntercept() {
		return intercept;
	}
	
}
