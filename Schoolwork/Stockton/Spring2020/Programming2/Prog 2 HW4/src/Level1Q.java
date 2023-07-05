import java.util.Scanner;

public class Level1Q extends TestFormat {
	Scanner scan = new Scanner(System.in);
	
	public void test1() {
		System.out.println("Level 1");
		while(correctCounter != 5 && wrongCounter != 2) {
			generateQ();
			if(num1+num2<10) {
				int answer1 = num1 + num2;
				setAnswer(answer1);
				displayQ();
				checkAnswer();
			}
	
			}
		if(wrongCounter == 2) {
			System.out.println("You got 2 questions wrong you must restart");
			System.exit(0);
		}
		System.out.println("You completed Level 1 Good Job! on to Level 2");

		}
		
	}

