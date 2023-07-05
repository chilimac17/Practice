import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class fileInputTest {
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("/Users/mikechillemi/Desktop/babynames2.txt");
		Scanner scan = new Scanner(file);
		PrintWriter out = new PrintWriter("boynames75.txt");
		
		//stores the first and second token in file
		//String A = scan.next();
		//String B = scan.next();
		
		//prints michael and then the rest of the line 
		//System.out.println(B);
		//System.out.println(scan.nextLine());
		
		while(scan.hasNextLine()) {
			String first = scan.next();
			String second = scan.next();
			String third = scan.next();
			String fourth = scan.next();
			String fifth = scan.next();
			String sixth = scan.next();
			String seventh = scan.next();
			
			System.out.println(second);
			out.printf(second);
		}
		

		
			scan.close();
			out.close();
		
	}

}
