class A
{
	void showA()
	{
		System.out.println("I'm the Parent class");
	}
	protected int x=6;
}

class B extends A
{
	void showB()
	{
		System.out.println("I'm the Child class");
	}
}

public class Single_Inheritance 
{
	public static void main(String[] args) 
	{
		B obj=new B();
		obj.showA();
		obj.showB();
		System.out.println(obj.x);
	}
}
