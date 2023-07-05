import java.util.Random;
public class FunctionGraph {

	public void functionProb() {
		for(int i = 0; i <= 100; i++) {
			int b = 0;
		
			Random ran = new Random();
			int z = ran.nextInt(100);
			int a = ran.nextInt(2);
			double x = i;
			double y = Math.pow(x, 2);
			
			if(a == 1) {
				b = (int)y + z;
			}
			if(a == 0) {
				b = (int)y - z;
			}
			
			System.out.println("The x value is x = " + x +" The y value is y = " + y + " New Number = " + b);
		
		}
	}
	
	
	public static void main(String[] args) {
		FunctionGraph fun = new FunctionGraph();
		
		fun.functionProb();
		
	}

}
