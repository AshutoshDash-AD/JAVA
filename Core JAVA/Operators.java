public class Operators 
{
	public static void main(String[] args) 
	{	
		int a,b;
		a=12;
		b=5;
		double c=9.8;
		System.out.println("Given value of a is "+a+", b is "+b+" & c is "+c);
		
		
		System.out.println("a+b is "+(a+b));
		System.out.println("a-b is "+(a-b));
		System.out.println("a*b is "+(a*b));
		System.out.println("a/b is "+(a/b));
		System.out.println("a%b is "+(a%b));
		System.out.println("-5%2 is "+(-5%2)+"\n");
		
		System.out.println("b+c is "+(b+c));
		System.out.println("a/c is "+(a/c)+"\n");
		
		a+=1;
		System.out.println("a+1 is "+a);
		b-=8;
		System.out.println("b-8 is "+b+"\n");
		
		System.out.println("a+b is "+a+b+"\n");
		
		a=7;
		b=3;
		System.out.println("Given value of a is "+a+" & b is "+b);
		
		System.out.println("a++ is "+(a++));
		System.out.println("current value of a is "+a);
		System.out.println("++b is "+(++b));
		System.out.println("current value of b is "+b+"\n");
		
		a=15;
		b=22;
		System.out.println("Given value of a is "+a+" & b is "+b);
		
		System.out.println("a-- is "+(a--));
		System.out.println("current value of a is "+a);
		System.out.println("--b is "+(--b));
		System.out.println("current value of b is "+b+"\n");
		
		a=4+7/2*5-10+1^9%6-3/(2-12)&1|5;
		System.out.println("Value of the expression 4+7/2*5-10+1^9%6-3/(2-12)&1|5 is "+a+"\n");
		
		System.out.println(a>=b);
		System.out.println(a==15);
		System.out.println(a>15);
	}
}
