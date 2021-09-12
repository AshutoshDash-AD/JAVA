import java.util.*;

public class ListDemo
{
	public static void main(String[] args) 
	{
		List<Integer> L=new ArrayList<>();
		L.add(0, 1);
		L.add(1, 2);
		L.add(2, 3);
		L.add(3, 4);
		L.add(2, 5);
		
		System.out.println("Integer elements of the list: ");
		System.out.println(L);
		
		System.out.println("\nElement at index 2: "+L.get(2));
		
		L.remove(0);
		System.out.println("\nAfter removing element at index 0, elements of list:");
		System.out.println(L);
		
		List<String> l=new ArrayList<String>();
		l.add("C");
		l.add("Python");
		l.add("JAVA");
		l.add("Javascript");
		
		System.out.println("\nString elements of the list: ");
		System.out.println(l);
		
		l.set(0,"C++");
		System.out.println("\nAfter setting a new string at index 0, elements of list:");
		System.out.println(l);
		
	}
}
