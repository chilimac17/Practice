package Classwork;

import java.util.ArrayList;

public class SetOperations {
    public ArrayList<String> getUnion(ArrayList<String> dayOfWeekList,ArrayList<String> dayOfWeekList2){
        ArrayList<String> unionList = new ArrayList<>();
            for(int i = 0; i < dayOfWeekList.size(); i++){
                String days = dayOfWeekList.get(i);
                unionList.add(days);
            }
            for(int i = 0; i < dayOfWeekList2.size(); i++){
                String days2 = dayOfWeekList2.get(i);
                if(!unionList.contains(days2)){
                    unionList.add(days2);
                }
            }
        return unionList;
    }
    public ArrayList<String> getIntersection(ArrayList<String> list1,ArrayList<String> list2){
        ArrayList<String> intersectionList = new ArrayList<>();
        //can use a double for loop to compare 
        //if vals are the same then add it to the intersectionList
        for(int i = 0; i < list1.size(); i++){
            String days = list1.get(i);
            if(list2.contains(days)){
                intersectionList.add(days);
            }

        }
        return intersectionList;
    }
    public ArrayList<String> getCompliment(ArrayList<String> list){
        ArrayList<String> complimentList = new ArrayList<>();
        String[] daysOfTheWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        for(int i = 0; i < daysOfTheWeek.length; i++){
            if(!list.contains(daysOfTheWeek[i])){
                complimentList.add(daysOfTheWeek[i]);
            }
        }

        return complimentList;
    }
    //now create the same methods except it takes in arrays and use numbers this time 
}
