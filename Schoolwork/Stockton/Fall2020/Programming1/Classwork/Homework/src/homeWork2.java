import java.util.Scanner;
public class homeWork2 {

	public void mean() {
		Scanner scan = new Scanner(System.in);
		System.out.println("You will calculate the mean of 2 numbers");
		System.out.println("Please enter your first number ");
		double f1 = scan.nextDouble();
		System.out.println("Please enter another number");
		double f2 = scan.nextDouble();
		double m = (f1+f2) / 2.0;
		System.out.println("Your Arithmetic mean is " + " " + m);
		
	}
	
	public static void Hmean() {
		Scanner scan = new Scanner(System.in);
		System.out.println("You will calculate the harmonic mean of 3 numbers");
		System.out.println("Please enter your first number ");
		double f3 = scan.nextDouble();
		System.out.println("Please enter your second number");
		double f4 = scan.nextDouble();
		System.out.println("Please enter your last number");
		double f5 = scan.nextDouble();
		double m1 = 3/ (1/f3 + 1/f4 + 1/f5);
		System.out.println("Your Arithmetic mean is " + " " + m1);
		
	}
	
	public static void Hrent() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the house you want to rent int (sq ft)");
		System.out.println("Press Enter to see the rent for that size house");
		double area = scan.nextDouble();
		if(area >= 1300 ) {
			System.out.println("Your rent is 1700");
		} else if(area >= 1200 && area < 1300 ) {
			System.out.println("Your rent is 1500");
		} else if(area >= 1000 && area < 1200 ) {
			System.out.println("Your rent is 1350");
		} else if(area >= 800 && area < 1000 ) {
			System.out.println("Your rent is 1050");
		} else if(area < 800 ) {
			System.out.println("Your rent is 900");
		} else {
			System.out.println("Your Area is low and cannot calaculate the rent");
		}
	}
	public static void Pmonth() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number 1-12 ");
		System.out.println("Press Enter to see the month you picked");
		double month = scan.nextInt();
		if(month == 1 ) {
			System.out.println("The month you picked is January");
		} else if(month == 2) {
			System.out.println("The month you picked is February");
		} else if(month == 3 ) {
			System.out.println("The month you picked is March");
		} else if(month == 4 ) {
			System.out.println("The month you picked is April");
		} else if(month == 5 ) {
			System.out.println("The month you picked is May");
		} else if(month == 6 ) {
			System.out.println("The month you picked is June");
		} else if(month == 7 ) {
			System.out.println("The month you picked is July");
		} else if(month == 8 ) {
			System.out.println("The month you picked is August");
		} else if(month == 9 ) {
			System.out.println("The month you picked is September");
		} else if(month == 10 ) {
			System.out.println("The month you picked is October");
		} else if(month == 11 ) {
			System.out.println("The month you picked is November");
		} else if(month == 12 ) {
			System.out.println("The month you picked is December");
		} else {
			System.out.println("You only have 12 months in a year!");
		}
	}
	public static void evenOrOdd() {
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("Enter a number to see if it is Even or Odd");
		num = scan.nextInt();
		
		switch(num % 2) {
			case 0: System.out.println( num + " " + "is a Even number");
				break;
			case 1: System.out.println( num + " " + "is a Odd number");
		}
		//scan.close();
	}
	
	
	public static void main(String[] args) {
		homeWork2 hw = new homeWork2();
		
		System.out.println("Problem 1 Arithmetic Mean");
		hw.mean();
		
		System.out.println("Problem 2 Harmonic Mean");
		hw.Hmean();
		
		System.out.println("Problem 3 Rent of a House");
		hw.Hrent();
		
		System.out.println("Problem 4 picking a month");
		hw.Pmonth();
		
		System.out.println("Optional Problem Even or Odd");
		hw.evenOrOdd();
		
	}

}
