
public class IndexOfCoinicidenceTest {

	public static void main(String[] args) {
		
		IndexOfCoinicidence test = new IndexOfCoinicidence();
	    String testString="THERE ARE TWO WAYS OF CONSTRUCTING A SOFTWARE DESIGN ONE WAY\n" + 
	      		"IS TO MAKE IT SO SIMPLE THAT THERE ARE OBVIOUSLY NO\n" + 
	      		"DEFICIENCIES AND THE OTHER WAY IS TO MAKE IT SO COMPLICATED\n" + 
	      		"THAT THERE ARE NO OBVIOUS DEFICIENCIES THE FIRST METHOD IS FAR\n" + 
	      		"MORE DIFFICULT";
	    String testString2 = "VVQGYTVVVKALURWFHQACMMVLEHUCATWFHHIPLXHVUWSCIGINCMUHNHQRMSUIMH\n" + 
	      		"WZODXTNAEKVVQGYTVVQPHXINWCABASYYMTKSZRCXWRPRFWYHXYGFIPSBWKQAMZ\n" + 
	      		"YBXJQQABJEMTCHQSNAEKVVQGYTVVPCAQPBSLURQUCVMVPQUTMMLVHWDHNFIKJC\n" + 
	      		"PXMYEIOCDTXBJWKQGAN";
	      
	      double result1 = test.calculateIC(testString);
	      double result2 = test.calculateIC(testString2);
	      
	      System.out.println("Michael Chillemi\n" + "Midterm Question 4 \n");
	      System.out.println("Index Of Coinicidence of:  \n" + testString+ "\n" + "IC = " +result1 + " \n");
	      System.out.println("Index Of Coinicidence of:  \n" + testString2+ "\n" + "IC = " +result2);

	}

}
