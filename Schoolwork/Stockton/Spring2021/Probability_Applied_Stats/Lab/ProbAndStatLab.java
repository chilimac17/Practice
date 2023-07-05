import java.io.*;
import java.util.HashMap;
import org.jfree.chart.JFreeChart;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class ProbAndStatLab {
	//HashMap<Integer, Integer> data = new HashMap<Integer,Integer>();
	
	//this method will add the values into the HashMap
	public HashMap<Integer,Integer> addValue(HashMap<Integer,Integer> map){
		for(int i = 0; i <= 100; i++){
			map.put(i, (int)Math.pow(i,2));
		}
		
		return map;
	}
	//this method will print out everything in the hash map 
	//this method was created for mostly testing my data making sure it worked properly
	public void printHashMap(HashMap<Integer,Integer> map){
		for(Integer i : map.keySet()){
			System.out.println("x = " + i + " y = " + map.get(i));
		}
	}
	//this method will take in 2 hash maps.
	//it will take the original data from the first hash map salt it and put all the values in a new hash map
	public HashMap<Integer,Integer> saltData(HashMap<Integer,Integer> graphData,HashMap<Integer,Integer> saltyData){
		for(Integer i : graphData.keySet()) {
			int temp = graphData.get(i);
			temp = temp + (int)(-600 + Math.random() * 600);
			saltyData.put(i,temp);
		}
		return saltyData;
	}
	
	//this method takes in the salted data and empty hash map.
	//it smoothes the data and stores it into the empty hash map.
	public HashMap<Integer,Integer> smoothData(HashMap<Integer,Integer> saltData,HashMap<Integer,Integer> smoothHashMap){
		DescriptiveStatistics stats = new DescriptiveStatistics();
		stats.setWindowSize(3);
		int temp;
		//put value into stats
		for(Integer i : saltData.keySet()){
			stats.addValue(saltData.get(i));
			temp = (int)stats.getMean();
			smoothHashMap.put(i,temp);
		}
	
		return smoothHashMap;
	}
	//this method uses JFREEchart to create a graph out of a hash map.
	public void printGraph(HashMap<Integer,Integer> originalData,String graphTitle,String fileName) throws IOException{
		DefaultCategoryDataset data1 = new DefaultCategoryDataset();
		int counter = 0;
		int xValue = 0;
		for(Integer i : originalData.keySet()) {
			counter++;
			if(counter == 2) {
				xValue += counter;
				counter = 0;
			}
			data1.addValue( originalData.get(i) , graphTitle , String.valueOf(xValue));
		}
		
		 JFreeChart createGraph = ChartFactory.createLineChart(graphTitle,"X","Y",data1,PlotOrientation.VERTICAL,true,true,false);
		 	
	        int widthOfImage = 1800;    
	        int heightOfImage = 800;   
	        File xSquaredChart = new File(fileName + ".jpeg");
	        System.out.println("Graph has been made!");
	        ChartUtils.saveChartAsJPEG(xSquaredChart ,createGraph, widthOfImage ,heightOfImage);
	}
	

}
