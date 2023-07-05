// ****************************************************************
//   ArrayStack.java
//
//   An array-based Object stack class with operations push, 
//   pop, and isEmpty and isFull.
//          
// ****************************************************************

public class ArrayStack implements StackADT
{
    private int stackSize = 5;   // capacity of stack
    private int top;             // index of slot for next element
    private Object[] elements;      

    // --------------------------------------------------
    // Constructor -- initializes top and creates array
    // --------------------------------------------------
    public ArrayStack()
    {
    	top = elements.length;

    }


    // ----------------------------------------------------
    // Adds the new element to the top of the stack if it
    // is not full, else does nothing to the stack.
    // ----------------------------------------------------
    public void push(Object val)
    {





    }


    // --------------------------------------------------
    // Removes and returns the element at the top of the
    // stack. If the stack is empty returns null.
    // --------------------------------------------------
    public Object pop()
    {
    	int temp;
    	





    }


    // --------------------------------------------------
    // Returns true if stack is empty, false otherwise.
    // --------------------------------------------------
    public boolean isEmpty()
    {
	
    	return top == 0;

    }

    // ---------------------------------------------------
    // Returns true if the stack is full, false otherwise.
    // ---------------------------------------------------
    public boolean isFull()
    {
    	if(elements.length == stackSize) {
    		return true;
    	}else {
    		return false;
    	}
    }
}

