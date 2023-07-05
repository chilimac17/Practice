
public class Monthly extends Appointment {

	public Monthly(int W, int X, int Y, String Z) {
		super(W, X, Y, Z);
		
	}
	
	public Boolean OccursOn(int b) {
		if(b == getMonth()) {
			return true;
		}
		else {
			return false;
	}
	}	

}
