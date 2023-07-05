import java.util.Random;

public class Level2Q extends TestFormat {
	Random rng = new Random();
	
	@Override
	public void generateQ() {
		num1 = rng.nextInt(20);
		num2 = rng.nextInt(20);
	}
	public void test2() {
		System.out.println("Level 2");
		while(correctCounter != 5 && wrongCounter != 2) {
			generateQ();
			if(num1+num2<40) {
				int answer2 = num1 + num2;
				setAnswer(answer2);
				displayQ();
				checkAnswer();
			}
			
			}
		if(wrongCounter == 2) {
			System.out.println("You got 2 questions wrong you must restart");
			System.exit(0);
		}
		System.out.println("You completed Level 2 Good Job! on to Level 3");
		}
}
