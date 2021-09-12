import java.util.*;

public class HashSet_Demo 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> hs1=new HashSet<>();
		for(int i=1;i<10;i+=2)
			hs1.add(i);
		
		System.out.println("Odd no.s b/w 1 to 10: "+hs1);

		System.out.println("\nHashcode of hs1: "+hs1.hashCode());

		HashSet<String> hs2=new HashSet<>();
		hs2.add("Mumbai");
		hs2.add("Puri");
		hs2.add("Goa");
		hs2.add("BBSR");
		hs2.add("Delhi");
		
		System.out.println("\nElements of HashSet hs2: "+hs2);
		
		System.out.println("\nHashcode of hs2: "+hs2.hashCode());
		
	}
}
