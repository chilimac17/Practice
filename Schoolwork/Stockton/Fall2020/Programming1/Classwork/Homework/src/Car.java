
public class Car {
	//these are the instance variables
	private String Make;
	private String Model;
	private int YearOfManufacture;
	private double fuelLevel;
	private double fuelEfficiency;
	//
	//this is the constructor
	public Car(String mk, String md, int yr, double cap, double eff) {
		Make = mk;
		Model = md;
		YearOfManufacture = yr;
		fuelLevel = cap;
		fuelEfficiency = eff;
		
	}
	//these are my methods 
	 public String getMake(){
	        return Make;
	    }  
	 public String getModel(){
	        return Model;
	    }  
	 public int getYearOfManufacture(){
	        return YearOfManufacture;
	    }  
	 public double getfuelLevel(){
	        return fuelLevel;
	 }
	 public double getfuelEfficiency(){
	        return fuelEfficiency;
	 }
	 //these are the mutators
	 public void addFuel(double g) {
		 fuelLevel = fuelLevel + g;
	 }
	 public void drive(double m) {
		 fuelLevel = fuelLevel - m/fuelLevel;
	 }
	 
}
