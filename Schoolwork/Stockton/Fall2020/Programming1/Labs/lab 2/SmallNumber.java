import java.util.Scanner;
import java.lang.Math;

public class SmallNumber
{
    
    
    public static void main(String[] args){
     Scanner scn = new Scanner(System.in);
     System.out.println("Write your first number: ");
     int a = scn.nextInt();
     System.out.println("Write your second number: ");
     int b = scn.nextInt();
     System.out.println(Math.min(a, b));
     
    }
    
    
}
