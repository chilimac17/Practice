import java.util.Random;
public class Level3Q extends TestFormat {
	Random rng = new Random();

	@Override
	public void generateQ() {
		num1 = rng.nextInt(10);
		num2 = rng.nextInt(10);
		
	}
	@Override
	public void displayQ() {
		if(num1>num2) {
			System.out.println(num1 + "" + "-" + "" + num2 + "=?");
		}else{
			int tran = 0; 
			tran = num2;
			num2 = num1;
			num1 = tran;
		}
	}
	
	public void test3() {
		System.out.println("Level 3");
			while(correctCounter != 5 && wrongCounter != 2) {
				generateQ();
				if(num1-num2>0) {
					int answer3 = num1 - num2;
					setAnswer(answer3);
					displayQ();
					checkAnswer();
				}
				
				}
			
			if(wrongCounter == 2) {
				System.out.println("You got 2 questions wrong you must restart");
				System.exit(0);
			}
			System.out.println("You completed Level 3 Great job!! You passed all three levels");	
		}
	}
	

