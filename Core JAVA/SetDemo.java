import java.util.*;

public class SetDemo 
{
	public static void main(String[] args) 
	{
		Set<String> hs=new HashSet<>();
		hs.add("LOL");
		hs.add("OK");
		hs.add("HII");
		hs.add("NOPE");
		hs.add("YUP");
		hs.add("OK");
		
		System.out.println("Elements of HashSet: "+hs);
		
		System.out.println("\nDoes hs contain HII ?: "+hs.contains("HII"));
		
		Set<Integer> lhs1=new LinkedHashSet<>();
		for(int i=2;i<40;i*=2)
			lhs1.add(i);
		lhs1.add(5);
		
		System.out.println("\nElements of LinkedHashSet lhs1: "+lhs1);
		
		Set<Integer> lhs2=new LinkedHashSet<>();
		for(int i=0;i<10;i++)
			lhs2.add(i);
		
		System.out.println("\nElements of LinkedHashSet lhs2: "+lhs2);
		
		Set<Integer> un=new LinkedHashSet<>(lhs1);
		un.addAll(lhs2);
		System.out.println("\nUnion of lhs1 and lhs2: "+un);
		
		Set<Integer> in=new LinkedHashSet<>(lhs2);
		in.retainAll(lhs1);
		System.out.println("\nIntersection of lhs1 and lhs2: "+in);
		
		Set<Integer> diff=new LinkedHashSet<>(lhs1);
		diff.removeAll(lhs2);
		System.out.println("\nDifference b/w lhs1 and lhs2 (lhs1-lhs2): "+diff);
		
		diff=new LinkedHashSet<>(lhs2);
		diff.removeAll(lhs1);
		System.out.println("Difference b/w lhs2 and lhs1 (lhs2-lhs1): "+diff);
		
	}

}
