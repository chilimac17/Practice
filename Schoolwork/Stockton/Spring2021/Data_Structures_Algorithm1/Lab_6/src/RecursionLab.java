/**
 * Lab 5: Recursion Lab Assignment
 * 
 * (1) Find the comment below in the gcd method.  Implement gcd recursively as
 *     specified.
 *     
 * (2) Create a JUnit test class.  In that test class, have JUnit test methods
 *     to test your gcd method.  Make sure you include (X) test cases to test for
 *     negative inputs, as well as positive inputs. (X) Make sure you test the base case.
 *     (X)Make sure you have test cases where a is larger and where b is larger.
 *     (X)Include a test case where b divides evenly into a, and thus where b is the gcd.
 *     (X)Include a test case, where a and b don't share any divisors other than 1, and thus
 *     the gcd is 1. (X) Include a test case where a equals b.(X) Include a test case where
 *     the gcd is greater than 1, but less than both a and b.(X)Include a test case for gcd(0,0)
 *     which is defined as 0 (if you think it should be infinity, it's not--ask a mathematician
 *     to explain why gcd(0,0)=0 if you really want to know why).
 *     
 *     For each test case, you should have a test method in your JUnit test class.
 *     Eclipse with create an empty one for you.
 *     Notice the @Test that appears before the method.  Each test method should be
 *     preceded by @Test to let JUnit know it is a test case.
 *     Your test method should use assertEquals to compare what gcd returns to the correct
 *     result that you expect.  E.g., consider gcd(5,0).  The correct result should be 5.
 *     So, your test method (if that was one of your test cases) would have a statement:
 *     assertEquals("gcd of x and 0 is x", 5, RecursionLab.gcd(5,0));
 *     In general the assertEquals structure is as follows:
 *     assertEquals("descriptive test case message", expected result, actual result);
 *     
 *     Don't put all of your test cases in a single test method.  You won't get as useful 
 *     information out of JUnit if you do it that way.
 *     
 *     Reminder, you can run JUnit, using "run as."
 *     
 * (3) Submit your RecursionLab.java and your JUnit test class.  You may want to attach the
 *     2 .java files in the submission area on the Blackboard.
 *     
 *     
 * @author Michael Chillemi
 */
public class RecursionLab {

	/**
	 * Computes the greatest common divisor (gcd) of two integers: the greatest
	 * integer that divides both a and b without a remainder.
	 * 
	 * @param a An integer
	 * @param b Another integer
	 * @return gcd(a,b)
	 */
	
	// (1) To get credit for this lab assignment you must implement this method
			// using recursion.
			// 
			// Here's how you can compute the gcd of two integers:
			//  -- First, let's make sure this doesn't fail on negative values.  If
			//     either a or b (or both) are negative, make a recursive call to your
			//     gcd method using the absolute value of a and b (the Math class has a 
			//     method for absolute value).
			//  -- Second, to make what follows easier, let's assume that a >= b.
			//     However, you don't want to force the programmer using your method
			//     to adhere to that.  So instead, if b > a, make a recursive call to gcd
			//     to switch them.
			//  -- Base Case: The gcd(x, 0) is x 
			//  -- Recursion: You can prove, but we won't actually do so, 
			//     that gcd(a, b) equals the gcd(b, a mod b).	
	
	public static int gcd(int a, int b) {
		if(a < 0 || b < 0) {
			return gcd(Math.abs(a),Math.abs(b));
		}
		if(b == 0) {
			return 0;
		}
		if(a % b == 0) {
			return b;
		}else if(a < b) {
			return gcd(b,a);
		}else {
			return gcd(b, a % b);
		}
	}
	public static void main(String[] args) {
		System.out.println(gcd(-6,2));
	}
}