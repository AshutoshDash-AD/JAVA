import java.util.*;

public class HashMap_Demo 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm1=new HashMap<>();
		hm1.put(1, "C");
		hm1.put(2, "C++");
		hm1.put(3, "Java");
		hm1.put(4, "JavaScript");
		hm1.put(5, "HTML");
		hm1.put(6, "CSS");
		
		System.out.println("Initially, Elements of hm1: "+hm1);
		
		System.out.println("\nValue for the key 3: "+hm1.get(3));
		
		hm1.put(6, "Python");
		hm1.remove(4);
		
		System.out.println("\nNow Elements of hm1: "+hm1);

		System.out.println("\nSize of hm1: "+hm1.size());
		
		System.out.println("\nDoes hm1 contain key 3?: "+hm1.containsKey(3));
		System.out.println("\nDoes hm1 contain value CSS?: "+hm1.containsValue("CSS"));
		
		HashMap<Character, Integer> hm2=new HashMap<>();
		hm2.put('A', 90);
		hm2.put('B', 80);
		hm2.put('C', 70);
		hm2.put('D', 60);
		hm2.put('E', 50);
		
		System.out.println("\nElements of hm2 are");
		for (Map.Entry<Character, Integer> e : hm2.entrySet())
            System.out.println(e.getKey()+" ➡ "+e.getValue());	
	}
}
