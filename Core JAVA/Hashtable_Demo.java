import java.util.*;

public class Hashtable_Demo 
{
	public static void main(String[] args) 
	{
		Hashtable<Integer, String> ht1=new Hashtable<>();
		ht1.put(1, "C");
		ht1.put(2, "C++");
		ht1.put(3, "Java");
		ht1.put(4, "JavaScript");
		ht1.put(5, "HTML");
		ht1.put(6, "CSS");
		
		System.out.println("Elements of Hashtable ht1: "+ht1);
		
		ht1.remove(1);
		ht1.remove(6);
		
		Hashtable<Integer, String> ht2=new Hashtable<>(ht1);
		ht2.put(-2, "Python");
		ht2.put(-1, "NodeJS");
		ht2.put(0,  "ReactJS");
		ht2.put(10,  "Ruby");
		ht2.put(7,  "Angular");
		
		System.out.println("\nElements of ht2: "+ht2);
		
		System.out.println("\nSize of ht2: "+ht2.size());
		
		System.out.println("\nValue for the key 1 in ht1: "+ht1.get(1));
		System.out.println("\nValue for the key 0 in ht2: "+ht2.get(0));
	}
}
