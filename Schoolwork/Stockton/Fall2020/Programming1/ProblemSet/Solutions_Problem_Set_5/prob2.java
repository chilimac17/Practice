import java.util.Scanner;
import java.util.Random;

public class prob2 { 
/*****************************************************************************************
/*	This program simulates the rolling of a die N times, where the value of N is provided
	by the user as input. The seed is set to a specified number by the user. For the same
	seed value, the total roll value is always the same for a given value of N.*/	
/****************************************************************************************/
	public static void main(String[] args) { 

		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nHow many times to roll the die?");
		int N = scan.nextInt();
		
		System.out.println("\nEnter the value of seed: ");
		int seed = scan.nextInt();
		int total = 0;

		for(int i = 0; i < N; i++) {

			total += rollADie(seed);
		}
		System.out.println("\nTotal roll value = " + total);

	}	

	public static int rollADie(int seed) {
/*****************************************************************************************	
/*	Method that simulates the roll of a die. The random number generator is initialized
	with a given seed value. */
/****************************************************************************************/
		Random rand = new Random();
	 	rand.setSeed(seed);
	 	
		int N       = rand.nextInt(6) + 1;

		return N;
	}
}

