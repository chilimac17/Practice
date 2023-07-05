
public class SquareMethod {
	private int x;
    private int z;
    
    
   public SquareMethod() {
        // Initialize instance variables
        x = 2;
        z= 2;
    }

    
    public int sqrt(int x, int y)
    {
        int sum = x * y; 
        return sum;
    }

    public static void main(String[] args){
     SquareMethod sq = new SquareMethod();
     System.out.println(sq.sqrt(3,3));
     
        
    }
}
