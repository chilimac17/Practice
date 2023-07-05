import java.util.Scanner;

public class Animal{
    private String name;
    private int age;

    //default constructor
    public Animal(){
        name = "";
        age = 0; 
    }

    public Animal(String userInputName, int userInputAge){
        name = userInputName;
        age = userInputAge;
    }

    //getters
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    //setters

    public void setName(String newName){
        name = newName;
    }

    public void setAge(int newAge){
        age = newAge; 
    }

    //this is the utility methods 
    public void printAnimal(){
        System.out.println("Name: " + name + " " + " Age: " + age); //could have done getAge() too   
    }

    
    //freebie tostring method 
    //@Override
    //public String toString(){
    //return "Name: " + name + " " + " Age: " + age;
    //}
     

    public Animal createAnimal(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Name please! ");
        String userInputName = scn.nextLine();
        System.out.println("Age please! ");
        int userInputAge = scn.nextInt();

        return new Animal();  
    }
    
    
    
    
}
