import java.util.*;

public class SortedMap_Demo 
{
	public static void main(String[] args) 
	{
		SortedMap<Integer, String> sm1=new TreeMap<>();
		sm1.put(2,null);
		sm1.put(3,"Aakash");
		sm1.put(5,"Pratik");
		sm1.put(8,null);
		sm1.put(4,"Aanchal");
		sm1.put(1,"Neha");
		sm1.put(0,"Vishnu");
		
		System.out.println("Elements of sm1: "+sm1);
		
		SortedMap<String,Character> sm2=new TreeMap<>();
		sm2.put("INDIA",'a');
		sm2.put("USA",'o');
		sm2.put("JAPAN",'c');
		sm2.put("FRANCE",'y');
		
		System.out.println("\nInitially, elements of sm2: "+sm2);
		
		sm2.put("DUBAI",'c');
		sm2.put("SINGAPORE",null);
		sm2.remove("USA");
		
		System.out.println("\nNow elements of sm2 are");
		for (Map.Entry<String, Character> e : sm2.entrySet()) 
		{
			String key = e.getKey();
			Character value = e.getValue();
			System.out.println(key + " : " + value);
		}
		
	}
}
