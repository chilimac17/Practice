import java.util.*;

public class CircleArrayList {

	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Circle> circleList = new ArrayList<Circle>();
		System.out.println("Enter radius to make a circle. Enter -99 to stop");
		int n =0;
		
		while(n != -99) {
			 n = scan.nextInt();
			 if(n == -99) break;
			Circle c1 = new Circle(n);
			circleList.add(c1);
			
		}
	
		for(int i = 0; i < circleList.size(); i++) {
			System.out.println("circle" + (i + 1));
			System.out.println(" Radius " + circleList.get(i).radius + " Permineter " + circleList.get(i).cPerim() + " Area " + circleList.get(i).cArea());
		}
		
	}
	
}
