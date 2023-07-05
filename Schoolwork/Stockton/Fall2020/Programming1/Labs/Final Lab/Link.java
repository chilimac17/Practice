
public class Link extends Unit
{
   
    
    public Link()
    {
        // initialise instance variables
        setName("Link");
        setAttack(6);
        setLife(5); 
        setCost(7);
        setInfo("Name:"+ getName() + "Attack:" + getAttack() + "Life:" + getLife() + "Cost:" + getCost());
    }

    //override getInfo method 
    
}
