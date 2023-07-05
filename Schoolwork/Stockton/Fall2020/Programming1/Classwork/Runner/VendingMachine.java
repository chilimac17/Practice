public class VendingMachine
{
    private int cans;
    private int tokens;
    
    
    public VendingMachine(int newcans,int newtokens){
        cans = newcans;
        tokens = newtokens;
    }
   
    public int getCans(){
        return cans;
    }
    
    public int getToken(){
        return tokens;
    }
    
    public  void insertToken(){
         tokens++; //soda.tokens=soda.tokens+1;
         cans--;   //soda.cans=soda.cans-1;
    }
   
    public static void main(String[] args){
        VendingMachine vendingmachine1 = new VendingMachine(20,10);
        System.out.println(vendingmachine1.getCans());
        System.out.println(vendingmachine1.getToken());
        vendingmachine1.insertToken();
        System.out.println(vendingmachine1.getCans());
        System.out.println(vendingmachine1.getToken());
         
        
        VendingMachine vendingmachine2 = new VendingMachine(30,5);
        System.out.println(vendingmachine2.getCans());
        System.out.println(vendingmachine2.getToken());
        vendingmachine2.insertToken();
        System.out.println(vendingmachine2.getCans());
        System.out.println(vendingmachine2.getToken());
        
        VendingMachine vendingmachine3 = new VendingMachine(40,20);
        System.out.println(vendingmachine3.getCans());
        System.out.println(vendingmachine3.getToken());
        vendingmachine3.insertToken();
        System.out.println(vendingmachine3.getCans());
        System.out.println(vendingmachine3.getToken());
    
    
    
    }
}
