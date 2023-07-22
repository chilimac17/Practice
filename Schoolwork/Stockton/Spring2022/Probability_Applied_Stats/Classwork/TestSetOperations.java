package Classwork;

import java.util.ArrayList;

public class TestSetOperations {
   
    public static void main(String[] args){
        SetOperations s1 = new SetOperations();
        //creating arraylist
        ArrayList<String> test1 = new ArrayList<>();
        ArrayList<String> test2 = new ArrayList<>();
        ArrayList<String> test3 = new ArrayList<>();

        //populating our lists
        test1.add("Monday");
        test1.add("Wednesday");
        test1.add("Thursday");
        test1.add("Sunday");

        test2.add("Monday");
        test2.add("Tuesday");
        test2.add("Thursday");
        test2.add("Friday");
        test2.add("Saturday");

        test3.add("Tuesday");
        test3.add("Sunday");

        System.out.println(s1.getUnion(test1, test2));
        System.out.println(s1.getIntersection(test1, test2));
        System.out.println(s1.getCompliment(test3));

    }
}
