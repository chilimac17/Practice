package BirthdayProgram;


public class BirthdayProbability {
    private int counter;
    private double answer;
    
    //this method conducts the propability test depending on what the user inputs in tester
    public void shareBday(int numOfPeople,int runs){
        
        for(int i = 0; i < runs; i++){
            Person[] classRoom = new Person[numOfPeople];
           classRoom = addPeopleToClass(classRoom);
            answer += compareBday(classRoom);
            
        }
        
       
        double result = (answer/runs) * 100;
        
        System.out.println("The probability of 2 people having the same birthday" + "in a class size of " 
        + numOfPeople + ", after " + runs + " trials " + " is " + result + "%");
    }
    
    //this method will add the amount of students in the classroom
    public Person[] addPeopleToClass(Person[] schoolRoom){
        for(int i =0; i < schoolRoom.length; i++){
            schoolRoom[i] = new Person();
        }

        return schoolRoom;
    }

    //this method will compare the bdays in the class
    public int compareBday(Person[] schoolRoom){
       counter = 0;
       boolean breakCon = false;
        for(int i =0; i < schoolRoom.length && breakCon == false;i++){
            for(int j = i+1; j < schoolRoom.length; j++){
                if(schoolRoom[i].getBday() == schoolRoom[j].getBday()){
                    counter++;
                    breakCon = true;
                    break;
                }
            }
        }
        return counter;
        
    }
}
