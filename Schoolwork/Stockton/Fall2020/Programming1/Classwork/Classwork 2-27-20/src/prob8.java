import java.util.Scanner;
public class prob8 {
	private static final double SENTINEL = 0;
	
	private static double calcSum() {
		double total = 0;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Enter a number");
			double d = scan.nextDouble();
			if(d == SENTINEL) break;
			//total = total + d 
			total+=d;
			
		}
		scan.close();
		return total;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sum of real numbers = " + calcSum());
		scan.close();
	}

}
