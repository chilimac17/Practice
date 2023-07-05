import java.util.Random;
import java.util.Scanner;

public class Labratory  {
   Animal a1 = new Animal();
   Animal a2 = new Animal();
   
   
  
   
    
  public Animal combineAnimal(Animal a1, Animal a2){
      Animal a3 = new Animal();
      String combineName = a1.getName() + a2.getName();
      int combineAge = a1.getAge() + a2.getAge();
      String combineAnimalType = a1.getAnimalType() + a2.getAnimalType();
      int combineWeight = a1.getWeight() + a2.getWeight();  
      String combineColor = a1.getColor() + a2.getColor();  
       
      a3.setName(combineName);
      a3.setAge(combineAge);
      a3.setAnimalType(combineAnimalType);
      a3.setWeight(combineWeight);
      a3.setColor(combineColor);
      
       return a3;
    }

    
  
  public Animal randomAnimal(){
      Animal a3 = new Animal();
      Random rnd = new Random();
   
   if(rnd.nextInt(2)==0){
          String rName = a1.getName();
          a3.setName(rName);
    
        }else{
       
          String rName = a2.getName();
          a3.setName(a1.getName());
       
    }
      
     if(rnd.nextInt(2)==0){
          int rAge = a1.getAge();
          a3.setAge(rAge);
    
   }else{
       
          int rAge = a2.getAge();
          a3.setAge(a1.getAge());
       
    }  
      
    if(rnd.nextInt(2)==0){
          String rAnimalType = a1.getAnimalType();
          a3.setAnimalType(rAnimalType);
    
   }else{
       
          String rAnimalType = a2.getAnimalType();
          a3.setAnimalType(a1.getAnimalType());
       
    }   
      
   if(rnd.nextInt(2)==0){
          int rWeight = a1.getWeight();
          a3.setWeight(rWeight);
    
   }else{
       
          int rAge = a2.getAge();
          a3.setAge(a1.getAge());
       
    }     
      
      
     if(rnd.nextInt(2)==0){
          String rColor = a1.getColor();
          a3.setColor(rColor);
    
   }else{
       
          String rColor = a2.getColor();
          a3.setColor(a1.getColor());
       
    }



    return a3;
}
}    