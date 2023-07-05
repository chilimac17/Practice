import java.util.Random;
public class GameShow {
	
	public static void main(String args[]){
	       Random rnd = new Random();
	       int lambo; 
	       int numberOfWins = 0; 
	       int pick = 1; 
	       int numberOfWins2 = 0;      
	       
	       for(int i = 0; i <= 500; i++){
	        lambo = rnd.nextInt(3) + 1;
	           
	        if(lambo == 1){
	            numberOfWins = numberOfWins +1;
	            
	            
	        }
	    
	        } 
	       System.out.println("Win Percent keep door = " + (double) numberOfWins/500 * 100); 
	       
	       
	       //picking the second door
	       for(int i = 0; i <= 500; i++){
	       
	        lambo = rnd.nextInt(2) + 1;
	           
	        if(lambo == 1){
	            numberOfWins2 = numberOfWins2 +1;
	            
	        
	        }
	    
	        }
	        
	       System.out.println("Win Percent change door = " + (double) numberOfWins2/500 * 100); 
	        
	       
	       
	       
	        
	    }
}
