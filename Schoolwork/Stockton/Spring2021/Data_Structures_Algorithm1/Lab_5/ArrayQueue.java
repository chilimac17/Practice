//**********************************************************************
//   ArrayQueue.java
//
//   An array-based implementation of the classic FIFO queue interface. 
//**********************************************************************

public class ArrayQueue implements QueueADT
{

    private final int DEFAULT_SIZE = 5;
    private Object[] elements;
    private int numElements;
    private int front, back;   

    // ----------------------------------------------------
    // Constructor: Creates and array of the default size.
    // ----------------------------------------------------
    public ArrayQueue()
    {
	// initialize the numElements	


        // initialize elements
	elements = new Object[DEFAULT_SIZE];
	
        // initialize front
        front = 0;

        // initialize back
	back = -1;
    }


    // --------------------------------------------------
    // Adds an element to the end of the queue if there
    // is room; otherwise does nothing to the queue.
    // --------------------------------------------------
    public void enqueue(Object item)
    {

	// if the queue is full, then pop a message
	if(isFull()) {
		System.out.println("the queue is full " + item + " was not added to the queue");

		
	
       // if the queue is not full, update back index, assign the item to back, increase   numElements
       // if the numElements number is 1 then front = back
	}else {
		back = (back +1)%DEFAULT_SIZE; //back == the rear 
		elements[back] = item;
		numElements++;
		if(numElements ==1)
			front = back;
	}





    }


    // --------------------------------------------------------
    // Removes and returns object from the front of the queue.
    // Assumes that the queue contains at least one element.
    // --------------------------------------------------------
    public Object dequeue()
    {
	// assign val to be the element in the front
    	Object val = elements[front];

	// update the front index
    	front = (front +1)%DEFAULT_SIZE;
	// update the numElements
    	numElements--;

	// if the numElement is 0, then back = front - 1
    	if(numElements == 0) {
    		back = front - 1;
    	}
    	

	// return the val
    	return val;
    }


    // ----------------------------------------------------
    // Returns true if the queue is empty, false otherwise.
    // ----------------------------------------------------
    public boolean isEmpty()
    {
    	return numElements == 0;
    }


    // ----------------------------------------------------
    // Returns true if the queue is full, false otherwise.
    // ----------------------------------------------------
    public boolean isFull()
    {
    	return numElements == DEFAULT_SIZE;
    }

    // ----------------------------------------------------
    // Returns the number of elements in the queue.
    // ----------------------------------------------------
    public int size()
    {
    	return numElements;
    }

    //-----------------------------------------------------
    // Returns a string containing the elements of the 
    // queue from first to last.
    //-----------------------------------------------------
    public String toString()
    {
	String result = "\n";
	for (int i = front, count = 0; count < numElements; 
	     i=(i+1)%elements.length, count++)
	    result = result + elements[i] + "\n";

	return result;
    }
}


