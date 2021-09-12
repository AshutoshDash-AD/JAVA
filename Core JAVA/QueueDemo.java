import java.util.*;

public class QueueDemo 
{
	public static void main(String[] args) 
	{
		Queue<Integer> q=new LinkedList<>();
		
		System.out.println("Add first five non-ve no.s to the queue");
		for(int i=-1;i>=-5;i--)
			q.add(i);
		
		System.out.println(q);
		
		System.out.println("\nRemoved element: "+q.remove());
		
		q.add(0);
		System.out.println("\nAfter adding 0 to the q, elements are: "+q);
		
		System.out.println("\nSize of Queue: "+q.size());
		
		System.out.println("\nHead of queue: "+q.peek());
		
	}
}	