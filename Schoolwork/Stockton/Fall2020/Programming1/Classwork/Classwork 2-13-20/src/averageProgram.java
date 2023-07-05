import java.util.Scanner;

public class averageProgram {
	
		public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Type a number and then press enter");
			int x = scan.nextInt();
			
			System.out.println("Type another number and then press enter");
			int y = scan.nextInt();
			
			System.out.println("X: " + x );
			System.out.println("Y: " + y );
			
			double avg = (x + y)/2.0; 
			//double avg =(double)(x + y)/2;
			//another way to do it casting 
			System.out.println("The average of your two numbers is: " + avg);
			scan.close();
		}
}
