
public class Car
{
    private Person driver;
    private Person pass;
    private double fee;
    
    public Car(){
     fee = 5;
     driver = new Person(0);
     
    }
    
    public void setPassenger(Person rider){
     pass = rider;   
    }
    
    public void drive(){
     double driverMoney = driver.getMoney() + fee;
     driver.setMoney(driverMoney);
     
     double passMoney = pass.getMoney() - fee;
     driver.setMoney(passMoney);
     
     
    }
    
    public void kickOutPassenger(){
        pass = null;    
    }
    
}
