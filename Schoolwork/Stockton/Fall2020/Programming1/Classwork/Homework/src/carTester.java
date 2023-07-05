
public class carTester {
//
	public static void main(String[] args) {
		Car c1 = new Car("Ford", "Mustang", 2019, 55.5, 22.6);
		Car c2 = new Car("Audi", "R8", 2020, 45.3, 16.2);
		
		//testing out methods in car class
		System.out.println("Your first car is a " + c1.getYearOfManufacture() + " " + c1.getMake() + " " + c1.getModel());
		System.out.println("Your second car is a " + c2.getYearOfManufacture() + " " + c2.getMake()+ " " + c2.getModel());
		
		System.out.println();
		System.out.println("You and a friend decide to take your cars out for a drive ");
		System.out.println();
		
		System.out.println("Your " + c1.getYearOfManufacture() + " " + c1.getMake() + " " + c1.getModel() + " has " + c1.getfuelLevel() + " Gallons of gas and has " + c1.getfuelEfficiency() + " miles per gallon");
		System.out.println("Your " + c2.getYearOfManufacture() + " " + c2.getMake() + " " + c2.getModel() + " has " + c2.getfuelLevel() + " Gallons of gas and has " + c2.getfuelEfficiency() + " miles per gallon");
		
		System.out.println();
		System.out.println("You both decide to go to your beach house ");
		System.out.println();
		
		c1.drive(30);
		c2.drive(30);
		
		System.out.println("The drive is 60 miles you both decide to get gas halfway through");
		System.out.println();
		
		System.out.println("Car 1 current fuel level " + c1.getfuelEfficiency());
		System.out.println("Car 2 current fuel level " + c2.getfuelEfficiency());
		System.out.println();
		
		c1.addFuel(30);
		c2.addFuel(27);
		
		System.out.println("Car 1 new fuel level " + c1.getfuelEfficiency() );
		System.out.println("Car 2 new fuel level " + c2.getfuelEfficiency() );
		
		c1.drive(30);
		c2.drive(30);
		
		System.out.println("You both make it there and enjoy the beach!!");
	}

}
