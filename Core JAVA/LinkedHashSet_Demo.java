import java.util.*;

public class LinkedHashSet_Demo 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(10);
		lhs.add(40);
		lhs.add(50);
		
		System.out.println("Size of lhs: "+lhs.size());
		
		System.out.println("\nElements of lhs: "+lhs);
		
		lhs.remove(10);
		System.out.println("\nDoes lhs contain 10 ?: "+lhs.contains(10));
	
		LinkedHashSet<Integer> l=new LinkedHashSet<>();
		l.add(40);
		l.add(30);
		l.add(20);
		l.add(50);
		
		System.out.println("\nElements of l: "+l);
		
		System.out.println("\nIs lhs equal to l ?: "+lhs.equals(l));

	}

}
