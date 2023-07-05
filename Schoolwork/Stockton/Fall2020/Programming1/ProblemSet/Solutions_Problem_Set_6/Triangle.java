/****************************************************************************************/   
/* The Triangle class defines properties/behaviors of objects of type Triangle. Each object
is specified by the length of its three sides, which are the instance variables of the
class. The class has the following methods:

		-	checkValid()   : Returns true if the length of sides are valid
		-	isIsosceles()  : Returns true if the triangle is isosceles 	
		-	isEquilateral(): Returns true if the triangle is equilateral
		-	calcArea()	   : Returns the area of the triangle
		-	calcPerim()	   : Returns the perimeter of the triangle		
*/
/****************************************************************************************/
public class Triangle { 

//Instance variables of the class (the sides of the Triangle) 
	double a;double b;double c;


//Constructor
	public Triangle(double s1, double s2, double s3) {

		a = s1;b = s2;c = s3;
	}

//Checks if the sides are of valid length (sum of any two sides should be greater than the 3rd side)	
	public boolean checkValid() { 
		return( (( (a + b) > c) && ( (b + c) > a) && ( (c + a) > b )) );		
	}
//Checks if the triangle is isosceles
	public boolean isIsosceles() {
		return ( (a == b) || (b == c) || (c == a) );
	}
	
//Checks if the triangle is equilateral	
	public boolean isEquilateral() {
		return ( (a == b) && (b == c) && (c == a) );
	}

//Computes the area of the Triangle	
	public double calcArea() {

		double s = (a + b + c)/2;

		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
	
		return area;
	}
	
//Computes the perimeter of the Triangle	
	public double calcPerim() { 
		
		return a + b + c;
	}
}
		
		
