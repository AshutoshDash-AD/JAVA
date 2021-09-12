import java.util.*;

public class ArrayDeque_Demo 
{
	public static void main(String[] args) 
	{
		ArrayDeque<Integer> ad=new ArrayDeque<Integer>();

		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);

		System.out.println("Elements of ArrayDeque: "+ad);

		ad.clear();
		ad.addFirst(564);
		ad.addLast(291);
		
		System.out.println("\nNow elements of ad: "+ad);
		
		Deque<String> dd=new ArrayDeque<>();
		
		dd.add("Welcome");
		dd.addFirst("Thank you");
		dd.addLast("Okay");
		dd.push("Hello");
		
		System.out.println("\nElements of dd: "+dd);
		
		System.out.println("\nTop element of dd: "+dd.peekFirst());
		
		dd.addFirst("Good Morning");
		System.out.println("\nNow top element of dd: "+dd.element());
	}
}
