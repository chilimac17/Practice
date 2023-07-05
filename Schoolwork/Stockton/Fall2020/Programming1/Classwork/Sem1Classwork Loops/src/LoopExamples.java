
public class LoopExamples {
	
	public static void main(String[] args){
       //two kinds of loops that are most common 
	  //while loops and for loops
     //a while loop does not have an expected outcome
	//While this condition is met do the following
   //A for loop has an expect outcome 
  //you set the outcome in the statement
 //for(int i = 0;means i starts at 0, i < 4; when i is less than 4 run the loop  
//i++ as the last to increase i by 1 every time the loop runs, could also to i--        
        
		boolean hasLessThanADollar = true;
        double money = 0;
        
        while(hasLessThanADollar){
            money = money + .1;
            System.out.println(money);
            
            if(money > 1){
                hasLessThanADollar = false;
                System.out.println("has more than a dollar" + money);
            
        }
       
        
    }
    
    //while count is less than or equal to 10 do the following
    int count = 0; 
    while(count <= 10){
     count++;
     System.out.println(count);
    }
    
    
    
    //for
    //you use for when you know your loop will end at a specific point 
    for(int i = 0; i <= 10; i++){
    
        System.out.println(i);
       }
    String word = "Hello";
    
    //when you make for loops you can use i , j, k as your variables

    for(int i = 0;i <10; i++ ){
       
    	for(int j = 0; j<10; j++){
        
    	}

    }

    
    for(int i = 0;i < word.length(); i++ ){
        System.out.println(word.charAt(i) + "");

    	}
    
    }
 }
