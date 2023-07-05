import java.util.Scanner;
public class Rectangle {
	
	private int length;
	private int width; 
	
	public Rectangle () {
		
	}
	
	public void inputRectangle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello you are going to create a rectangle");
		System.out.println("Type the length of the rectangle and then press enter");
		int x = scan.nextInt();
		System.out.println("Type the width of the rectangle and then press enter");
		int y = scan.nextInt();
		System.out.println("Here is your rectangle");
		System.out.println("length: " + x);
		System.out.println("width: " + y);
	}
	
	public static void main(String[] args) {
		Rectangle rn = new Rectangle();
		
	rn.inputRectangle();
		
		
		
		
	}
	
}
