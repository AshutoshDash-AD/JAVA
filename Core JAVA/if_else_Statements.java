public class if_else_Statements 
{
	public static void main(String[] args) 
	{
		
		System.out.println("if statement");
		int a=5,b=3;
		if(a>b)
			System.out.println("++a is "+(++a));
		if(a>b+1)
			System.out.println("a is "+a);
		
		System.out.println("\nif else statement");
		int c=13,d=8;
		if(c<d)
			System.out.println("c is less than d");
		else
			System.out.println("c is more than d");
		
		System.out.println("\nif else-if ladder");
		int e=8;
		if(e>=90)
			System.out.println("A grade");
		else if(e>=80)
			System.out.println("B grade");
		else if(e>=70)
			System.out.println("C grade");
		else if(e>=33)
			System.out.println("D grade");
		else
			System.out.println("FAIL");
		
		System.out.println("\nnested if statement");
		int x=1,y=2,z=3;
		if(z>y)
		{
			System.out.println("z is more than y");
			if(z>x)
			{
				System.out.println("z is more than x");
				if(y>x)
					System.out.println("y is more than x");
			}
		}
		
		System.out.println("\nif else Ternary expression");
		x=50;
		y=25;
		int s=x>y ? x*x : y*y;
		System.out.println(s);
	}
}
