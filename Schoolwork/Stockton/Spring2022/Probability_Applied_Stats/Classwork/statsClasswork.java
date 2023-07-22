package Classwork;


public class statsClasswork{

public int getMean(int[] list){
    int answer = 0;
    if(list.length == 0){
        return 0;
    }

    for(int i = 0; i < list.length; i++){
        answer += list[i];
    }
    answer = answer / list.length;
    return answer;
}
public int getMedian(int[] list){
    int result = 0;
    if(list.length == 0) return 0;
    if(list.length % 2 == 0){
        //list is even
        result = (list[list.length/2-1] + list[list.length/2])/2;
    }else{
        //list is odd
        result = list[(list.length+1)/2];
    }    

    return result;
}
public int getMode(int[] list){
    int answer = 0;
    int count;
    
    for(int i = 0; i < list.length; i++){
        count = 0;
        for(int j = 0; j < list.length; j++){
            
            int numCom = list[i];
            if(numCom == list[j]){
                count++;
            }
        }
        if(count > 1) answer = list[i];
    }



    return answer;
}
public double getStanD(int[] list){
    double stanD = 0;
    double mean = 0;

    for(int i =0; i < list.length; i++){
        mean = mean + list[i];
    }
    mean = mean / list.length;
    double tempVal = 0;
    for(int i = 0; i < list.length; i++){
        double tempValues = Math.pow(mean - list[i],2);
        tempVal = tempVal + tempValues;  
    }

    stanD = tempVal / (list.length -1);
    stanD = Math.sqrt(stanD);

    return stanD;
}
//add variance 



}