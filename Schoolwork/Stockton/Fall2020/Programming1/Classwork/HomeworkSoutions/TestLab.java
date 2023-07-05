
public class TestLab{

    public static void main(String[] args){
        
        Animal cat = new Animal("Dog", 3);
        Animal dog = new Animal("Cat", 4);
        cat.printAnimal();
        //System.out.println(cat); it can print animal 
        
        Labratory lab = new Labratory();
        Animal bob = lab.combineAnimals(cat, dog);
        
        System.out.println(bob);
        
        Animal croc = lab.randomAnimal(cat, bob);
        System.out.println(croc);
        
        croc.printAnimal();
        
        
    }
    
    
    
    
    
}
