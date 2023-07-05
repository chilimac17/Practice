import java.util.ArrayList;

public class DirectoryEntryTest {

	public static void main(String[] args) {
		ArrayList<KWArrayList> phoneBook = new ArrayList<KWArrayList>();
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> numbers = new ArrayList<String>();
		//adding a new object type DirectoryEntry in the array list phone book
		names.add("John Smith");
		names.add("Mary Jane");
		names.add("Adam Smith");
		names.add("Betty James");
		names.add("Cathy Williams");
		names.add("Peter Robinson");
		
		numbers.add("555-549-1234");
		numbers.add("111-123-4567");
		numbers.add("222-123-4567");
		numbers.add("333-345-5678");
		numbers.add("567-234-1201");
		numbers.add("444-678-1234");
		
		
		
		/*
		phoneBook.add(new DirectoryEntry("John Smith","555-549-1234"));
		phoneBook.add(new DirectoryEntry("Mary Jane","111-123-4567"));
		phoneBook.add(new DirectoryEntry("Adam Smith","222-123-4567"));
		phoneBook.add(new DirectoryEntry("Betty James","333-345-5678"));
		phoneBook.add(new DirectoryEntry("Cathy Williams","567-234-1201"));
		phoneBook.add(new DirectoryEntry("Peter Robinson","444-678-1234"));
		*/
		
		//find the index of the of the person " Adam smith"
			System.out.println(names.indexOf("Adam Smith"));
			
		//add "freddy crooger" into the fourth position
			System.out.println("before" + names);
			names.add(4, "Freddy Crooger");
				System.out.println("after" + names);
			
		//remove 5th entry in the list
				System.out.println("before" + names);
				names.remove(5);
					System.out.println("after" + names);
				
			
		//retrive the 3rd information at the third entry
			
			
	}

}
