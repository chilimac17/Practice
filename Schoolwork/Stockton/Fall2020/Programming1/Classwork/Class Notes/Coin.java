import java.util.Random;
public class Coin{
    
  private int numberOfSides;
    Random rng = new Random();
    public Coin(){
        numberOfSides = 2;
    }
    
    public Coin(int userSides){
     numberOfSides = userSides;   
    }    
    
    public int flip(){
    return rng.nextInt();    
    }     
    
    public static void main(String[] args){
      Coin c1 = new Coin(2);  
      System.out.println(c1.flip());  
    }      
    
        
    }

