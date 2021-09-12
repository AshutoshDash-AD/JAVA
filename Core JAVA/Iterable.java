import java.util.*;

public class Iterable 
{
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<>();
		  
		list.add("Welcome to");
		list.add(" JAVA ");
		list.add("Programming");
	  
		Iterator<String> i = list.iterator();
		
		System.out.println("String elements of the list: ");
		while(i.hasNext()) 
		{
			String st = i.next();
			System.out.print(st);
	    }
	}
}
