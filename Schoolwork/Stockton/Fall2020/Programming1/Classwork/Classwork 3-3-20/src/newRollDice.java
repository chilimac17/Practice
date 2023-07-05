import java.util.Scanner;
import java.util.Random;
public class newRollDice {
	private static final int NUM_SIDES = 6;
	
	private static int rollDice(int numDice) {
		Random rng = new Random();
		int total = 0;
		for(int i = 0; i < numDice; i++) {
			total += rng.nextInt(NUM_SIDES) +1;
			//total = total + rng.nextInt(NUM_SIDES) + 1;
			}
		return total;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number of dies you want ot roll ");
		int numDie = scan.nextInt();
		int maxRoll = NUM_SIDES * numDie;
		int numRoll = 0;
		
		//using a loop and a half
		while(true) {
			int roll = rollDice(numDie);
			numRoll++;
			if(roll == maxRoll) break;
			System.out.println("You rolled" + " " + roll);
				
			
		}
		
		System.out.println("Rolled" + maxRoll + "After " + numRoll + "times");
		
	}

}
