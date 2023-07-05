import java.util.Scanner;
import java.util.Random;

public class prob3 { 
/*****************************************************************************************	
/*	This program counts the number of heads generated in N flips of a coin, where the 
	value of N is provided by the user as input. */
/****************************************************************************************/
	public static void main(String[] args) { 

		Scanner scan = new Scanner(System.in);
		//Random  rand = new Random();
		
		System.out.println("\nHow many times to flip the coin?");
		int N = scan.nextInt();
		int total = 0;

		for(int i = 0; i < N; i++) {

			total += flipACoin();
		}
		System.out.println("\nNumber of heads occurred in " + N + " flips = " + total);

	}	

	public static int flipACoin() {

		Random rand = new Random();
		int N       = rand.nextInt(2);

		return N;
	}
}

