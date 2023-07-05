import java.util.Scanner;
import java.util.Random;

public class prob1 { 
/*****************************************************************************************
/*	This program simulates the rolling of a die N times, where the value of N is provided
	by the user as input. */	
/****************************************************************************************/

	public static void main(String[] args) { 

		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nHow many times to roll the die?");
		int N = scan.nextInt();
		int total = 0;

		for(int i = 0; i < N; i++) {

			total += rollADie();
		}
		System.out.println("\nTotal roll value = " + total);

	}	


	public static int rollADie() {
/*****************************************************************************************	
/*	Method that simulates the roll of a die.*/
/****************************************************************************************/
		Random rand = new Random();
		int N       = rand.nextInt(6) + 1;
		return N;
	}
}

