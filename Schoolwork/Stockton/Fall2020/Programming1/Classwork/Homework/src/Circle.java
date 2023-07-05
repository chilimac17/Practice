
public class Circle {
//
	public int radius;
	public static final double PI = 3.141592136 ;
	
	public Circle(int r) {
		radius = r;
	}


	public int cPerim() {
		return (int) (2 * radius * PI);
	}
	
	public int cArea() {
		return (int) (PI * (radius * radius));
	}
}
