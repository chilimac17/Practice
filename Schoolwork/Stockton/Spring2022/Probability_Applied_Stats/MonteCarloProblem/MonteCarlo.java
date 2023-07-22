package MonteCarloProblem;
import java.util.Random;

public class MonteCarlo {
    /*
        global variables
    */
    private int wins1 = 0;
    private int wins2 = 0;
    private int runs = 10000;
    private int winningDoor;
    private int playerDoor;
    private int goatDoor;
    private int switchDoor;
    Random rng = new Random();

    /*
        this method will display the probabilty if a contestant decides he wants to keep
        his initial door. uses a for loop to run the test 10,000 times. picks a random number from 0-2
        for the contestant and the prize door if the numbers match then wins will be increimented 
        after the loop you will return an average percent 
    */
    public double keepDoor(){
        for(int i = 0; i <= runs; i++){
            winningDoor = rng.nextInt(3);
            playerDoor = rng.nextInt(3);
            if(playerDoor == winningDoor){
                wins1++;
            }
        }
        double winPercent = ((double)wins1/runs) * 100;
        return winPercent;
    }

    /*
        this method displays if the contestant is shown a door that does not have the prize in it and is asked if they would like to switch
        the goal of this method is to display the chances of winning if the contestant did switch
        this method is structured simular to the methods above it runs a for loop to to run the test 10,000 times
        picks a random from 0-2 for the contestant and the prize door.
        after i ran awhile loop to set goatdoor equal to a door that the user did not pick or is not the prize door 
        once i got that value i added it to the contestant door and subtracted 3 from that to get the value of the door that the contestant 
        would switch to. then use a if statement to check if they are equal if they are add to the counter and then return the average in % form
    */
    public double changeDoor(){
        for(int i = 0; i <= runs; i++){
            winningDoor = rng.nextInt(3);
            playerDoor = rng.nextInt(3);

            goatDoor = winningDoor;

            while(goatDoor==winningDoor || goatDoor==playerDoor){
                goatDoor = rng.nextInt(3);
            }

            switchDoor = 3 - (goatDoor+playerDoor);
            
            /*
            tried using cases but found a more efficent way to changing the doors

            if(winningDoor == 2){
                winningDoor = rng.nextInt(2);
            }
            
            switch(playerDoor){
                case 0:
                    playerDoor = 1;
                    break;
                case 1:
                    playerDoor = 0;
                    break;
                default:
                    System.out.println("This should not happen");
                    
                
            }
            */

            if(switchDoor == winningDoor){
                wins2++;
            }
            
        }
        
        double winPercent = ((double)wins2/runs) * 100;
        return winPercent;
    }
    

    public void results(){
        System.out.println("Keep Door: " + keepDoor() + "%" );
        System.out.println("Change Door: " + changeDoor() + "%");
    }
    
}
