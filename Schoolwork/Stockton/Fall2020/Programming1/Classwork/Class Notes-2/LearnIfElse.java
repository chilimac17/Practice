
public class LearnIfElse{

    
    public int addTwoNumber(int x, int y){
        int solution = x + y;
        
        if(solution > 0){ //if solution is greater than 0
           return solution; 
        }else if (solution <=0){ //if solution is less than or equal to 0 
            return solution;
        }else{//in all other cases 
            return solution;
        }
        
        //if there is more work to be done dont return on an else .
        
        
        //return solution ;
    }
    
    
    
    public static void main(String[] args){
        //== checks for exact eqaulity in numbers, only use this to check for int,null
        //becasue if you compare this way, it compares object references.
        // ! this here means NOT 
        //else statement never have parameters
        
        //&& means and 
        //|| means or
        int x = 5;
        int y = 6;

        //!= means "Not equals to"

        //>, <, <=, >=,
        //you can NOT do =< and =>

        //if x is greaterthan y it is true 

        boolean isOpen = false; 

        //prints this is false because it is false 
        if(isOpen){   //the stuff in the parenthesis, must be evaluated as a boolean
            System.out.println("This is true");
        }else{
            System.out.println("This is false");     
        }

        //if else and all other cases statement
        if(isOpen){   
            System.out.println("This is true");
        }else if(!isOpen){
            System.out.println("This is false");
        }else if(x == y){  //in all other cases
            System.out.println("other result");
        }

        //if statement in if else statement 
        if(isOpen){   //the stuff in the parenthesis, must be evaluated as a boolean
            System.out.println("This is true");
            //nested if statement
            if(x == y){
                //do this    
            }

        }else{
            System.out.println("This is false");     
        }

        if(x > y){   //the stuff in the parenthesis, must be evaluated as a boolean
            System.out.println("This is true");
        }else{
            System.out.println("This is false");     
        }

        //if x is not equal to why it is true 
        if(x != y){   //the stuff in the parenthesis, must be evaluated as a boolean
            System.out.println("This is true");
        }else{
            System.out.println("This is false");     
        }

        //is 5 = to 6 exactly?
        if(x == y ){   //the stuff in the parenthesis, must be evaluated as a boolean
            System.out.println("This is true");
        }else{
            System.out.println("This is false");     
        }

        //basic if / else statement  
        if(true){   //the stuff in the parenthesis, must be evaluated as a boolean
            System.out.println("This is true");
        }else{
            System.out.println("This is false");     
        }

        //if not true  
        if(!true){   //the stuff in the parenthesis, must be evaluated as a boolean
            System.out.println("This is true");
        }else{
            System.out.println("This is false");     
        }

    }
}
