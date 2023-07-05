import java.awt.Rectangle;
public class RectanglePrinter
{
 public static void main(String[] args)
 {
 Rectangle r1 = new Rectangle(0, 0, 100, 50);
 //Rectangle r2 = new Rectangle(0, 0, 100, 50);
 Rectangle r2 = r1;
 r2.grow(10,20);
 
 System.out.println(r1);
 System.out.println(r2);
 
 
 //The output of the second rectangle is java.awt.Rectangle[x=-10,y=-20,width=120,height=90].
 
 //After you modify the program and change the code the output is still the same. 
 //This is because you still apply the grow method after you make rectangle 2 equal rectangle 1. 
 }
}