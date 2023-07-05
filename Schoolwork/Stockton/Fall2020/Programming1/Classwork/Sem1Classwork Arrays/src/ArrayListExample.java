import java.util.ArrayList;
public class ArrayListExample
{
    public static void main(String[] args){
     
     ArrayList<String> names = new ArrayList<>();
     // <> diamonds
     
     //add elements
     names.add("Mike");//0
     names.add("Bob");//1
     names.add("Tim");//2
        
     //loop and print
     //allow modification 
     for(int i = 0; i< names.size(); i++){
      System.out.println(names.get(i));     
        
      }
     //get specific elements
     System.out.println(names.get(2)); 
     
     names.add(1,"Fred");
     
     names.remove(1);
     
     //new loop for each loop
     
     for(String singleElementName: names){
         System.out.println(singleElementName);
         
        }
     //this loop has one purpose to inspect elemnts in an array
        
     //boolean
     //double
     //int
     
     int someNumber = Integer.MAX_VALUE;
     //used on next lab (bottom)
     int otherNumber = Integer.parseInt("100");
     
     Integer box = someNumber;
     someNumber = box;
     //auto boxing
     ArrayList<Integer> numbers = new ArrayList<>();
     
    }
}
