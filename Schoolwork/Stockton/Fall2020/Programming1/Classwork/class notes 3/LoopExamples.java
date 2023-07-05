
public class LoopExamples
{
    public static void main(String[] args){
        //only 2 types he cares about 
        //while something is happening, repeat some code. 
        
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
    
    //count to 10 
    int count = 0; 
    while(count <= 10){
     count++;
     System.out.println(count);
    }
    
    
    
    //for
    //you use for when you know your program will end 
    for(int i = 0; i <= 10; i++){
    
        System.out.println(i);
    }
    
    




}
}