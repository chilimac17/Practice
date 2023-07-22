package BirthdayProgram;

import java.util.Random;

public class Person{
    private int days = 365;
    private int bday;
    Random rng = new Random();

    public Person(){
        bday = rng.nextInt(days) + 1;
    }

    public int getBday(){
        return bday;
    }
}