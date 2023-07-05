import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestRecursion {

	@Test
	public void testNegative() {
		int result = RecursionLab.gcd(-6, 2);
		
		assertEquals("gcd of -6 and 2 is 2",2,RecursionLab.gcd(-6, 2));
	}
	@Test
	public void testBIS0() {
		int result = RecursionLab.gcd(4, 0);
		
		assertEquals("gcd of 4 and 0 is 0",0,RecursionLab.gcd(4, 0));
	}
	@Test
	public void testPositive() {
		int result = RecursionLab.gcd(8, 2);
		
		assertEquals("gcd of 8 and 2 is 2",2,RecursionLab.gcd(8, 2));
	}
	@Test
	public void testPrime() {
		
	}
	@Test
	public void testAIsLarger() {
		int result = RecursionLab.gcd(36, 12);
		
		assertEquals("gcd of 36 and 12 is 12",12,RecursionLab.gcd(36, 12));
	}
	@Test
	public void testBIsLarger() {
		int result = RecursionLab.gcd(12, 36);
		
		assertEquals("gcd of 12 and 36 is ",12,RecursionLab.gcd(12, 36));
	}
	@Test
	public void testBDividesEvenlyIntoA() {
		int result = RecursionLab.gcd(10, 5);
		
		assertEquals("gcd of 10 and 5 is ",5,RecursionLab.gcd(10, 5));
	}
	@Test
	public void test0() {
		int result = RecursionLab.gcd(0, 0);
		
		assertEquals("gcd of 0 and 0 is ",0,RecursionLab.gcd(0, 0));
	}
	@Test
	public void testGCDGreaterThan1LessThanAandB() {
		int result = RecursionLab.gcd(60,40 );
		
		assertEquals("gcd of 60 and 40 is ",20,RecursionLab.gcd(60,40));
	}
	@Test
	public void testGCDIs1() {
		int result = RecursionLab.gcd(55, 43);
		
		assertEquals("gcd of 55 and 43 is ",1,RecursionLab.gcd(55, 43));
	}
	@Test
	public void testAEqualsB() {
		int result = RecursionLab.gcd(5, 5);
		
		assertEquals("gcd of 5 and 5 is ",5,RecursionLab.gcd(5,5));
	}

}
