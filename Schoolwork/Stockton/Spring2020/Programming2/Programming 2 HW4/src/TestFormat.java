import java.util.*;

public class TestFormat {
 public int correctCounter;
 public int wrongCounter;
 public int num1;
 public int num2;
 
 public TestFormat() {
	 Random rng = new Random();
	 correctCounter = 0;
	 wrongCounter = 0;
	 num1 = rng.nextInt(10);
	 num2 = rng.nextInt(10);
	 
 }
 
 
 
 public void problemCheck(int number1,int number2) {
	 int total;
	 Random rng = new Random();
	 total = number1 + number2;
	 while(total < 10) {
		 
		 if(number1 + number2 < 10) {
			 System.out.println(number1 + " " + "+" + " " + number2 + "=?");
		 }else {
			 number1 = rng.nextInt(10);
			 number2 = rng.nextInt(10);
		 }	 
		 }
 }
}

