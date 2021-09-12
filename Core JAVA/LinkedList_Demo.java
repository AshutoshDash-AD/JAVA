import java.util.*;

public class LinkedList_Demo 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> ll=new LinkedList<Integer>();
		
		System.out.println("Adding the 1st 10 no.s to the LinkedList: ");
		for(int i=1;i<=10;i++)
			ll.add(i);
		
		System.out.println(ll);
		
		ll.addFirst(0);
		ll.removeLast();
		
		System.out.println("\nAfter adding 0 at 1st and removing last item, Even elements of the LinkedList: ");
		for(int i=0;i<ll.size();i++)
		{
			if(ll.get(i)%2==0)
				System.out.print(ll.get(i)+" ");
		}
	}

}
