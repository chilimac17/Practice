
public class DirectoryEntry extends KWArrayList{
	String name;
	String number;
	
	public DirectoryEntry(String name, String number) {
		this.name = name;
		this.number = number;
		
	}
	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
	}
 
}
