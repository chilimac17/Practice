
public class Zelda extends Unit
{
    
    public Zelda()
    {
        // initialise instance variables
        setName("Zelda");
        setAttack(3);
        setLife(7); 
        setCost(6);
        setInfo("Name:"+ getName() + "Attack:" + getAttack() + "Life:" + getLife() + "Cost:" + getCost());
    }

    
}
