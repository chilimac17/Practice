
public class Daily extends Appointment {

	public Daily(int W, int X, int Y, String Z) {
		super(W, X, Y, Z);
		
	}
	
	public Boolean OccursOn(int a) {
		if(a == getYear() ) {
			return true;
		}
		else {
			return false;
	}
	}	
}

