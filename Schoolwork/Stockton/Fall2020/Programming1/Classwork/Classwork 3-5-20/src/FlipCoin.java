import java.util.Scanner;
import java.util.Random;
public class FlipCoin {

	private static int flipACoin() {
		//int seed = 5;
		Random rng = new Random();
		//rng.setSeed();
		return rng.nextInt(2);
		
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many times to flip the coin: ");
		int n = scan.nextInt();
		
		int numberOfHeads = 0;
		
		for(int i = 0; i < n; i++) {
			numberOfHeads += flipACoin();
		}
		System.out.println("Number of heads in " + n + "flips of the coin =" + numberOfHeads);
	scan.close();
	}

}
