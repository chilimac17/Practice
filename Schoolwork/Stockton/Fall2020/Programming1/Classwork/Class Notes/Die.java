import java.util.Random;
public class Die
{
    private int numberOfSides;
    Random rng = new Random();
    public Die(){
        numberOfSides = 6;
    }
    
    public Die(int userSides){
     numberOfSides = userSides;   
    }    
    
    public int roll(){
    return rng.nextInt()+1;    
    }     
    
    public static void main(String[] args){
      Die d1 = new Die(6);  
      System.out.println(d1.roll());  
    }    
    
}
