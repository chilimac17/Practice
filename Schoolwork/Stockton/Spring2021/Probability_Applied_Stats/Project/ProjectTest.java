import java.util.Scanner;

public class ProjectTest {

	public static void main(String[] args) {
		ProjectCalculations project = new ProjectCalculations();
		Scanner scan = new Scanner(System.in);
		
		/*
		 
		 
		System.out.println("Enter the size of array");
		double arraySize = scan.nextDouble();
		double[] data = new double[(int) arraySize];
		
		System.out.println("Enter all data in array");
		
		for(int i = 0; i < arraySize; i++) {
			double value = scan.nextDouble();
			data[i] = value;
		}
		System.out.println("Array made");
		System.out.println("The mean is " + project.findMean(data));
		
	
		System.out.println("The standard deviation  is " + project.findStandardDeviation(data));
		
		*/
		
		
		/*
		System.out.println("Enter n and r for combination");
		double n = scan.nextDouble();
		double r = scan.nextDouble();
		
		System.out.println("using combination formula " + project.findCombinationProb(n,r));
		*/
		 /*
		System.out.println("Enter Prob A enter Prob B ");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		System.out.println("Using conitional probability " + project.probAHappenIfBGiven(a,b));
		*/
		
		System.out.println("Enter Prob A enter Prob B for bays theorem ");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double ab = scan.nextDouble();
		System.out.println("Using bays theorem " + project.bayesTheorem(a,b,ab));
		
	}

}
