import java.util.ArrayList;
import java.util.Collections;

public class MMM {
	ArrayList<Double> ranNumList = new ArrayList<Double>();
	
	
	public double findMedian(ArrayList<Double> input) {
		ArrayList<Double> tempList = new ArrayList<Double>();
		for(int i = 0; i < input.size(); i++){
			tempList.add(input.get(i));	
		}
		Collections.sort(tempList);
		double median;
		double totalElements = input.size();
		
		return median;
	}
	
	public double findMode() {
		double temp;
		for(int i = 0; i < this.arraylist; i++ ) {
		
			temp = this.arrayList(i);
			for(int j = 1; j < this.arralist; j++ ){
				if(temp == arrayList(j) ) {
					
				}
			}
		}
		return temp;
	}
	
	public double findMean(ArrayList<Double> values) {
		double mean = 0;
		double count = 0;
		double temp;
		for(int i = 0; i < values.size(); i++){
			count++;
			temp = values[i];
			mean = mean + temp;
		}
		mean = mean / count;
		return mean;
	}
	
	
	
	public static void main(String[] args) {
		
	}

}
