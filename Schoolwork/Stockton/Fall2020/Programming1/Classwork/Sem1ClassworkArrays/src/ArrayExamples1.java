
public class ArrayExamples1 {
	 public static void main(String[] args){
	        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10 };

	        // write the array above in an easier way using a loop

	        int[] numbersTwo = new int[10];

	        for(int i = 0; i < 10; i++){

	            numbersTwo[i] = i+1;

	        
	        }

	        //this will print out the location in the memory where numbers and number 2 are
	        System.out.println("numbers is located at:" + numbers);
	        System.out.println("numbersTwo is located at:" + numbersTwo);

	        //This will print out numbers on every line 

	        System.out.println("numbers = " );
	        for(int i = 0; i < numbers.length; i++){
	            System.out.println( numbers[i] );

	        }
	        //This will print out numbersTwo on every line 
	        System.out.println("numbersTwo = " );

	        for(int i = 0 ; i < numbers.length; i++){
	            System.out.println( numbersTwo[i] );

	        }
	        //just creating a space to make it easier to read/understand
	        System.out.println("");
	        System.out.println("");
	        System.out.println("");

	        //3.
	        //this for loop will print the numbers of the array in one line separated by commas

	        for(int i = 0 ; i < numbers.length; i++ ){
	            if(i<9){
	                System.out.print(numbersTwo[i] + ",");
	            }else{
	                System.out.print(numbersTwo[i]);
	            }

	        }

	        //just creating a space to make it easier to read/understand
	        System.out.println("");
	        System.out.println("");
	        System.out.println("");

	        //4.swap values of the first array position 3 with position 6, print results  
	        //this will swap the values in position 3 and 6 in the array
	        //Before 1,2,3,4,5,6,7,,8,9,10 
	        //After 1,2,3,7,5,6,4,8,9,10
	        int p1 = numbersTwo[3];
	        int p2 = numbersTwo[6];
	        numbersTwo[3]= p2;
	        numbersTwo[6]= p1;

	        for(int i = 0; i < numbersTwo.length; i++ ){

	            System.out.print(numbersTwo[i] + ",");
	        }

	        //just creating a space to make it easier to read/understand
	        System.out.println("");
	        System.out.println("");
	        System.out.println("");

	        //changing the positions back to what they were 
	        int p3 = numbersTwo[3];
	        int p4 = numbersTwo[6];
	        numbersTwo[3]= p4;
	        numbersTwo[6]= p3;

	        //just creating a space to make it easier to read/understand
	        System.out.println("");
	        System.out.println("");
	        System.out.println("");    

	    
	        //5.for the second array change all odd numbers to 15; 
	        //this changes every odd number in the array to 15
	        System.out.println("Before");	

	        for(int i = 0; i < numbersTwo.length; i++) {
	            System.out.print(numbersTwo[i] + ",");
	        }

	        System.out.println("");
	        System.out.println("After");

	        int[] num15 = {15};

	        for(int i = 0; i < numbersTwo.length; i++) {
	            if(numbersTwo[i] % 2 == 0) {
	                System.out.print(numbersTwo[i] + ",");
	            }
	            else {
	                numbersTwo[i] = num15[0];
	                System.out.print(numbersTwo[i] + ",");   
	            }
	        }
	        //just creating a space to make it easier to read/understand
	        System.out.println("");
	        System.out.println("");
	        System.out.println("");

	        //6.remove 3rd value of array 1, and move all the other numbers up 
	        for(int i = 1; i < numbers.length; i++ ){
	            if(i < numbers.length - 1){
	                numbers[i] = numbers[i+1];
	            }else{
	                numbers[i] = 0; 
	            }

	        }

	        for(int i = 0; i < numbers.length; i++ ){

	            System.out.print(numbers[i] + "," );
	        }

	        //just creating a space to make it easier to read/understand
	        System.out.println("");
	        System.out.println("");
	        System.out.println("");

	        //7.insert the number 7777 to the 1st (not 0th) position of array
	        int[] seven = {7777};
	        numbers[1] = seven[0];
	        System.out.println("numbers:");

	        //printing out the results
	        for(int i = 0; i < numbers.length; i++ ){

	            System.out.print(numbers[i] + "," );
	        }

	        System.out.println("");
	        System.out.println("numbersTwo:");
	        for(int i = 0; i < numbersTwo.length; i++ ){

	            System.out.print(numbersTwo[i] + "," );
	        }

	    }  
}
