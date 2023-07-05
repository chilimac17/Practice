public class Nidoking extends Pokemon{
    
    public Nidoking(){
        setHp(81);
        setAttack(102);
        //exercise for yourselve, fill in constructor 
    }    
    
    public void rest(){
        //hp = 81; // doesnt work 
        setHp(81);
        //status = "sleep"; //doesnt work 
        setStatus("Sleep");
    }
    
}    