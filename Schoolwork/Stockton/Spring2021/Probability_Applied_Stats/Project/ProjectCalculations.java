

public class ProjectCalculations {
	
	/*
	 * DEVIATION
	 */
	public double findMean(double[] array) {
		double mean = 0;
		double count = 0;
		double temp;
		for(int i = 0; i < array.length; i++){
			count++;
			temp = array[i];
			mean = mean + temp;
		}
		mean = mean / count;
		return mean;
	}
	public double findStandardDeviation(double[] inputArray) {
		double standardDeviation = 0;
		double x = findMean(inputArray);
		int count = 0;
		for(int i =0; i < inputArray.length; i++){
			count++;
			double y = inputArray[i] - x;
			y = Math.pow(y,2);
			standardDeviation += y;
		}
		count = count - 1;
		standardDeviation = standardDeviation /count;
		Math.sqrt(standardDeviation);
		return standardDeviation; 
	}
	/*
	 * COMBINATIONS
	 */
	public double factorial(double num){
		double factorialNum = 1;
		for(int i = 1; i <= num; i++) {
			factorialNum = factorialNum * i;
			//System.out.println(factorialNum);
		}
		return factorialNum;
	}
	public double findCombinationProb(double n,double r){
		double answer = 0;
		answer = factorial(n) / factorial(r) * factorial(n-r);
		return answer;
	}
	public double findPermutationProb(double n, double r){
		double answer = 0;
		answer = factorial(n) /factorial(n - r);
		return answer;
	}
	/*
	 * CONDITIONAL PROBABILITY
	 */
	//this method is only used if A and B are independent
	public double probAHappenIfBGiven(double a,double b){
		/*          P(A and B) = P(A|B) P()
		 * P(A|B) = ------       = P(A)
		 *          P(B)
		 */   
		double answer = 0;
		answer = interAB(a,b) / b;
		
		return answer;
	}
	
	
	public double intersectionOfAandB(double aAndb,double probAorB) {
		/*
		 * P(A n B) = P(A)P(B|A) = P(B)P(B|A)
		 */
		double answer = probAorB * aAndb;
		
		return answer;
	}
	/*
	 * INDEPENDENT RULES
	 */
	public double indProbAGivenB(double a){
		/*
		 * P(A|B) = P(A)
		 */
		double answer = a;
		return answer;
	}
	public double indProbBGivenA(double b){
		/*
		 * P(B|A) = P(B)
		 */
		double answer = b;
		return answer;
	}
	public double interAB(double a, double b) {
		/*
		 * P(A n B) = P(A)P(B)
		 */
		double answer = a * b;
		return answer;
	}
	/*
	 * GENERAL ADDITION RULE
	 */
	public double unionAB(double a,double b) {
		/*
		 * P(A U B) = P(A)+P(B) - P(A n B)
		 */
		double answer = a + b - interAB(a,b);
				return answer;
	}
	
	/*
	 * THE THEOREM OF TOTAL PROBABILITY
	 */
	public double totalProbTheorem() {
		double answer = 0;
		
		return answer;
	}
	
	
	
	/*
	 * BAYS THEOREM
	 */
	//use this method if A and B are independent
	public double bayesTheorem(double a,double b,double ba) {
		double answer = (ba * a) / b;
		
		return answer;
	}
	
}
