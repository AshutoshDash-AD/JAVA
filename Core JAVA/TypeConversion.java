public class TypeConversion 
{
	public static void main(String[] args) 
	{	
		byte b;
		int i;
		long l;
		double d;
		float f;
		char ch;
		String s;
		
		System.out.println("IMPLICIT TYPE CONVERSION\n");
			
		b=-127;
		i=b;
		System.out.println("byte to int: "+i);
		
		i=5;
		l=i;
		System.out.println("int to long: "+l);
		
		d=i;
		System.out.println("int to double: "+d);
		
		l=34;
		f=l;
		System.out.println("long to float: "+f);
		
		f=3.122f;
		d=f;
		System.out.println("float to double: "+d);
		
		ch='q';
		i=ch;
		System.out.println("char to int (ASCII VALUE): "+i);
		
		System.out.println("\nEXPLICIT TYPE CONVERSION\n");
		
		d=56.5;
		i=(int)d;
		System.out.println("double to int: "+i);
		
		d=23.1234599;
		f=(float)d;
		System.out.println("double to float: "+f);
		
		l=999999999;
		i=(int)l;
		System.out.println("long to int: "+i);
		
		f=78.5599f;
		l=(long)f;
		System.out.println("float to long: "+l);
		
		f=97.99f;
		ch=(char)f;
		System.out.println("float to char: "+ch);
		
		i=98;
		ch=(char)i;
		System.out.println("int to char: "+ch);
		
		ch='M';
		s=Character.toString(ch);
		System.out.println("char to String: "+s);
		
		s="abc";
		ch=s.charAt(1);
		System.out.println("char at String index1: "+ch);
		
		i=812;
		s=Integer.toString(i);
		System.out.println("int to String: "+s);
		
		s="789";
		i=Integer.parseInt(s);
		System.out.println("String to int: "+i);
		
		s="45.123";
		d=Double.parseDouble(s);
		System.out.println("String to double: "+d);
	}
}
