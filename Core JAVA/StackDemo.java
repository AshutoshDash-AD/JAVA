import java.util.*;

public class StackDemo 
{
	public static void main(String[] args) 
	{
		Stack<Integer> S=new Stack<>();
		
		System.out.println("Is the stack empty ?: "+S.empty());

		S.push(0);
		S.push(-1);
		S.push(1);
		S.push(-2);
		S.push(-3);
		S.push(4);
		
		System.out.println("\nStack elements: "+S);
		
		System.out.println("\nPopped out "+S.pop());
		System.out.println("\nPopped out "+S.pop());
		
		System.out.println("\nPushed 2");
		S.push(2);
		
		System.out.println("\nCurrent Stack elements: "+S);
		
		System.out.println("\nPosition of -1 from top of stack: "+S.search(-1));

		System.out.println("\nIs the stack empty ?: "+S.empty());

		System.out.println("\n1st element of Stack: "+S.peek());
		
		System.out.println("\nLast Element of the stack: "+S.lastElement());
		System.out.println("First Element of the stack: "+S.firstElement());
		
	}

}
