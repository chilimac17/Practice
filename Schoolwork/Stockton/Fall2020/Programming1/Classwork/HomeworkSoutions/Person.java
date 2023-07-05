
public class Person
{
   private double money;
   
   public Person(double startingAmount){
       money = startingAmount;
    }
   
    public double getMoney(){
        return money;    
    }
    
    public void setMoney(double newMoneyAmount){
        money = newMoneyAmount; 
    }
}
