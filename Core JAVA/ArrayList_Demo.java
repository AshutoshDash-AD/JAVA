import java.util.*;

public class ArrayList_Demo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> AL=new ArrayList<>(5);
		
		System.out.println("Enter any 5 no.s to the arraylist: ");
		for(int i=0;i<5;i++)
			AL.add(sc.nextInt());
		
		System.out.println("\nInteger elements of the ArrayList: ");
		System.out.println(AL);
		AL.add(6);
		AL.add(0, 0);
		AL.set(2, -2);
		AL.remove(1);
		
		System.out.println("\nAfter adding and removing operations, elements of the list: ");
		System.out.println(AL);
		
		System.out.println("\nSize of the list: "+AL.size());
		
		System.out.println("\nElement at the 2nd last position: "+AL.get(AL.size()-2));
		
		AL.clear();
		System.out.println("\nAfter clearing the arraylist: "+AL);
		
		ArrayList<Character> al=new ArrayList<>();
		
		for(char i=65;i<=72;i++)
			al.add(i);
		
		System.out.println("\nCharacter elements of the ArrayList: ");
		System.out.println(al);
		
		System.out.println("\nAfter adding and setting operations, elements of the list: ");
		al.add(0,'X');
		al.set(al.size()-1, 'X');
		for(char i:al)
			System.out.print(i+"  ");
		
		System.out.println("\nDoes the list contains b ?: "+al.contains('b'));
		sc.close();
	}

}
