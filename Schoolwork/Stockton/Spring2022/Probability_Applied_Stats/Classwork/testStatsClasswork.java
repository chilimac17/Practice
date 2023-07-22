package Classwork;
public class testStatsClasswork {
   
    public static void main(String[] args){
        statsClasswork s1 = new statsClasswork();
        int[] tester = {1,2,3,3,4,6,10};
        System.out.println(s1.getMean(tester));
        System.out.println(s1.getMedian(tester));
        System.out.println(s1.getMode(tester));



    }
}
