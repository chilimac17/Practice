package CSV_Writer;


import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.Random;

public class DataWriter {
	/*
		global variables
	*/
    Random rng = new Random();
	private FileWriter fileWriter;
	private BufferedWriter bufferWriter;
	
	/*
	this constructor will use filewriter to create a .CSV file 
	*/
	public DataWriter() {
		try {
			//.csv
			fileWriter = new FileWriter("FavNums.csv");
		} catch (Exception e) {
			System.out.println("Error Occured: " + e.toString());
		}
	}
	
	/*
		this method will create the data we will use to create another histogram and will be stored in a .csv file
		one column will be ID which will be from 0-1000
		the next column will be favorite number which will be a random number from 1-1000
	*/
	public void createData() {
		bufferWriter = new BufferedWriter(fileWriter);
		
		try {
		bufferWriter.write("ID " + "," + " Favorite Number \n");
		} catch (Exception e) {
			System.out.println("ERROR OCCURED: " + e.toString());
		}
		for(int i = 0; i <= 1000; i++ ) {
			try {
				int idNum = i;
				int favNum = rng.nextInt(1000) + 1;
				bufferWriter.write(idNum + "," + favNum + "\n");
			} catch (Exception e) {
				System.out.println("ERROR OCCURED: " + e.toString());
			}
		}
		try {
			bufferWriter.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
