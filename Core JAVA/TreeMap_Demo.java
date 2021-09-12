import java.util.*;

public class TreeMap_Demo 
{
	public static void main(String[] args) 
	{
		TreeMap<Character,Integer> tm=new TreeMap<>();
		tm.put('A', 90);
		tm.put('D', 60);
		tm.put('B', 80);
		tm.put('C', 70);
		tm.put('E', 50);
		
		System.out.println("Initially, elements of tm: "+tm);
		
		tm.remove('C');
		tm.put('O', 100);
		
		System.out.println("\nDoes tm contain key C?: "+tm.containsKey('C'));
		System.out.println("\nDoes tm contain value 100?: "+tm.containsValue(100));
		
		System.out.println("\nNow elements of tm are");
		for (Map.Entry<Character,Integer> e : tm.entrySet()) 
		{
			Character key = e.getKey();
			Integer value = e.getValue();
			System.out.println(key + " : " + value);
		}
		
	}
}
