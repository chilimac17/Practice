public class VendingMachine{
    private int cans;
    private int tokens;
    
    //this ia a default constructor
    public VendingMachine(){
        cans = 0;
        tokens = 0; 
    } 
    
    public VendingMachine(int userInputCanCount, int userInputTokenCount){   
        cans = userInputCanCount;    
        tokens = userInputTokenCount;
    }
    
    public int getCans(){
        return cans;
    }   
    
    public int getTokens(){
        return tokens;
    }    
    
    public void insertToken(){
        tokens = tokens + 1;
        cans = cans - 1;
    }
    
  
    public static void main(String[] args){
     VendingMachine cokeMachine = new VendingMachine();
     cokeMachine.insertToken();
     System.out.println(cokeMachine.getTokens() + "" + cokeMachine.getCans());
     
     VendingMachine spriteMachine = new VendingMachine(23, 7);
     spriteMachine.insertToken();
     System.out.println(spriteMachine.getTokens() + "" + spriteMachine.getCans());
 
    }    
    
}    