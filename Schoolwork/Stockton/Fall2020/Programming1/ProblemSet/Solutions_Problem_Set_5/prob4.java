import java.util.Scanner;
import java.util.Random;

public class prob4 { 
/*****************************************************************************************	
/*	This program counts the number of rolls needed to obtain the maximum roll value for
	rolling N dice. */
/****************************************************************************************/
	private static final int NUM_SIDES = 6;
	
	public static void main(String[] args) { 

		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nHow many dice to roll?");
		int numDice = scan.nextInt();
		
		int maxRoll  = numDice * NUM_SIDES;
		int numRolls = 0;

		while(true) {	//Loop-and-a-half	
		
			int roll = rollDice(numDice);
			numRolls++;
			
			if(roll == maxRoll) break;
			
			System.out.println("You rolled " + roll); 
			
		}
			
		System.out.println("\nRolled " + maxRoll + " after " + numRolls + " rolls.\n" ); 

	}	

	private static int rollDice(int numDice) {

		Random rand = new Random();
		
		int total   = 0;
		
		for(int i = 0; i < numDice; i++) {
		
			total += rand.nextInt(6) + 1;
		}
		
		return total;
	}
}

