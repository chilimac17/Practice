import java.util.*;

public class ApplyAndMerge {
	Random rng = new Random();

	//this method will take in an array and populate it with random integers from 1-100
	public void arrayNumGen(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] = rng.nextInt(100) + 1;
			}
		}
	//this method will take two arrays and duplicate all the elements in the first one to the second one
	public void arrayDup(int[] array1,int[] array2) {
		for(int i = 0; i < array1.length; i++) {
			int numSlot = array1[i];
			array2[i] = numSlot;
			
		}
	}
	//this method will print all the elements in the array
	public void printArray(int[] inputArray) {
			
			for(int i = 0; i < inputArray.length; i++) {
				System.out.print(inputArray[i] + ",");
			}
		}
	//this method will sort an array in numerical order using selection sort
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
				System.out.println("");
				 System.out.println("this is how many iterations needed to complete the task:" + "" + counter);
		}
			//this method will use merge sort selection
			public static int mergeSort(int[] a, int n) {
			    int counter2 = 0;
			    
				if (n < 2) {
					
					return counter2;
			    }
			    int mid = n / 2;
			    int[] l = new int[mid];
			    int[] r = new int[n - mid];
			    
			    for (int i = 0; i < mid; i++) {
			        l[i] = a[i];
			        
			    }
			    for (int i = mid; i < n; i++) {
			        r[i - mid] = a[i];
			        
			    }
			   counter2 += mergeSort(l, mid); //counter2 = counter2 + mergesort;
			   counter2 += mergeSort(r, n - mid);
			   counter2 += merge(a, l, r, mid, n - mid);
			  
			    return counter2;
			}
			//this method will sort an array in numerical order using merge sort selection 
			public static int merge(
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
					    return 1;
					}

		public static void main(String[] args) {
			ApplyAndMerge a1 = new ApplyAndMerge();
			int[] arrayA = new int[10];
			int[] arrayB = new int[10];
			int counter3 = 0;
			
			a1.arrayNumGen(arrayA);
			a1.arrayDup(arrayA, arrayB);
			System.out.println("This is all the elements in the array A");
			a1.printArray(arrayA);
			System.out.println("");
			System.out.println("This is all the elements in the array B");
			a1.printArray(arrayB);
			a1.selectionSort(arrayA);
			System.out.println("This is all the elements in the array after using selection sort ");
			a1.printArray(arrayA);
			System.out.println("");
			counter3 = a1.mergeSort(arrayB, arrayB.length);
			System.out.println("This is all the elements in the array after using merge sort");
			a1.printArray(arrayB); 
			System.out.println("");
			 System.out.println("This is how many times it ran through:" + counter3);
 }
	}

