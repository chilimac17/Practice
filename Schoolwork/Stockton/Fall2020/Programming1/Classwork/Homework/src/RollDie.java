import java.util.Scanner;
	import java.util.Random;
public class RollDie {
	//
	public static int rollADie() {
		Random rand = new Random();
		int N       = rand.nextInt(6) + 1;
		return N;
	}

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


}


	