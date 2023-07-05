import java.lang.Math;		//Imports the Math class

/****************************************************************************************/   
/* The class myMathFunctions contains static methods to compute the Fibonacci series and 
the sum of the exponential series up to N terms. */
/****************************************************************************************/   
public class myMathFunctions { 

	//The method myFibN() computes the Fibonacci series up to N terms
	public static void myFibN(int N) {
	
		double fib_1 = 0;double fib_2 = 1;int i = 1;double fib = 0;
		
		System.out.print("\n\n");
		
		while (i <= N) {
			
					if( (i == 1) )
						fib = fib_1;
					else {	
						if(i == 2)
							fib = fib_2;					
						else
							{
								fib = fib_1 + fib_2;
								fib_1 = fib_2;
								fib_2 = fib;
							}
					}		
					
					System.out.println(fib);  
					i = i + 1;
					

		}
		System.out.print("\n\n");	
		
	 }

	//The method myExpSeries() computes the sum of the exponential series up to N terms	and
	//compares the result with the value obtained from the function Math.exp(x) 
	 public static void myExpSeries(double x, int N) {
	 
		double sum = 1, Error;
					
		System.out.print("\n");
		
		for (int i = 1; i <= N; i++)
			sum = sum + Math.pow(x,i)/factorial(i);
		
		Error = Math.abs(Math.exp(x) - sum); //Deviation from Math.exp(x)						
		
		System.out.println("Sum of the exponential series up to " + N + " terms = " + sum + ".");
		System.out.print("\n\n");
		
		System.out.println("Error = " + Error + ".");	
	 
	 	
	 }
	 
	 //Compute the factorial of the integer N
	 public static double factorial(int N) {
		
		double fact = 1;
		
		for (int i = 1; i <= N;i++) {
			fact *= i;
		}
		return fact;
	}
	
}		
				