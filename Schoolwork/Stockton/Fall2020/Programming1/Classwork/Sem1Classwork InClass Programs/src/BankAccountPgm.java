import java.util.Scanner;
public class BankAccountPgm {
	 //this method is a loop that will determine if you start out with a balance of 10,000 how many years will it take with an interest of 5% to reach 20,000.
    public int solveLoop(double startValue, double endValue, double interestRate){
      int years = 0;
      while(startValue <= endValue){
    	  
          startValue = startValue * interestRate + startValue;
          years++;
          
          
        }
      return years;
      
    }
    //making a new method that the user will provide the start and end value and interest rate and then it will claculate it 
    public static void userInputInterest() {
    	int years =0;
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Provide the start value your bank account has");
    	double startValue = scan.nextDouble();
    	System.out.println("Provide the end value that you want your bank account to be ");
    	double endValue = scan.nextDouble();
    	System.out.println("Provide the amount of interest rate in decimal form");
    	double interestRate = scan.nextDouble();
    	
    	
    	while(startValue <= endValue){
            startValue = startValue * interestRate + startValue;
            years++;
          
          }
    	
    	
    	System.out.println("From your start value to your end value it will take" + " " + years + " " +"years");
    	
    }
    
  public static void main(String[] args){
    
      BankAccountPgm bk = new BankAccountPgm();
      //start value, end value, interest in decimal
      bk.solveLoop(10000, 20000, .05);
      System.out.println(bk.solveLoop(1000,2000, .05));
      
      bk.userInputInterest();
      
    

    }
}
