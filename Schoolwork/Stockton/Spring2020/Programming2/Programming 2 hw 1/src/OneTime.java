
public class OneTime extends Appointment {

	public OneTime(int W, int X, int Y, String Z) {
		super(W, X, Y, Z);
	}
		public Boolean OccursOn(int a, int b, int c) {
			if(a == getYear() && b == getMonth() && c == getDay()) {
				return true;
			}
			else {
				return false;
		}
	}
}
