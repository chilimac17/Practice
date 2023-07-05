/**
 * 
 * @author YourName
 *
 */
public class KWArrayListTest {
	public static void main(String args[])
	{
		KWArrayList alist = new KWArrayList<String>();
		
		//Test add method
		alist.add("Computer Science");
		alist.add("Mathematics");
		alist.add("Literacy");
		alist.add("Physics");
		alist.add("Chemistry");
		alist.add("Music");
		
		System.out.println(alist);
		// Test get method
		System.out.println("My major is: " + alist.get(0));
		
		// Test set method
		System.out.println("Replace Literacy with American History");
		System.out.println(alist.set(2, "American History"));
		System.out.println(alist);
		
		// Test remove method
		System.out.println("Remove Physics " + alist.remove(3));
		System.out.println(alist);

		// Test removeMiddleInsertEnd
		System.out.println("Test removeMiddleInsertEnd method");
		System.out.println(alist.removeMiddleInsertEnd());
		System.out.println(alist);

		// Test add in the middle
		System.out.println("Add Geometry into the 3rd position");
		alist.add(3, "Geometry");
		System.out.println(alist);
		
		// Test indexOf method
		System.out.println("The index of Chemistry is " + alist.indexOf("Chemistry"));
	}
}