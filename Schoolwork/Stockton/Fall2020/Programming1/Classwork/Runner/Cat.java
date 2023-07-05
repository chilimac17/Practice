public class Cat {
    //this is a global variable.
     
    private int tails =2;
    
    //This method will return the number of tails. 
    public int getTails(){
     
        return tails; 
    }    
    
    public void setTails(int newTailCount){
     tails = newTailCount;       
    }
    
    //test method above
    public static void main(String[] args){
        Cat tom = new Cat();
        //make a local variable
        int numberOfTails = 0; // IMPORTANT you cant public or private a local variable 
        
        numberOfTails = tom.getTails(); 
        
        System.out.println(numberOfTails); 
        tom.setTails(1);
        numberOfTails = tom.getTails();
        
        System.out.println(numberOfTails);
    }
    
}
