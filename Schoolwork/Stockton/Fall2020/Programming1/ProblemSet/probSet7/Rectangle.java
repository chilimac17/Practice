package probSet7;

public class Rectangle {
/* *******************************************************************************************************
 * The Rectangle class encapsulates the properties and behaviors of objects of type Rectangle. 
 * *****************************************************************************************************/	
	
	//Instance variables
	private int height;
	private int width;
	
	
	//Constructor
	public Rectangle(int h, int w) {
		
		height = h; width = w;
	}
	
	//Methods
	public int getHeight() {
		
		return height;
	}
	
	public int getWidth() {
		
		return width;
	}
	
	public int calcArea() {
		
		return height * width;
	}
	
	public int calcPerim() {
		
		return 2 * (height + width);
	}	
	
	public double lengthOfDiag() {
		
		return Math.sqrt( height * height + width * width);
	}
	
	public boolean isASquare() { 
		
		return (height == width);
	}
}
