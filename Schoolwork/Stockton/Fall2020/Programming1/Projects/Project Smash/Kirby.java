public class Kirby extends Smash{
    //character 3
    
  private int ultraSword; //unique move
  
  public int getUltraSword(){
      return ultraSword;
  }    
  
  public void setUltraSword(int newUltraSword){
      ultraSword = newUltraSword;
  }
  
  public void ultraSword(Smash sword){
      sword.setLifePercent(sword.getLifePercent()+this.getUltraSword());
      
            if(sword.getLifePercent()>=100){
                System.out.println(sword.getName() + " Exploded off the map");}
  }   
    
    
    //specific moves
  public Kirby(){  
    setLifePercent(0);
    setAttack(2);
    setDashAttack(12);
    setUltraSword(47);
    setNeutralSpecial(16);
    setX(0);
    setY(0);
    setName("Kirby");
    setGrab(2);
    setThrowing(5);
    } 
    
    
    
    
    
    
}   