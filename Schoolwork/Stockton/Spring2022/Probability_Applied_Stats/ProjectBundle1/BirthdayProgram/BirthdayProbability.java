package ProjectBundle1.BirthdayProgram;

public class BirthdayProbability {
    /*
    * global variables
    */
    private int counter;
    private double answer;
    
    /*
        this method conducts the propability test depending on what the user inputs in tester
        it creates a array of person objects
        uses that array and calls other method to populate it with person objects
        uses the populated array to compare the birthday
        update answer counter to record the number of hits
        prints the result for the user
    */ 
    public void shareBday(int numOfPeople,int runs){
        
        for(int i = 0; i < runs; i++){
            Person[] classRoom = new Person[numOfPeople];
           classRoom = addPeopleToClass(classRoom);
            answer += compareBday(classRoom);
            
        }
        
       
        double result = (answer/runs) * 100;
        
        System.out.println("The probability of 2 people having the same birthday in a class size of " +
        numOfPeople + " after " + runs + " trials " + " is " + result + "%");
    }
    
    /*
    this method will add the amount of students in the classroom
    this method takes in an an array of person objects 
    populates it with person objects to be used in the method above
    returns populated array
    */
    public Person[] addPeopleToClass(Person[] schoolRoom){
        for(int i =0; i < schoolRoom.length; i++){
            schoolRoom[i] = new Person();
        }

        return schoolRoom;
    }
    /*
    this method will compare the bdays in the class
    it takes in a array of person objects
    it goes through a double for loop to compare the bdays of each person object
    after a match has been hit it will update the the counter variable and break both loops
    this method will return 1 or 0 depending if a match has been made and resets every time its called
    */
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
