
public class Unit extends Card
{
    
    @Override
    public void attackCard(Card opponetCard){
      opponetCard.setLife(opponetCard.getLife() - this.getAttack()); 
    }
    
    @Override
    public void attackPlayer(Player c){
        c.setLifePoints(c.getLifePoints() - this.getAttack());
        
        
    }
    
}
