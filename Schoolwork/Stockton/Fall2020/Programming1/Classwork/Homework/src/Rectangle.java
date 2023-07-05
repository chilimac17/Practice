
public class Rectangle {
//
	private double height;
	private double width;
	
	public Rectangle(double h, double w) {
		height = h;
		width = w;
	}
	
	
	public double calcArea() {
		return (height * width);
	}
	
	public double calcPerim() {
		return (2 * (height * width));
	}
	public boolean isASquare() {
		if(width == height) {
			return true;
		}else {
			return false;
		}
	}
	
}