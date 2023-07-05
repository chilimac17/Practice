import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class babyNameSplit {
	public static void main(String[] args) throws FileNotFoundException {
		//prompt the input and output file names 
		Scanner scan = new Scanner(System.in);
		System.out.println("Input File Name ");
		String inputFileName = scan.next();
		System.out.println("Output File Name for boys ");
		String outputFileName = scan.next();
		System.out.println("Output File Name for girls ");
		String outputFileName2 = scan.next();
		
		//pathway
		//\\Users\\mcchi\\Desktop\\Eclipse School\\Programming 2 hw 3\\src\\babynames.txt
		
		//create the scanner and printwriter objects for reading and writing the files
		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);
		PrintWriter out = new PrintWriter(outputFileName);
		PrintWriter out2 = new PrintWriter(outputFileName2);
		
		//System.out.println(in.nextLine());
		//read each line and store the names into a new file 
		
		while(in.hasNextLine()) {
			String numb1 = in.next();
			String boyName = in.next();
			String numb2 = in.next();
			String percent = in.next();
			String girlName = in.next();
			String numb3 = in.next();
			String numb4 = in.next();
			
			out.printf("%1s\n",boyName);
			out2.printf("%1s\n",girlName);
				}
		
       		
		scan.close();
		in.close();
		out.close();
		out2.close();
			}
}
