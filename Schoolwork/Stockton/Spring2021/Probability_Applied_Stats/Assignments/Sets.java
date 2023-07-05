import java.util.*;
public class Sets {
	//this method will determine if set x is a subset to set y 	
	public void validate(HashSet<Integer> x, HashSet<Integer> y) {
		int b = 0;
		int h = 0;
		Iterator<Integer> it = y.iterator();
		Iterator<Integer> it2 = x.iterator();
			while(it2.hasNext()) {
				h = it2.next();//store each number as it went through the loop 
				if(y.contains(h)) { //to compare if the stored number is in the big set 
					b++;
					}else {
						break;
					}
				}
					if(b == x.size()) { // checks if it is a subset
						System.out.println("Set" + x + "is a Subset of "+ y);
					}else {
						System.out.println("Set" + x + "is not a Subset of "+ y);
					}
}

	//this method will create the union of two sets given
	public void union(HashSet<Integer> x, HashSet<Integer> y) {
		int z = 0;
		HashSet<Integer> SetX = new HashSet<Integer>();
		Iterator<Integer> it = y.iterator();
		Iterator<Integer> it2 = x.iterator();
			//this while loop will add the elements of the larger set to a new set
			while(it.hasNext()) {
				z = it.next();
				SetX.add(z);
			}
			//this loop will compare the new set to the second set and if it contains the same value stored in z it will do nothing if it does not it will add it to the new set 
			while(it2.hasNext()) {
				z = it2.next();
				if(SetX.contains(z)){
				}else{
					SetX.add(z);
				}
			}
		System.out.println("the union of " + x + " and " + y + " is " + SetX );
}
	//this method will show the intersection of two sets 
	public void intersection(HashSet<Integer> x, HashSet<Integer> y) {
		int m = 0;
		HashSet<Integer> SetY = new HashSet<Integer>();
		Iterator<Integer> it = y.iterator();
		Iterator<Integer> it2 = x.iterator();
		while(it.hasNext()) {
			m = it.next();
			if(y.contains(m) && x.contains(m) ) {
				SetY.add(m);
			}
		}
		
		System.out.println("The intersection of " + x + " and " + y + " is " + SetY);
	}
	//this method will take in two sets and show the compliment of the sets 
	public void complimentSet(HashSet<Integer> x, HashSet<Integer> y) {
		int n = 0;
		HashSet<Integer> SetZ = new HashSet<Integer>();
		Iterator<Integer> it = y.iterator();
		Iterator<Integer> it2 = x.iterator();
		while(it.hasNext()) {
			n = it.next();
			if(y.contains(n) && x.contains(n)) { //if both sets have the same number stored in n then it will do nothing if it doesn't it will be added to the new set 
			}else {
				SetZ.add(n);
			}
		}
		System.out.println("The compliment set of " + x + " and " + y + " is " + SetZ);
	}
}