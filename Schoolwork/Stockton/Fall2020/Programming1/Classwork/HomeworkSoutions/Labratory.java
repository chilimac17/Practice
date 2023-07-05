import java.util.Random;

public class Labratory{
    
    
    public Animal combineAnimals(Animal a1, Animal a2){
        Animal a3 = new Animal(); 
        String animalName1 = a1.getName();
        String animalName2 = a2.getName();

        String animalName3 = animalName1 + animalName2;
        a3.setName(animalName3);

        return a3;

        //
        //return new Animal(a1.getName()+ a2.getName(), a1.getAge() + a2.getAge()); this works too 
    }
    
    public Animal randomAnimal(Animal a1, Animal a2){
        Random rng = new Random();
        int rngNumber = rng.nextInt(2); //0,1 thats what it puts out under 2
        String animalName;
        
        if(rngNumber == 0 ){
            animalName = a1.getName();
        }else{
            animalName = a2.getName();
        }
        
        int animalAge;
        int rngNumber2 = rng.nextInt(2);
        if(rngNumber == 0 ){
            animalAge = a1.getAge();
        }else{
            animalAge = a2.getAge();
        }
        
        
        return new Animal(animalName, animalAge);  
    }
    
    
}
