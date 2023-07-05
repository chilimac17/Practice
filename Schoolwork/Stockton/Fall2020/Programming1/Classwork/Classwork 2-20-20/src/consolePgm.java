import java.util.Scanner;
public class consolePgm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// this computes the value arithmetic mean, meaning the average
		System.out.println("Enter the value of N");
		int n = scan.nextInt();
		int sum = 0;
		for(int i = 1;  i <= n; i++) {
			sum = sum + i;
			
		}
		System.out.println("Sum = " + sum);
		double avg = sum / (double)n; 
		System.out.println("Average = " + avg);
	
		//this will compute the harmonic mean
		double sum2 = 0;
		for(int i = 1;  i <= n; i++) {
			sum2 = sum2 + 1/(double)i;
			
		}
		System.out.println("Sum2 = " + sum2);
		double hmAvg = n /sum; 
		System.out.println("Average2 = " + hmAvg);
		
		//number 3
		//create series 0,1,1,2,3,5,8,13,21,34...
		System.out.println("Please enter a number");
		int N = scan.nextInt();
		int i = 1, fib_1 = 0, fib_2 = 1, fib = 0;
		System.out.println("fibonacci series upto " + N + " " + "terms: ");
		
			while(i <= N) {
				if(i == 1) {
					fib = fib_1;
				}
				else {
					if(i == 2) {
						fib = fib_2;
					}
					else {
						fib = fib_1 + fib_2;
						fib_1 = fib_2;
						fib_2 = fib;
					}
				}
				System.out.println(fib);
				i++;
			}
			
		
		
		//number 4 
		System.out.println("enter your mark");
		int choice = scan.nextInt();
		
		if(choice >= 91) {
			System.out.println("A");
		}
		else if(choice >= 81) {
			System.out.println("B");
		}
		else if(choice >= 71) {
			System.out.println("B-");
		}
		else if(choice >= 61) {
			System.out.println("C");
		}
		else if(choice >= 51) {
			System.out.println("D");
		}
		else if(choice >= 41) {
			System.out.println("E");
		}
		else {
			System.out.println("F");
		}
		
		//problem 5
		System.out.println("Please enter a day 1-5");
			int day = scan.nextInt();
		switch(day) {
		case 1: System.out.println("it is a monday");
			break;
		case 2: System.out.println("it is a tuesday");
			break;
		case 3: System.out.println("it is a wednesday");
			break;
		case 4: System.out.println("it is a thursday");
			break;	
		case 5: System.out.println("it is a friday");
			break;	
		case 6: System.out.println("it is a saturday");
			break;
		case 7: System.out.println("it is a sunday");
			break;
		case 8: System.out.println("you only have seven days in a week");
		break;	
		}
		scan.close();
	}

}
