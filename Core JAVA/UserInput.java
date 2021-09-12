import java.util.Scanner;

public class UserInput 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Scanner in=new Scanner(System.in);
		
		char c;
		String st1,st2;
		byte b;
		short s;
		int i;
		float f;
		double d;
		boolean k;
		
		System.out.print("Enter a character: ");
		c=sc.next().charAt(0);
		
		System.out.print("\nEnter a byte: ");
		b=sc.nextByte();

		System.out.print("\nEnter a short: ");
		s=sc.nextShort();

		System.out.print("\nEnter an integer: ");
		i=sc.nextInt();

		System.out.print("\nEnter a float: ");
		f=sc.nextFloat();

		System.out.print("\nEnter a double: ");
		d=sc.nextDouble();

		System.out.print("\nEnter a boolean: ");
		k=sc.nextBoolean();
		
		System.out.print("\nEnter a string word: ");
		st1=sc.next();
		
		System.out.print("\nEnter a string text: ");
		st2=in.nextLine();
		
		System.out.println("\nchar: "+c+"\n"+
						   "string word: "+st1+"\n"+
						   "string text: "+st2+"\n"+
				  		   "byte: "+b+"\n"+
				  		   "short: "+s+"\n"+
				  		   "int: "+i+"\n"+
				  		   "float: "+f+"\n"+
				  		   "double: "+d+"\n"+
				  		   "boolean: "+k+"\n");
		
		sc.close();
		in.close();
		
	}

}
