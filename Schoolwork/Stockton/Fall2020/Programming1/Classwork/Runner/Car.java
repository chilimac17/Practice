public class Car{
    private static int wheels = 4; //static makes evrything the same
    
    public static int getWheels(){
        return wheels;
    }    
    
    public void setWheels(int newWheelCount){
        wheels = newWheelCount;
        
    }    
    
    public static void main(String[] args){
     Car henry = new Car(); 
     Car tom = new Car();
     
     System.out.println(Car.wheels);
     System.out.println(Car.getWheels());
     
     //gold standard for static examples
     System.out.println(Math.PI);
     System.out.println(Math.pow(2,8));
     
     
     System.out.println(henry.wheels);
     
     henry.wheels = 3;
     
     System.out.println(henry.wheels);
     System.out.println("Tom's wheels" + tom.wheels);
     
    
     
     
     
    }    
    
}    