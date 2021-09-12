public class NonPrimitive_Datatypes 
{
	public static void main(String[] args) 
	{
		String str1="Hello";
		String str2=new String("Welcome");
		
		System.out.println("String1: "+str1+"\n"+
						   "String2: "+str2+"\n");
		
		int arr1[];
		arr1=new int[3];
		arr1[0]=5;
		arr1[1]=8;
		arr1[2]=9;
		
		char arr2[]= {'a','e','i','o','u'};
		
		System.out.println("Address of arr1: "+arr1);
		System.out.println("Integer at posn2: "+arr1[2]+"\n");
		System.out.println("Character at posn0: "+arr2[0]);
	}
}
