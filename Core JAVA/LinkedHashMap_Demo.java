import java.util.*;

public class LinkedHashMap_Demo 
{
	public static void main(String[] args) 
	{
		LinkedHashMap<Character, String> lhm1=new LinkedHashMap<>();
		lhm1.put('a', "John");
		lhm1.put('b', "Caliber");
		lhm1.put('c', "Hanna");
		lhm1.put('d', "Jessy");
		
		System.out.println("Elements of lhm1 are");
		
		for (Map.Entry<Character, String> e : lhm1.entrySet()) 
		{
			Character key = e.getKey();
			String value = e.getValue();
			System.out.println(key + " : " + value);
		}
		
		System.out.println("\nValue for key c in lhm1: "+lhm1.get('c'));
		
		System.out.println("\nIs lhm1 empty?: "+lhm1.isEmpty());
		
		lhm1.remove('b');
		
		System.out.println("\nDoes lhm1 contain value Caliber?: "+lhm1.containsValue("Caliber"));
		
		LinkedHashMap<Integer, Character> lhm2=new LinkedHashMap<>();
		lhm2.put(5, 'd');
		lhm2.put(0, 'e');
		lhm2.put(1, 'x');
		lhm2.put(-3, 'q');
		lhm2.put(56, 'v');
		lhm2.put(13, 'a');
		
		System.out.println("\nElements of lhm2: "+lhm2);
	}
}
