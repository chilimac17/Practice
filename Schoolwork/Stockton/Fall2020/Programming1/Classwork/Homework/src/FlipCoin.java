import java.util.Scanner;
import java.util.Random;
//
public class FlipCoin {
	
	private static int flipACoin() {

		Random rng = new Random();
		return rng.nextInt(2);
		
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many times to flip the coin: ");
		int n = scan.nextInt();
		
		int numberOfTails = 0;
		
		for(int i = 0; i < n; i++) {
			numberOfTails += flipACoin();
		}
		System.out.println("Number of tails in " + n + "flips of the coin =" + numberOfTails);
	scan.close();
	}

	}

