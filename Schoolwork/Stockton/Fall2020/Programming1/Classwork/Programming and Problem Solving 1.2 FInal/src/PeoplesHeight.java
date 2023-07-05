import java.util.*;

public class PeoplesHeight {
	private static final int SENTINEL = -99;
	
	
	public ArrayList addHeight(ArrayList ar) {
		Scanner scan = new Scanner(System.in);
		int m = 1;
		while(m != 0) {
			System.out.print("Enter the height of as many people as you want in inches. \n When finished enter -99 to see  "); 
			m = scan.nextInt();
			 if(m == SENTINEL) break;
			 	ar.add(m);
		}
		return ar;
	}
	public int findMax(ArrayList ar) {
		int height = 0;
		for(int i = 0; i < ar.size(); i++ ) {
			if(height < (int)ar.get(i)) {
				height = (int) ar.get(i);
			}
			else {
			}
		}
		System.out.println("The tallest person in the arraylist is " + height);
		return height;
	}
	/*
	public void printArrayList() {
		for(int i = 0; i < heightList.size(); i++) {
			System.out.println(heightList.get(i));
		}
	}
	*/
	
	public static void main(String[] args) {
		PeoplesHeight h1 = new PeoplesHeight();
		ArrayList<Integer> heightList = new ArrayList<Integer>();
		h1.addHeight(heightList);
		h1.findMax(heightList);
		//h1.printArrayList();
		
		
	}
}
