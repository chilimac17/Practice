public class Hamster {
    
    private int whiskers =25;  
    
    
    public int getWhiskers(){
        //this is a getter 
        return whiskers; 
    }    
    
 
    public static void main(String[] args){
        Hamster ace = new Hamster();
        
        int numberOfWhiskers = 0;  
        
        numberOfWhiskers = ace.getWhiskers(); 
        
        System.out.println(numberOfWhiskers); 
        
        numberOfWhiskers = ace.getWhiskers();
        
        System.out.println(numberOfWhiskers);
    }
    
}
