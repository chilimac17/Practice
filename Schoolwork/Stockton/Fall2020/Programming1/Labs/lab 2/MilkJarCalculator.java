public class MilkJarCalculator
{
 public static void main(String[] args)
 {
 double milk = 5.5; // gallons
 double jarCapacity = 0.75; // gallons
 double completelyFilledJars = milk / jarCapacity;
 
 //The error you get with the program is is you had a int instead of a double.

 System.out.println(completelyFilledJars);
 }
}