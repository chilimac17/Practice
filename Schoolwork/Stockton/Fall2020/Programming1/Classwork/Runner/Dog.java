public class Dog {
    
    private int Eyes =2; 
    
    //This method will return the number of eyes. 
    public int getEyes(){
     
        return Eyes; 
    }    
    
    public void setEyes(int newEyeCount){
     Eyes = newEyeCount;       
    }
    
    //this will test the method above
    public static void main(String[] args){
        Dog James = new Dog();
        
        int numberOfEyes = 0;  
        
        numberOfEyes = James.getEyes(); 
        
        System.out.println(numberOfEyes); 
        James.setEyes(2);
        numberOfEyes = James.getEyes();
        
        System.out.println(numberOfEyes);
    }
    
}
