//java programs are made up of global variables 
//1.Global variables - Instance variables 
// --they are varibles that exist throughout your class. 
// -- they are the attribute of your class 
//2.Constructors - its job is to populate all global variables with a value
//3. Methods - three times of methods getters, setters, and utility methods 
// book calls accessors and mutators. 

public class Jogger {
    //this is a global variable.
    //it is not created inside of the methose 
    private int legs =2; // all global variables should be private. 
    
    //This method will return the number of legs. 
    public int getLegs(){
     
        return legs; 
    }    
    
    public void setLegs(int newLegCount){
     legs = newLegCount;       
    }
    
    //test method above
    public static void main(String[] args){
        Jogger bill = new Jogger();
        //make a loal variable
        int numberOfLegs = 0; // IMPORTANT you cant public or private a local variable 
        
        numberOfLegs = bill.getLegs(); 
        
        System.out.println(numberOfLegs); 
        bill.setLegs(3);
        numberOfLegs = bill.getLegs();
        
        System.out.println(numberOfLegs);
    }
    
}
