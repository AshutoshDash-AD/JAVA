import java.util.*;

public class PriorityQueue_Demo 
{
	public static void main(String[] args) 
	{
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("INDIA");
		pq.add("KOREA");
		pq.add("UAE");
		pq.add("AUSTRALIA");
		pq.add("SRI LANKA");
		
		System.out.println("Elements of the PriorityQueue: "+pq);
		
		System.out.println("\nTop element in pq: "+pq.peek());
		
		System.out.println("\nTop element in pq & removing it from pq: "+pq.poll());
		
		System.out.println("\nElements of pq: "+pq);
		
		System.out.println("\nNow top element of pq: "+pq.peek());
		
	}
}
