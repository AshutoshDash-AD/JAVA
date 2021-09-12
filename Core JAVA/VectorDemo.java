import java.util.*;

public class VectorDemo 
{
	public static void main(String[] args) 
	{
		Vector<Character> V=new Vector<>();
		
		System.out.println("Initial Capacity of V: "+V.capacity());
		for(int i=97;i<=122;i++)
			V.add((char)i);
		
		System.out.println("\nPrinting all lowercase alphabets in Vector V:");
		System.out.println(V);
		
		System.out.println("\nElement at index 5 of the vector V: "+V.get(5));
		
		System.out.println("\nIndex of the element n in the vector V: "+V.indexOf('n'));
		
		System.out.println("\nCurrent capacity of V: "+V.capacity());
		
	/*	Vector v=new Vector();
		v.add('X');
		v.add(4);
		v.add(17.3);
		v.add("India");
		v.add("UK");
		v.add("Japan");
		
		System.out.println("\nElements of the Vector v:");
		System.out.println(v);	
		System.out.println(v.capacity());	*/
		
	}
}
