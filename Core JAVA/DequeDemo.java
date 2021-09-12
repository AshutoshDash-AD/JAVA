import java.util.*;

public class DequeDemo 
{
	public static void main(String[] args) 
	{
		Deque<Character> ld=new LinkedList<>();
		ld.add('n');
		ld.addFirst('o');
		ld.push('d');
		ld.addLast('e');
		ld.push('a');
		
		System.out.println("Popped element: "+ld.pop());
		
		System.out.println("\nElements of Deque: "+ld);
		
		ld.addLast('s');
		
		System.out.println("\nRemoved element: "+ld.remove());
		
		ld.offer('a');
		ld.offerFirst('x');
		ld.offerLast('u');
		
		System.out.println("\nNow elements of ld: "+ld);
	
	}
}
