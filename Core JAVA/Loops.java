public class Loops 
{
	public static void main(String[] args) 
	{
		int i=4;
		while(i>1)
		{
			System.out.println(i+".I'm while Loop");
			--i;
		}
		
		System.out.println();
		
		int k=1;
		do
		{
			System.out.println(k+".I'm do while Loop");
			k++;
		}while(k<6);
		
		System.out.println();
		
		for(int l=1;l<10;l*=2)
			System.out.println(l+".I'm for loop");
		
		System.out.println();
		
		int odd[]= {1,3,5,7,9};
		for(int n:odd)
		{
			if(n>5)
				break;
			System.out.println(n+".I'm enhanced for loop");
		}	
	}
}
