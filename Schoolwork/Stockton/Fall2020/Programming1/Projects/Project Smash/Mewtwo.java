public class Mewtwo extends Smash{
  //character 1
  private int psystrike; //unique move
  
  public int getPsystrike(){
      return psystrike;
  }    
  
  public void setPsystrike(int newPsystrike){
      psystrike = newPsystrike;
  }
  
  public void Psystrike(Smash psych){
      psych.setLifePercent(psych.getLifePercent()+this.getPsystrike());
      
              if(psych.getLifePercent()>=100){
                System.out.println(psych.getName() + " Exploded off the map");}
  }   
  
  //specific moves 
  public Mewtwo(){  
      setLifePercent(0);
      setAttack(4);
      setDashAttack(12);
      setPsystrike(45);
      setNeutralSpecial(25);
      setX(0);
      setY(0);
      setName("Mewtwo");
      setGrab(2);
      setThrowing(5);
    } 
    
    

}    