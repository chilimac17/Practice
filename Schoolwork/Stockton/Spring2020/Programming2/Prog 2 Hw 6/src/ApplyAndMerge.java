import java.util.*;

public class ApplyAndMerge {
	Random rng = new Random();
	static int counter2 = 0;
    
 
	public void arrayNumGen(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] = rng.nextInt(100) + 1;
			}
		}
	public void arrayDup(int[] array1,int[] array2) {
		for(int i = 0; i < array1.length; i++) {
			int numSlot = array1[i];
			array2[i] = numSlot;
			
		}
	}
	//this method will print all the elements in the array
		public void printArray(int[] inputArray) {
			System.out.println("This is the array that is size 10\n with all the random integeters that filled it");
			for(int i = 0; i < inputArray.length; i++) {
				System.out.println(inputArray[i]);
			}
		}
			//this method will sort an array 
			public static void selectionSort(int[] arrayInput){  
		        int counter = 0;
				for (int i = 0; i < arrayInput.length - 1; i++)  {
		        	counter++;
		            int index = i;  
		            for (int j = i + 1; j < arrayInput.length; j++){  
		                if (arrayInput[j] < arrayInput[index]){  
		                    index = j;//searching for lowest index  
		                }  
		            }  
		            int smallerNumber = arrayInput[index];   
		            arrayInput[index] = arrayInput[i];  
		            arrayInput[i] = smallerNumber;
		            
		        } 
				 System.out.println("this is how many iterations needed to complete the task" + "" + counter);
		}
			//this method will use merge sort selection
			public static void mergeSort(int[] a, int n) {
			   
				if (n < 2) {
			        return;
			    }
			    int mid = n / 2;
			    int[] l = new int[mid];
			    int[] r = new int[n - mid];

			    for (int i = 0; i < mid; i++) {
			    	 counter2++;
			    	l[i] = a[i];
			    }
			    for (int i = mid; i < n; i++) {
			    	 counter2++;
			    	r[i - mid] = a[i];
			    }
			    
			   
			    mergeSort(l, mid);			   
			    mergeSort(r, n - mid);
			    merge(a, l, r, mid, n - mid);
			    
			    
			}
			public static void merge(
					  int[] a, int[] l, int[] r, int left, int right) {
					 
					    int i = 0, j = 0, k = 0;
					    while (i < left && j < right) {
					        
					    	if (l[i] <= r[j]) {
					            a[k++] = l[i++];
					        }
					        else {
					            a[k++] = r[j++];
					        }
					    }
					    while (i < left) {
					        
					    	a[k++] = l[i++];
					    }
					    while (j < right) {
					        
					    	a[k++] = r[j++];
					    }
					    
					}
			public int getCounter() {
				return counter2;
			}

 public static void main(String[] args) {
	 ApplyAndMerge a1 = new ApplyAndMerge();
	 int[] arrayA = new int[10];
	int[] arrayB = new int[10];
	 
	 a1.arrayNumGen(arrayA);
	 a1.arrayDup(arrayA, arrayB);
	 a1.printArray(arrayA);
	 a1.printArray(arrayB);
	 a1.selectionSort(arrayA);
	 a1.printArray(arrayA);
	 a1.mergeSort(arrayB, arrayB.length);
	 a1.printArray(arrayB);
	 System.out.println("counter = " + a1.getCounter());
	 
 }
	}

