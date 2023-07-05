public class Pokemon{
    private int nationalNumber; //= 34;
    private String type1; //= "Poison";
    private String type2; //= "Ground";
    //assume we wrote a bunch more of these gobal varibles
    private String status; //= "";
    
    private int hp; //= 81;
    private int attack; //= 102;
    private int age; 
    
    public int getHp(){
        return hp;
    }
    
    public int getAttack(){
        return attack;
    }  
   
    public void setHp(int newHp){
        hp = newHp;
    }
    
    public void setStatus(String newStatus){
        status = newStatus; 
    } 
    
    public void setAttack(int newAttack){
        attack = newAttack;
    } 
    
    public void attack(Pokemon someOtherPokemon){
        int otherPokemonHp = someOtherPokemon.getHp();
        otherPokemonHp = otherPokemonHp - this.getAttack();
        someOtherPokemon.setHp(otherPokemonHp);
        
    }
    
}    