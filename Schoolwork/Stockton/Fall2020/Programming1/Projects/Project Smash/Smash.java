public class Smash{
  //this is all the gobal variables for all sub classes. 
  private int lifePercent;
  private int attack;
  private int grab;
  private int jump;
  private int dashAttack;
  private int neutralSpecial;
  private int x;
  private int y;
  private String name;
  private int throwing;
  
  //these are all the getters.
  public int getLifePercent(){
    return lifePercent;
  }    
  
  public int getDashAttack(){
     return dashAttack; 
  }    
  
  public int getAttack(){
    return attack;  
  }  
  
  public int getGrab(){
      return grab;
  }
  
  public int getNeutralSpecial(){
      return neutralSpecial;
  }
  
  public int getX(){
    return x;  
  }    
  
  public int getY(){
    return y;  
  }    
  
  public String getName(){
    return name;  
  }    
  
  public int getThrowing(){
    return throwing;  
  }    
  
  //these are all the setter.
  public void setLifePercent(int newLifePercent){  
    lifePercent = newLifePercent;
  }  
  
  public void setAttack(int newAttack){
    attack = newAttack;
  }  
  
  public void setGrab(int newGrab){
    grab = newGrab;
  }
  
  public void setDashAttack(int newDashAttack){
      dashAttack = newDashAttack;
  }

  public void setNeutralSpecial(int newNeutralSpecial){
      neutralSpecial = newNeutralSpecial;
  }
  
  public void setX(int newX){
   x = newX;   
  } 
  
  public void setY(int newY){
   y = newY;   
  } 
  
  public void setName(String newName){
      name = newName;
  }
  
  public void setThrowing(int newThrowing){
   throwing = newThrowing;   
  }   
    
    // shared methods
  

  public void attack(Smash beingAttack){
      beingAttack.setLifePercent(beingAttack.getLifePercent()+this.getAttack());
      System.out.println(this.getName()+ " attacked " + beingAttack.getName()); 
                
             if(beingAttack.getLifePercent()>=100){
                System.out.println(beingAttack.getName() + " Exploded off the map");}
  }    
  
  public void jump(){
      x = x+2;
      y = y+4;
      System.out.println(this.getName()+ " Jumped to (" + x + "," + y +")" );
  }
  
  public void grab(Smash toss){
    toss.setLifePercent(toss.getLifePercent()+this.getGrab());
    
            if(toss.getLifePercent()>=100){
                System.out.println(toss.getName() + " Exploded off the map");}
  }
  
  public void throwing(Smash send){
      send.setLifePercent(send.getLifePercent()+this.getThrowing());
  }
  
  public void neutralSpecial(Smash special){
      special.setLifePercent(special.getLifePercent()+this.getNeutralSpecial());
                
             if(special.getLifePercent()>=100){
                System.out.println(special.getName() + " Exploded off the map");}
    }  
  
  public void dashAttack(Smash dash){
      dash.setLifePercent(dash.getLifePercent()+this.getAttack());
      
            if(dash.getLifePercent()>=100){
                System.out.println(dash.getName() + " Exploded off the map");
              }
    }    
    
 
}    