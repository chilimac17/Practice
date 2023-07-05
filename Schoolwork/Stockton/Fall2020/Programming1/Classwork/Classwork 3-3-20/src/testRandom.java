import java.util.Random;

public class testRandom {

	public static void main(String[] args) {
		Random rng = new Random();
		//this program will generate a random number 10 times
		
		for(int i = 1; i < 10; i++) {
		int x = rng.nextInt(10);
		System.out.println("Your number is " + x);
		
		//set seed look up to fully understand
		int seed = 17; 
		rng.setSeed(seed);
		
		for(int j = 1; j < 20; j++) {
			int y = rng.nextInt(15) + 1;
			System.out.println(x);
		}
		
		
		}
	}

}
