
public class MasterSword extends Card
{
  

    public MasterSword()
    {
        
    }

    
    // do this for each item 
    @Override
    public void playItem(Card c1){
     c1.setAttack(getAttack() + 4);   
     c1.setLife(getLife() + 2);   
    }
    
    
}
