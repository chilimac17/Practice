public class Spider {
     
    private int legs =8;  //this is how many legs a spider has 
    
     
    public int getLegs(){
     
        return legs; 
    }    
    
    public void setLegs(int newLegCount){
     legs = newLegCount;       
    }
    
    
    public static void main(String[] args){
        Spider steve = new Spider();
        
        int numberOfLegs = 0;  
        
        numberOfLegs = steve.getLegs(); 
        
        System.out.println(numberOfLegs); 
        steve.setLegs(7);
        numberOfLegs = steve.getLegs();
        
        System.out.println(numberOfLegs);
    }
    
}
