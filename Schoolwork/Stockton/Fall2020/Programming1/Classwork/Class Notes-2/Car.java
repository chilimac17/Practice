
public class Car
{
  //global variables
  private Person driver;
  private Person passenger;
  private int uberFee;
  
  public Car(){
      uberFee = 2;

      
    }
  //getters
  public Person getDriver(){
      return driver;
    }
    
  public Person getPassenger(){
      return passenger;
    }
  
  public int getUberFee(){
     return uberFee; 
    }
    
  //setters
  public void setDriver(Person newDriver){
        driver = newDriver;
    }
  
  public void setPassenger(Person newPassenger){
        passenger = newPassenger; 
    }
  
  public void setUberFee(int newUberFee){
      uberFee = newUberFee;
    }
  
    
  public void drive(Car drive){
         //drive.setMoney(drive.getMoney()+this.getMoney());
        
    }
    
}
