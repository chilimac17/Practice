import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class Player extends CardGame
{
 //global variables    
 private int lifePoints;
 private int rupees;
 private String name;
 private int attack;
 //constructor 
 public Player(){
     lifePoints = 30;
     rupees = 0;
     name = " ";// make 
    }
 
 public void attackPlayer(Player c){
      c.setLifePoints(c.getLifePoints() - this.getAttack());
    }
    
 
    
    
 //getters 
 public String getName(){
     return name; 
    }  
 
 public int getLifePoints(){
     return lifePoints; 
    }  
 
 public int getRupees(){
     return rupees; 
    }     
 
 public int getAttack(){
     return attack; 
    }   
    
 //setters 
 public void setName(String newName){
      name = newName;
    }  
 
 public void setLifePoints(int newLifePoints){
      lifePoints = newLifePoints;
    }  

 public void setRupees(int newRupees){
      rupees = newRupees;
    }     
    
}

