
public class Triangle {
	private int a;
	private int b;
	private int c;
	private boolean isEquilateral;
	private boolean isIsosceles; 
	
	public Triangle(int a1, int b1, int c1) {
		a = a1;
		b = b1;
		c = c1;
	}
	
	public boolean equilateral(){
		if(a == b && a == c && b == c) {
			isEquilateral = true;
		}
		else {
			isEquilateral= false;
		}
		return isEquilateral;
	}
	public boolean isosceles(){
		if(a == b && a != c || b == c && b != a || a == c && a != b) {
			isIsosceles = true;
		}
		else {
			isIsosceles = false;
		}
		return isIsosceles;
	}
	public double calcArea() {
		double s = (getA() + getB() + getC()) / 2;
		double area = Math.sqrt(s * (s - getA()) * (s - getB()) * (s - getC()));
		return area;
	}
    public double calcPerim() {
    	double perimeter = a + b + c;	
    	return perimeter;
	}
    public boolean isValidTriangle() {
    	if(a + b > c || a + c > b || b + c > a ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public int getA() {
    	return a;
    }
    public int getB() {
    	return b;
    }
    public int getC() {
    	return c;
    }
    
	
	
	
}
