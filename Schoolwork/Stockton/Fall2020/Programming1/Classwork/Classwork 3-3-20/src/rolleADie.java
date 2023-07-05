import java.util.Random; 
public class rolleADie {

	public static void main(String[] args) {
		Random rng = new Random();
		
		int rollValue = rng.nextInt(6) + 1 ;
		
		System.out.println("You rolled " + rollValue);
		
	}

}
