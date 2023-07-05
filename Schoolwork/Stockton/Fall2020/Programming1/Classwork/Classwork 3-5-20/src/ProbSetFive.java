import java.util.Random;
import java.util.Scanner;

public class ProbSetFive {
	//generates same sequese of random number
	private static int rollADie() {
		Random rng = new Random();
		int seed = 123;
		rng.setSeed(seed);
		return rng.nextInt(6) +1;
	}
	

	public static void main(String[] args) {
		Random rng = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("How many times will you roll the die");
		int n = scan.nextInt();
		int totalRoll = 0;
		
		for(int i = 1; i < n; i++) {
			totalRoll += rollADie();
		}
		System.out.println("Total roll = " + totalRoll);
	}
	
}
