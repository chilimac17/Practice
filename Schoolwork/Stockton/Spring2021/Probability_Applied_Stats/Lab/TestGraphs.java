import java.io.IOException;
import java.util.HashMap;

public class TestGraphs {

	public static void main(String[] args) throws IOException {
		HashMap<Integer, Integer> dataTest = new HashMap<Integer,Integer>();
		HashMap<Integer, Integer> saltedData = new HashMap<Integer,Integer>();
		HashMap<Integer, Integer> smoothData1 = new HashMap<Integer,Integer>();
		HashMap<Integer, Integer> smoothData2 = new HashMap<Integer,Integer>();
		ProbAndStatLab p1 = new ProbAndStatLab();
		ProbAndStatLab p2 = new ProbAndStatLab();
		ProbAndStatLab p3 = new ProbAndStatLab();
		ProbAndStatLab p4 = new ProbAndStatLab();
		
		p1.addValue(dataTest);
		p1.saltData(dataTest,saltedData);
		p1.smoothData(saltedData,smoothData1);
		p1.smoothData(smoothData1,smoothData2);
		//graph
		p1.printGraph(dataTest,"X^2","X^2 Graph");
		p2.printGraph(saltedData,"X^2 Salted","X^2 Salted Graph");
		p3.printGraph(smoothData1,"X^2 Smoothed 1","X^2 Smoothed Graph 1");
		p4.printGraph(smoothData2,"X^2 Smoothed 2","X^2 Smoothed Graph2");
	}

}
