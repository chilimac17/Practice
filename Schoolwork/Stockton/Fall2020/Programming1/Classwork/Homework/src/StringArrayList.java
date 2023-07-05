import java.util.*;

public class StringArrayList {
	ArrayList<String> stringList = new ArrayList<String>();
	
	
	
	public void printArrayList() {
		for(int i = 0; i < stringList.size(); i++) {
			System.out.println(stringList.get(i));
		}	
	}
	
	public void addString() {
		Scanner scan = new Scanner(System.in);
		String s = "hi";
		while(s != " ") {
			System.out.print("Enter as many words into the Arraylist enter blank space to end it and then it will print everything in the Arraylist"); 
			s = scan.nextLine();
			 if(s.length() == 0) break;
			 
		stringList.add(s);
			
		}
	}
	public static void main(String[] args) {
		StringArrayList s1 = new StringArrayList();
		
		s1.addString();
		s1.printArrayList();
		

		
	}
	
}
