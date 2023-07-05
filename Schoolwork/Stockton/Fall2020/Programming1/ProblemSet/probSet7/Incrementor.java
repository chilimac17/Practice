package probSet7;

public class Incrementor {
/* *******************************************************************************************************
 * The Incrementor class has a static variable. The variable is shared between all instances of the class. 
 * *******************************************************************************************************/	
	private static int counter;
	
	
	//Constructors
	public Incrementor() {
		
		counter = 1;
	}
	
	public Incrementor(int startVal) {
		
		counter = startVal;
	}
	
	//Method(s)
	
	public int nextValue() {
		
		return counter++;
	}

}
