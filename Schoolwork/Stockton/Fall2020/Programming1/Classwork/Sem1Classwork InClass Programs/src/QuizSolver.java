

	import java.util.Scanner;
	public class QuizSolver
	{
		//this method does not work not sure what this program does
		//only way to stop if you type -1
	   public double quizAverageSolver(){
	     Scanner scn = new Scanner(System.in);
	     int total = 0;
	     int countQuiz = 1;
	     System.out.println("Enter a random number to start");
	     System.out.println("Enter all your quiz scores");
	     System.out.println("To find your average type -1 once you entered all quiz scores");
	     int currentNumber = scn.nextInt();
	     
	     while (currentNumber != -1){
	         System.out.println("Quiz Score Please");
	         currentNumber = scn.nextInt();
	         if(currentNumber != -1){
	         total = total + currentNumber;
	         countQuiz++;
	        }
	        }
	     
	     System.out.println(total + " " + countQuiz);   
	     return (total*1.0) / countQuiz;
	    }
	    
	    public static void main(String[] args){
	     QuizSolver qs = new QuizSolver();   
	        
	     
	       System.out.println(qs.quizAverageSolver()); 
}
	}
