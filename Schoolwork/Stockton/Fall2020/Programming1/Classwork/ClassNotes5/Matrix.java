import java.util.Scanner;
import java.util.ArrayList;
public class Matrix
{
    int row = 3;
    int colums = 3;
    Scanner scn = new Scanner(System.in);
    String[][] grid = new String[3][3];
    
    public Matrix(){
     for(int i = 0; i < row; i++){
            
            for(int j = 0; j < colums; j++){
             grid[j][i] = " "; 

            
        }
        
        System.out.println("");
    }   
        
    }
    
    
    public void fillBox(){
        System.out.println("Number of rows");
        row = scn.nextInt();

        System.out.println("Number of colums");
        colums = scn.nextInt();  

    }

    public void makeX(){
        String x = "x";
        grid[0][0] = "x";
        
        
    }
    
    
    public void printBox(){
        for(int i = 0; i < row; i++){
            
            for(int j = 0; j < colums; j++){
             System.out.print("[" + grid[i][j] + "]");

            
        }
        
        System.out.println("");
    }
} 
   
 public static void main(String[] args){
        Matrix mX = new Matrix();
        //int[][] grid = new int[3][4];
        //hint for loops
        //System.out.println(grid.length);
        //System.out.println(grid[0].length);
        //System.out.println(grid[1].length);
        mX.fillBox();
        mX.printBox();
        mX.makeX();
      }

}
