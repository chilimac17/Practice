public class Boat{
    //new data type
    private String name = "BoattyMcBoatFace";
    private int passengers; // = 10;
    private int lifeBoats; // = 0;
    //todays lesson on constructor
    //Constuctors= populate all global variables 
    public Boat(){
        name = "My Boat";
        passengers = 4;
        lifeBoats = 1; 
    }    
    
    public Boat(String newName, int newPassengerCount, int newLifeBoatCount){
        name = newName;
        passengers = newPassengerCount;
        lifeBoats = newLifeBoatCount;
    
    }
    
    public static void main(String[] args){
       Boat titanic = new Boat();
       Boat stallion = new Boat();
       System.out.println(stallion.name + "" +stallion.passengers + "" +stallion.lifeBoats);
       //stallion.getColor();
       Boat greg = new Boat("Titanic", 1000, 37);
       System.out.println(titanic.name + "" +titanic.passengers + "" +titanic.lifeBoats);
       
       
       
    }   
    
    
}    