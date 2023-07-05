import java.util.Random;
import java.util.Scanner;

public class Animal{
    private String name;
    private int age;
    private String animalType;
    private int weight;
    private String color;
    
    public Animal(){
        Animal a1 = new Animal();
        Animal a2 = new Animal();

        
    }
    
    
    public Animal(String newName,int newAge,String newAnimalType,int newWeight,String newColor){
        name = newName;
        age = newAge;
        animalType = newAnimalType;
        weight = newWeight;
        color = newColor;
        
    }   
    
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getAnimalType(){
        return animalType;
    }
    
    public int getWeight(){
        return weight;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    public void setAge(int newAge){
        age = newAge;
    }
    
    public void setAnimalType(String newAnimalType){
        animalType = newAnimalType;
    }
    
    public void setWeight(int newWeight){
        weight = newWeight;
    }
    
    public void setColor(String newColor){
        color = newColor;
    }
    
    public void nAnimal(){
        //Animal 1 name
        System.out.println("Name of Animal 1: ");
        Scanner difName = new Scanner(System.in);
        setName(difName.nextLine());
        
        
    }
    
    
    public void printAnimal(){
        System.out.println();
    }
    
    
}
