import java.util.Scanner;
import java.util.Random;
//use a scanner, get a persons name upper case, lower case it 
//print out a random number between 1-100

public class UsingMethods
{
    private int random;
    private int seed;
    public UsingMethods(){
        Random rnd = new Random();
        rnd.setSeed(seed);
    }    
    
    
    public static void main(String[] args){
        //String name = "Your own name!"; 
        Scanner scn = new Scanner(System.in);
        //scan for user input store name varible 
        //generate random number store then print it
        String name;
        name = scn.next(); 
        System.out.println("Insert name");
        
        
        
        
        
        
        
        System.out.println(name.toUpperCase());
        //System.out.println(name.toLowerCase());
  
        
        
        
        
        
    }   
        
}
        //testing new 
        /*
        System.out.println(name.trim());
        System.out.println(name.intern());
        System.out.println(name.toString());
        */
       
    
       
       
       
       
       
       
       

    
    


