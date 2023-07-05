package probSet7;

public class prob8 {
/* ***********************************************************************************************************
 * This program creates two objects of type Incrementor and then increments each of their counter five times.
 * The purpose of this example is to understand the concept of the static variable. Unlike instance variables,
 * a static variable is shared between all instances of a class. 
 * *****************************************************************************************************/	
	public static void main(String[] args) {
		
		
		Incrementor count1 = new Incrementor();
		Incrementor count2 = new Incrementor(1000);
		
				
		System.out.println("\nFive values for count1 -->");
		countFiveTimes(count1);
		
		System.out.println("\nFive values for count2 -->");
		countFiveTimes(count2);		
		
	}
	
	public static void countFiveTimes(Incrementor count) {
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println(count.nextValue());
		}
	}

}
