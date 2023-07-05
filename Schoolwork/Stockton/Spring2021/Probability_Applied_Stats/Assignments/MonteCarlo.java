import java.util.*;

public class MonteCarlo {
	Random rng = new Random();
	private int numberOfWins = 0;
	private int numberOfWins2 = 0;
	int runs = 10000;
	private int winningDoor;
	private int userPick;
	//this method will show the probability of keeping the same door
	public void keepDoor() {
		
		for(int i = 0; i <= runs; i++) {
			 winningDoor = rng.nextInt(3);
			 userPick = rng.nextInt(3);
			if(userPick == winningDoor) {
				numberOfWins++;
			}
		}
		double win = ((double)numberOfWins/10000) * 100;
		System.out.println("the chances of you winning while keeping the same door is " + win );
	}
	//this will show the probability if you changed your door after being shown one of the doors does not contain the prize
	public void changeDoor() {
		for(int i = 0; i <= runs; i++) {
			winningDoor = rng.nextInt(3);
			userPick = rng.nextInt(3);
			//the host opens a door with no prize and the user changes door
			if(winningDoor == 2) {
				winningDoor = rng.nextInt(2);
			}
			userPick = rng.nextInt(2);
			if(userPick == winningDoor) {
				numberOfWins2++;
			}
		}
		double win = ((double)numberOfWins2/10000) * 100;
		System.out.println("the chances of you winning while changing your door choice is " + win );
	}
	
	
}
