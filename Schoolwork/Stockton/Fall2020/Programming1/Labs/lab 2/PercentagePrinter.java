import java.lang.Math;
public class PercentagePrinter
{
 public static void main(String[] args)
 {
     double probability = 8.70;
     float percentage = (float) (100 * probability);
     
     
     
     System.out.println(Math.round((float)percentage));
     
     //This program prints out the number 869. The program does this because it takes 8.70 and multiplys it by 100 to get the percent.
     //If you use the word int before the percent methods it will cut off the .999 but math.round fixes that problem.
 }
}