import java.util.*;

public class setsTester  {

	public static void main(String[] args) {
		Sets test = new Sets();
		HashSet<Integer> SetS = new HashSet<Integer>();
			SetS.add(2);
			SetS.add(6);
			SetS.add(4);
			SetS.add(9);
			SetS.add(7);
		HashSet<Integer> SetA = new HashSet<Integer>();
			SetA.add(2);
			SetA.add(6);
			SetA.add(9);
		HashSet<Integer> SetB = new HashSet<Integer>();
			SetB.add(6);
			SetB.add(7);
			SetB.add(4);
		
		HashSet<Integer> SetC = new HashSet<Integer>();
			SetC.add(6);
			SetC.add(7);
			SetC.add(8);
			
			
			test.validate(SetA,SetS);
			test.validate(SetB,SetS);
			test.validate(SetC,SetS);
			
			test.union(SetC,SetS);
			
			test.intersection(SetC,SetS);
			test.complimentSet(SetA,SetS);
	}
		
	
	
}
