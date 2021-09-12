import java.util.*;

public class TreeSet_Demo 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(5);
		ts.add(7);
		ts.add(2);
		ts.add(1);
		ts.add(8);
		ts.add(3);
		ts.add(0);
		
		System.out.println("Elements of ts: "+ts);
		
		System.out.println("\nFirst value: "+ts.first());
		
		System.out.println("\nLast value: "+ts.last());
		
		System.out.println("\nHigher value for 3: "+ts.higher(3));
		
		System.out.println("\nLower value for 0: "+ts.lower(0));
		
	}

}
