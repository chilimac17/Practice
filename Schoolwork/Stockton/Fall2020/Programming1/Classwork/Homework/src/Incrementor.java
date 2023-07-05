
public class Incrementor {
	private static int counter;
	//
	public Incrementor() {
		counter = 1;
	}
	public Incrementor(int start) {
		start = -1;
		counter = start;
	}
	
	public int nextValue() {
		return counter++;
	}
	public static void countFive(Incrementor c) {
		for(int i = 0; i < 5; i++) {
			System.out.println(c.nextValue());
		}
	}
	
	
	public static void main(String[] args) {
		
		Incrementor count2 = new Incrementor(counter);
		Incrementor count1 = new Incrementor();
		
		//since we defined counter as a static variable
		//the same instances is shared for both instances of the class
		//when you declare count 2 first it saves the value for counter as -1
		//then you declare count 1 which would change the value of counter to 1
		//when you print it out with the countFive method for both count 1 and count 2 
		//it shows count 1 is 1-5 and count 2 is 6-10
		
		
		System.out.println("Count 1 values");
		countFive(count1);
		System.out.println("\nCount 2 values");
		countFive(count2);
		
		
		
	}
}
