import java.util.*;

public class MapDemo 
{
	@SuppressWarnings("deprecation")
	
	public static void main(String[] args) 
	{
		Map<Character,Integer> hm=new HashMap<>();
		hm.put('A', 90);
		hm.put('B', 80);
		hm.put('C', 70);
		hm.put('D', 60);
		hm.put('E', 50);
		System.out.println("Elements of hm: "+hm);
		
		Map<Integer,String> HM=new HashMap<>();
		HM.put(new Integer(1),"a");
		HM.put(new Integer(2),"b");	
		HM.put(new Integer(3),"c");
		System.out.println("\nElements of HM: "+HM);
		
		System.out.println("\nElements of HM using enhanced loop:");
		for(Map.Entry<Integer,String> H : HM.entrySet()) 
		{
            System.out.print(H.getKey() + ":");
            System.out.println(H.getValue());
        }
	
	}

}
