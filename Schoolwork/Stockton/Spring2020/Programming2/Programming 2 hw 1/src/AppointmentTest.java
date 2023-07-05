import java.util.*;
public class AppointmentTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Appointment[] appointment = new Appointment[5];
		appointment[0] = new OneTime(2020, 5,17,"Teeth Cleaning");
		appointment[1] = new Monthly(2020, 5,17,"Xrays");
		appointment[2] = new OneTime(2020, 7,15,"Cavity Filling");
		appointment[3] = new Daily(2020, 4,1,"Root Canal");
		appointment[4] = new Daily(2020, 2,15,"Pulling Teeth");
		
		System.out.println("Please input the year of your appointment");
		int userYears = scan.nextInt();
		System.out.println("Please input the month of your appointment");
		int userMonth = scan.nextInt();
		System.out.println("Please input the day of your appointment");
		int userDay = scan.nextInt();
		System.out.println("You searched " + "" + userYears + " " + userMonth + " "+ userDay);
		
		for(int i = 0; i < 5; i++) {
			if(appointment[i].OccursOn( userYears, userMonth, userDay) == true) {
				System.out.println("Your appointment is a " + " " + appointment[i].getDescription() + " "+ "on" + " "+ userDay + " "+ userMonth + " "+ userYears);
			}
		}

	}

}
