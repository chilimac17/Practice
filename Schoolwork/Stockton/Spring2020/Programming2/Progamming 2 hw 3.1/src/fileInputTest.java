import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class fileInputTest {
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("babynames.txt");
		Scanner scan = new Scanner(file);
		//FileWriter writer = new FileWriter("\\Users\\mcchi\\Desktop\\Eclipse School\\Programming 2 hw 3\\src\\boynames45.txt");
		PrintWriter out= new PrintWriter("\\Users\\mcchi\\Desktop\\Eclipse School\\Progamming 2 hw 3.1\\src\\boynames45.txt");
		
		//stores the first and second token in file
		//String A = scan.next();
		//String B = scan.next();
		
		//prints michael and then the rest of the line 
		//System.out.println(B);
		//System.out.println(scan.nextLine());
		
		String second = "";
		
		while(scan.hasNextLine()) {
			String first = scan.next();
			second = scan.next();
			String third = scan.next();
			String fourth = scan.next();
			String fifth = scan.next();
			String sixth = scan.next();
			String seventh = scan.next();
			
			//System.out.println(second);
			out.printf(second);
			
		}
		

		
			scan.close();
			out.close();
		
	}

}





