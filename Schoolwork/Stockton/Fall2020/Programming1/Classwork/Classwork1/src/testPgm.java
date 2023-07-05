import java.util.Scanner;
public class testPgm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Choice");
		
		int choice = scan.nextInt();
		
		switch(choice) {
		
			case 1: System.out.println("I am in case 1");
			break;
			
			case 2: System.out.println("I am in case 2");
			break;
			
			case 3: System.out.println("I am in case 3");
			break;
			
			default: System.out.println("I am in default");
			break;
		}

	}

}
