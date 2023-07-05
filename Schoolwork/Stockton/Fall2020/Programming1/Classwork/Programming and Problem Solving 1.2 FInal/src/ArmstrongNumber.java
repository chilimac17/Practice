import java.util.*;
public class ArmstrongNumber {

	private void armStrong() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please provide a number to get all armstrong numbers until your provided number and then press enter");
		int n = scan.nextInt();
		int numLength = String.valueOf(n).length();
		double sum = 0;
		String numString = "";
		for(int i = 0; i <= n; i++) {
			numLength = String.valueOf(i).length();
			sum = 0;
			numString = String.valueOf(i);
			for(int j = 0; j < numLength; j++) {
				sum += Math.pow(Character.getNumericValue(numString.charAt(j)),(double)numLength);
			}
			if(sum == i ) {
				System.out.println(i);
			}
		}
	
		
	}
	
	
	public static void main(String[] args) {
		ArmstrongNumber a1 = new ArmstrongNumber();
		
		a1.armStrong();
		
	}

}
