
public class ProblemFour {
	
	 public static void manipString(String[] stringArray) {
		 for(int i = 0; i < stringArray.length; i++) {
			 stringArray[i] = "Hello there";
		 }
	}
	 public static void manipChar(char[] charArray) {
		 for(int i = 0; i < charArray.length; i++) {
			 charArray[i] = 'H';
		 }
	}
	 public void printArray(String[] s) {
			for(int i = 0; i < s.length; i++) {
				System.out.print(s[i] + " ");
			}
		}
	 public void printArrayChar(char[] c) {
			for(int i = 0; i < c.length; i++) {
				System.out.print(c[i] + " ");
			}
		}
	 
	public static void main(String[] args) {
		ProblemFour p4 = new ProblemFour();
			/*
		The first question in problem 4 asks what would happen if you
		ran the string array in the provide method?
		when you run the string array in the method manipString it will change every
		string in the array to be "Hello there".
			*/
			String[] S = {"Welcome","to", "CSCI-", "2102"};
			manipString(S);
			p4.printArray(S);
			System.out.println("");
			/*
		The second part of the question asked how would the method be different if
		it accepted a single character and we pass it to a single variable of type char?
		well made a duplicated method that accepts an array of type char 
		then i made type char array with some random characters and ran it through the
		method. My results were that it ran through the for loop and changed every 
		every character to 'H' similar to the original method. 	
			*/
			char[] C = {'w', 't', 'c', '2'};
			manipChar(C);
			p4.printArrayChar(C);
	}

}