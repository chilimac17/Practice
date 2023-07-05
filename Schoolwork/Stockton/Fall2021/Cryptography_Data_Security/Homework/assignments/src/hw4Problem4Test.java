
public class hw4Problem4Test {
	public static void main(String[] args) {
		hw4Problem4 l1 = new hw4Problem4("01101000010", 8);

		System.out.println("Testing step()");
		for (int i = 0; i < 10; i++){
			int bit = l1.step();
			System.out.println(l1 + " " + bit);
		}
		l1 = new hw4Problem4("01101000010",8);
		System.out.println("\nTesting generate()");
		for (int i = 0; i < 10; i++) {
			int r = l1.generate(5);
			System.out.println(l1 + " " + r);
		}
	}
}
