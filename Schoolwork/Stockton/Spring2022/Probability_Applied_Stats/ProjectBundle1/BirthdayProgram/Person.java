package ProjectBundle1.BirthdayProgram;
import java.util.Random;

public class Person{
    /*
        global variables
    */
    private int days = 365;
    private int bday;
    Random rng = new Random();

    /*
        this constructor will assign a random birthday to every person object
        from 1 - 365
    */
    public Person(){
        bday = rng.nextInt(days) + 1;
    }

    /*
        this method will return the birthday which will be used in BirthdayProbability
        returns bday of person object
    */
    public int getBday(){
        return bday;
    }
}