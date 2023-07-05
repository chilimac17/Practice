
public class Appointment  {
	private int year;
	private int month;
	private int day;
	private String description;
	
	public Appointment(int W,int X,int Y,String Z) {
		year = W;
		month = X;
		day = Y;
		description = Z;
	}
	
	public Boolean OccursOn(int a, int b, int c) {
		if(a == getYear() && b == getMonth() && c == getDay()) {
			return true;
		}
		else {
			return false;
	}
	}	
	
	
	
	public void setYear(int set_years) {
		year = set_years;
	}
	public int getYear() {
		return year;
	}
	public void setMonth(int set_months) {
		month = set_months;
	}
	public int getMonth() {
		return month;
	}
	public void setDay(int set_days) {
		day = set_days;
	}
	public int getDay() {
		return day;
	}
	public void setdescription(String set_description) {
		description = set_description;
	}
	public String getDescription() {
		return description;
	}


	
}