import java.util.*;
public class Level1Q extends TestFormat {
	//Scanner scan = new Scanner (System.in);
	
	public void test1() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Level 1 Addition");
		while(correctCounter != 5) {
			System.out.println(num1 + " " + "+" + " " + num2 + "=?");
			int answer = scan.nextInt();
				if(answer == num1+num2 && wrongCounter != 2) {
					System.out.println("correct!");
					correctCounter++;
			} else {
				System.out.println("Wrong! you get one more try");
				wrongCounter++;
			}
		}
	}
	
}
