import java.util.*;
//
public class ArrayMean {
	
	public static double aMean(double a[]) {
		double sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum/a.length;
	}
	
	public static double gMean(double b[]) {
		double product = 1;
		for(int i = 0; i < b.length; i++) {
			product *= b[i];
		}
		return Math.pow(product, 1.0/b.length);
	}
	
	private static double hMean(double c[]) {
		double sum = 0;
		for(int i = 0; i < c.length; i++) {
			sum += 1/c[i];
		}
		return (c.length/sum);
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		int size = scan.nextInt();
		
		double[] Array = new double[size];
		
		System.out.println("Enter " + size + " values:");
		
		
		for(int i = 0; i < Array.length; i++) {
			
			Array[i] = scan.nextDouble();			
			
		}
		
		System.out.println("Arithmetic mean = " + aMean(Array));
		System.out.println("Geometric  mean = " + gMean(Array));
		System.out.println("Hamonic    mean = " + hMean(Array));
		
		scan.close();


	}

}
