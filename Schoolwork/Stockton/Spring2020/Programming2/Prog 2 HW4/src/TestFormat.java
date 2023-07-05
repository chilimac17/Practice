import java.util.*;
import java.util.Scanner;

public class TestFormat {
 public int correctCounter=0;
 public int wrongCounter=0;
 public int num1;
 public int num2;
 public int answer;
 Scanner scan = new Scanner(System.in);
 
 
 
 //this method will generate a questions for the three tests
 public void generateQ() {
	 Random rng = new Random();
	 num1 = rng.nextInt(10);
	 num2 = rng.nextInt(10);
	 
 		}
 
 
 //this method will check user answer to set answer to see if its correct
 public boolean checkAnswer() {
	 int userAnswer = scan.nextInt();
	 if(userAnswer == getAnswer() ) {
			correctCounter++;
			System.out.println("Correct!");
			return true;
	 }else {
		wrongCounter++;
		System.out.println("Wrong!\n Try Again");
		displayQ();
		int retry = scan.nextInt();
			if(retry == getAnswer()) {
				correctCounter++;
				wrongCounter = 0;
				System.out.println("Correct!");
				return true;
				}else {
					System.out.println("Wrong Again!!! You Must Restart");
					wrongCounter++;
					return false;
				}
			}
 		}
 
 //this method will display the question to the user 
 public void displayQ() {
	 System.out.println(num1 + "" + "+" + "" + num2 + "=?");
 }
 //this method will set the answer variable
 public void setAnswer(int ans){
     answer = ans;
     
 }
 //this method will return the value of answer
 public int getAnswer(){
     return answer;
 }
	}
 