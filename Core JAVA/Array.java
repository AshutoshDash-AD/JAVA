import java.util.*;

public class Array {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1D Array\n");
		
		System.out.println("Integer array elements: ");
		int arr1[]= {0,2,4,6,8};
		for(int i=0;i<arr1.length;i++)
			System.out.print(arr1[i]+" ");
		
		char arr2[]=new char[5];
		System.out.println("\n\nEnter any 5 characters: ");
		for(int i=0;i<arr2.length;i++)
			arr2[i]=sc.next().charAt(0);
		
		System.out.println("Character array elements: ");
		for(char i:arr2)
			System.out.print(i+" ");
		
		sc.close();
		
		System.out.println("\n2D Array\n");
		
		System.out.println("Integer 2x3 Matrix: ");
		int arr3[][]= { {2,4,8} , {3,6,9} };
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(arr3[i][j]+" ");
			System.out.println();
		}
		
		System.out.println("\nElement at index [1,3]: "+arr3[1][2]);
	}

}
