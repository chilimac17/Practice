public class Tree {
     
    private int branches =100;  
    
     
    public int getbranches(){
     
        return branches; 
    }    
    
    public void setbranches(int newbranchesCount){
     branches = newbranchesCount;       
    }
    
    
    public static void main(String[] args){
        Tree bob = new Tree();
        //bob is the new tree. 
        System.out.println(bob.getbranches());
        int numberOfBranches = 0;  
        
        numberOfBranches = bob.getbranches(); 
        
        System.out.println(numberOfBranches); 
        bob.setbranches(50);
        numberOfBranches = bob.getbranches();
        
        System.out.println(numberOfBranches);
    }
    
}

