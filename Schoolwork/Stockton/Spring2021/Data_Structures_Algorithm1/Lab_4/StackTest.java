// ***************************************************************
//   StackTest.java
//
//   A simple driver to test a stack.
//
// ***************************************************************
import java.util.Stack;
public class StackTest
{
public static void main(String[] args)
{
// Declare and instantiate a stack
Stack stack = new Stack();
//push some stuff on the stack
for (int i=0; i<10; i++)
stack.push(i);
stack.push(5);
// call printStack to print the stack
printStack(stack);
// call reverseStack to reverse the stack
System.out.println(reverseStack(stack));
// call printStack to print the stack again
printStack(stack);
//call removeElement to remove all occurrences of the value 5 - save the
// stack returned from this call
removeElement(stack,5);
// call printStack to print the original stack and the new stack.
printStack(stack);
 }
//print all elements in the stack from top to bottom 
public static void printStack(Stack s) {
	System.out.println(s);
}
//return a new stack whose elements are in reverse
public static Stack reverseStack(Stack s) {
	Stack tempStack = new Stack();
	for(int i = s.size()-1; i >=0; i--) {
		tempStack.push(s.get(i));
	}
	return tempStack;
}
//return new stack whose elements are the same as those in s except all occurance of val have been removed.
public static Stack removeElement(Stack s,int val) {
	for(int i = 0; i < s.size(); i++) {
		int x =(int)s.get(i);
		if(x == val) {
			s.remove(i);
		}
	}
	return s;
}

}