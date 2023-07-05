//these braces, tell you what it holds 
public class Runner{
    
    public void run (){
        
        //for now , were just using print statement, realize this isnt how real programs work 
        
        System.out.println("The Runner is Running!");
    }
    
    // main method, if it is in your class, belong at the very very end 
    
    public static void main(String[] args){
        
        //the keyword, means use the constructor. 
        Runner bob = new Runner();
        bob.run();
        
    }
    
}