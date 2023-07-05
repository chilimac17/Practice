/****************************************************************************************/   
/* The Rectangle class defines properties/behaviors of objects of type Rectangle. Each
object has a certain height and width. The constructor creates an object of type Rectangle
with the specified dimensions. The class has the following methods:

		-	getHeight()	 	  : Returns the height of the Rectangle object
		-	getWidth()	 	  : Returns the width of the Rectangle object		
		-	calcArea()   	  : Returns the area of the Rectangle object 	
		-	calcPerim()  	  : Returns the perimeter of the Rectangle object		
		-	sumOfDiagonals()  : Returns the sum of the diagonals of the Rectangle object				
*/
/****************************************************************************************/

public class Rectangle {
	

/*Instance variables*/			
  	private double height;
  	private double width;


/*Constructor*/  	  	
  	public Rectangle(double h, double w) {
  	
  			height = h; width = w;
  	
  	}

/*Methods*/ 
  	public double getHeight() {
//Returns the height of the Rectangle. This is an accessor method.  	  	
  			return height;
  	
  	}

  	
  	public double getWidth() {
//Returns the width of the Rectangle. This is an accessor method.  	
  			return width;
  	
  	}  	
 

  	public double calcArea() {
//Returns the area of the Rectangle  	 	  	
  			return (height * width);
  	
  	}


  	public double calcPerim() {
//Returns the perimeter of the Rectangle  	
  			return (2 * (height + width));
  	
  	}
  	

  	public double sumOfDiagonals() {
//Returns the sum of diagonals of the Rectangle  	  	  	
  			return (2 * Math.sqrt( Math.pow(height, 2) + Math.pow(width, 2)));
		//ABOVE IS SAME AS-->  return (2 * Math.sqrt( height * height + width * width));  	
  	}  	

}