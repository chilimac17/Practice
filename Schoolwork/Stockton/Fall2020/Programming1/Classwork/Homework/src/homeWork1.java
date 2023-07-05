
public class homeWork1 {
//
	public static void main(String[] args) {
		
		//these are the answers for hw 1
		//this first problem will add, subtract, multiply, and divide all the variables from a-f
		//it will also be converted to a double
		System.out.println("Problem 1");
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int e = 5;
		int f = 6;
		double x = a / b + c / d + e / f;
		double y = a * (b + c) / d - e / f;
		System.out.println(" x = " + x );
		System.out.println(" y = " + y );
		
		System.out.println("Problem 2");
		x = a / (double)b + c / (double)d + e / (double)f;
		y = a * (b + c) /(double) d - e / (double)f;
		System.out.println(" x: " + x );
		System.out.println(" y: " + y );
		
		System.out.println("Problem 3");
		 double A = 5.1;
		 double B = 1.5;
		double temp; 
		temp = A;
		A = B;
		B = temp;
		System.out.println(" A: " + A );
		System.out.println(" B: " + B );
		
		System.out.println("Problem 4");
		//for this problem i used different variables than the hw but got the correct solution 
		// A = X, B=Y, and C = Z
		int X = 5, Y = 6, Z = 11;
		
		boolean b1 = (X + Y) == Z;
		boolean b2 = X - Y > 0;
		boolean b3 = Y - Z < 0;
		boolean b4 = Z - X > 0;
		boolean b5 = X + Y + Z >= 22;
		
		System.out.println("b1: " + b1 + " " + "b2: " + b2 + " " + "b3: " + b3 + " " + "b4: " + b4 + " " + "b5: " + b5+ " " );
		
		System.out.println("Problem 5");
		double s1 = 172.4, s2 = 163.6, s3 = 159.2, s4 = 166.7, s5 = 181.2, s6 = 176.5;
		double avg = (s1 + s2 + s3 + s4 + s5 + s6) / 6.0;
		System.out.println("The average  height of 6 students is : " + avg + "cm");
		
	}
	
}
