
public class Card extends CardGame
{
  private String name;
  private int attack;
  private int life;
  private int cost;
  private String info;
  
  //add items
  
  
  //method 
  
  public void playItem(Card c1){
      
    }
  
  public void attackCard(Card c){
      
    }
    
  public void attackPlayer(Player c){
      c.setLifePoints(c.getLifePoints() - this.getAttack());
    }
    
    
    
  //getters 
  
  public String getName(){
     return name; 
    }
  
  public int getAttack(){
     return attack; 
    }
  
  public int getLife(){
     return life; 
    }  
  
  public int getCost(){
     return cost; 
    }  
  
   
  public String getInfo(){
     return ("Name: " + getName() + "Attack:" + getAttack() + "Life:" + getLife() + "Cost:" + getCost()); 
    }
    
  //setters
  
  public void setName(String newName){
      name = newName;
    }
  
  public void setAttack(int newAttack){
      attack = newAttack;
    }
  
  public void setLife(int newLife){
      life = newLife;
    }  
  
  public void setCost(int newCost){
      cost = newCost;
    }  
  
  public void setInfo(String newInfo){
      info = newInfo;
    }
    
}

    

