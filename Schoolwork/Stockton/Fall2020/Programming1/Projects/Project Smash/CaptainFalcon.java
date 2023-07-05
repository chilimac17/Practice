public class CaptainFalcon extends Smash{
    //character 2
    private int blueFalcon; //unique move
  
  public int getBlueFalcon(){
      return blueFalcon;
  }    
  
  public void setBlueFalcon(int newBlueFalcon){
      blueFalcon = newBlueFalcon;
  }
  
  public void blueFalcon(Smash blue){
      blue.setLifePercent(blue.getLifePercent()+this.getBlueFalcon());
      
            if(blue.getLifePercent()>=100){
                System.out.println(blue.getName() + " Exploded off the map");}
  }   
    
    //specific moves
  public CaptainFalcon(){  
    setLifePercent(0);
    setAttack(3);
    setDashAttack(10);
    setBlueFalcon(40);
    setNeutralSpecial(28);
    setX(0);
    setY(0);
    setName("Captain Falcon");
    setGrab(2);
    setThrowing(5);
    } 
    
    
    
    
}