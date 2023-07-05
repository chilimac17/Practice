import java.util.Scanner;

public class myMathTester { 
/****************************************************************************************/   
/* The myMathTester class is for testing various methods of the class myMathFunctions. */
/****************************************************************************************/
	public static void main(String[] args) {


		Scanner in = new Scanner(System.in);
		
		System.out.println("\nEnter the value of N -->\n");		
		int N = in.nextInt();		
		
		System.out.println("\nDisplaying Fibonacci series up to " + N + " terms ---->");
		myMathFunctions.myFibN(N);
		
		System.out.println("\nEnter the value of x -->\n");		
		double x = in.nextDouble();		
		
		myMathFunctions.myExpSeries(x, N);

		
	  }
}		  
