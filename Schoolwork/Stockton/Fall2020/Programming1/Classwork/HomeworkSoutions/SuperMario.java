public class SuperMario{
   private int lives;
   private int coins;
   private String powerUp;
   //mario constructor 
   public SuperMario(int lives,int coins,String powerUp){ 
    this.lives = lives;
    this.coins = coins;
    this.powerUp = powerUp;
    }
   //this is the getter 
   public int getCoins(){
    return coins;
    } 
    
   public int getLives(){
    return lives;
    }
    
    public String getpowerUp(){
    return powerUp;
   }
   //this is the setter
   public void setCoins(int coins){
     this.coins = coins;  
    }    
    
   public void addCoins(int coins){
     this.coins+= coins;
    } 
   
    public void setLives(int lives){    
     this.lives = lives;  
    }    
   
   public void setPowerUp(String powerUp){
     this.powerUp = powerUp;  
    }  
      //main method 
   public static void main(String[] args){
   SuperMario mario = new SuperMario(5,5, "Star");
   System.out.println(mario.getLives());    
   mario.addCoins(605);    
   System.out.println("Mario's coin and life balance" + mario.getCoins());     
    }    
        
}    