import java.util.*;

public class SortedSet_Demo 
{
	public static void main(String[] args) 
	{
		SortedSet<Integer> ts1=new TreeSet<>();
		for(int i=3;i<20;i+=3)
			ts1.add(i);
		
		System.out.println("Initially, elements in ts1: "+ts1);
		
		ts1.remove(9);
		ts1.remove(3);
		System.out.println("\nAfter removing elements in ts1: "+ts1);
		
		SortedSet<Character> ts2=new TreeSet<>();
		ts2.add('i');
		ts2.add('u');
		ts2.add('a');
		ts2.add('e');
		ts2.add('o');
		
		System.out.print("\nElements in ts2: ");
		for(char i : ts2)
			System.out.print(i+"  ");
		System.out.println();
		
		System.out.println("\nFirst value of ts1: "+ts1.first());
		
		System.out.println("\nLast value of ts2: "+ts2.last());
	}

}
