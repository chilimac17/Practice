
public class Fairy extends Unit
{
    
    public Fairy()
    {
        
    }

  
    @Override
    public void playItem(Card c1){
     c1.setLife(getLife() + 5);   
     //draw 3 cards 
    }
    
}
