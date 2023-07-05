import java.util.*;

public class dentistTest {

	public static void main(String[] args) {
		dentistAppointment a1 = new dentistAppointment(2020,1,7);
		Scanner scan = new Scanner(System.in);
		ArrayList<String> app = new ArrayList<String>();
		
		app.add("2020 1 7");
		app.add("2020 10 5");
		app.add("2020 10 6");
		app.add("2020 3 5");
		app.add("2020 8 29");
		app.add("2020 10 5");
		app.add("2020 12 17");
		app.add("2020 6 6");
		
		System.out.println("Hello enter the day, month or year for the appointment you are looking for.");
		String userDate = scan.nextLine();
		
		
		System.out.println();
	}

}
