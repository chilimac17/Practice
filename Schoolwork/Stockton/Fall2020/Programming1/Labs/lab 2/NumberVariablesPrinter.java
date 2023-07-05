public class NumberVariablesPrinter
{
 public static void main(String[] args)
 {
 double n1 = 150;
 double n2 = n1;
 n2 = n2 * 20; // Grow n2
 System.out.println(n1);
 System.out.println(n2);
 
 //After you run this program the output is 150.0 and 3000.0.
 //This is because you put two print statments one of them prints n1 which is set to 150. 
 //The other print statement prints out 300.0 because you make n2 equal to n1 and then n2 equals n2 times 20.
 //So when you run it n2 is going is going to be 150 times 20 which equals 3000.  
 //It contrasted with 4.3 because you are using a method to change the value of something.
 
 
 }
}